package notacaoPosFixa;

public class Calculadora {
	
	private static Pilha pilha = new Pilha(200);
	
	public float executar(String exemplo) {
		String operacao [] = exemplo.trim().split("\\s");
		
		for(int i = 0; i < operacao.length; i++) {
			if(ehOperador(operacao[i])) {
				calcula(operacao[i]);
			} else {
				pilha.inserirValor(Float.parseFloat(operacao[i]));
            }
		}
		
		return (float) pilha.ultimo();
	}
	
	public boolean ehOperador(String operador) {
		
		String operadores[] = {"+", "-", "*", "/"};
		
		for(int i = 0; i < operadores.length; i++){
            if(operadores[i].equals(operador)) { 
                return true; 
            }   
        }
		
		return false;
	}
	
	private static void calcula(String operador){
        Float ultimo    = (Float)pilha.ultimo();
        Float penultimo = (Float)pilha.penultimo();
        Float valorFinal = null;
        
        if(operador.equals("+")) {
            valorFinal = penultimo + ultimo;
        } else if(operador.equals("-")) {
            valorFinal = penultimo - ultimo;
        } else if(operador.equals("*")) {
        	valorFinal = penultimo * ultimo;
        } else if(operador.equals("/")) {
            valorFinal = penultimo / ultimo;
        }

        pilha.pop();
        pilha.pop();
        pilha.inserirValor(valorFinal);
    }
	
}
