package notacaoPosFixa;

public class Validacao {
	public static void validar(String expressao){
        String array[] = expressao.trim().split("\\s");
        
        operadoresIniciais(array);
        ultimoElemento(array);
        validarElementos(array);
    }

	private static void ultimoElemento(String[] array){
	        int size = array.length;
	        if(!naoNumerico(array[size-1])){
	            throw new IllegalArgumentException("O último elemento deve ser um operador.");
	        }
	    }
	
	private static void operadoresIniciais(String[] array){
        for(int i = 0; i < 2; i++){
            if(naoNumerico(array[i])){
                throw new NumberFormatException("Os dois primeiros elementos precisam ser numeros.");
            }
        }
    }

   

    public static void validarElementos(String[] array){
        int numeros = 0;
        int operadores = 0;
        for(String elemento : array){
            if(naoNumerico(elemento)){
                operadores++;
            } else if(!naoNumerico(elemento)){
                numeros++;
            }
        }

        if(operadores != numeros-1){
            throw new RuntimeException("Quantidade inválida de números e/ou operadores");
        }
    }

    private static boolean naoNumerico(String ch){
        if (ch == null){ return true; }
        try {
            Float.parseFloat(ch);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }


}
