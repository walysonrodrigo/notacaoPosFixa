package notacaoPosFixa;

public class Pilha{
	private Object array[];
	private int posicao;
	
	public Pilha(int quantidade) {
        this.array = (Object[]) new Object[quantidade];
        this.posicao = -1;
    }
	
	
	public boolean vazio(){
        return this.posicao == -1;
    }
	 
	public int getTamanho() {
        return this.posicao+1;
    }
	
	public Object inserirValor(Object valor) {
		this.array[this.posicao+1] = valor;
		this.posicao++;
		
		return this.array;
    }
	 
	public Object pop(){
        if(!vazio()){
        	
        	var ultimoValor        = this.array[this.posicao];
        	int posicaoArrayAntigo = this.posicao;
			Object arrayAtual[]    = this.array;
			this.array 		   	   = (Object[]) new Object[this.array.length];
			this.posicao  		   = -1;
			
        	for(int i = 0; i < posicaoArrayAntigo ; i++) {
        		
        		if(i != posicaoArrayAntigo) {
        			inserirValor(arrayAtual[i]);
        		}
        	}
        	
        	return ultimoValor;
    	}
        return null; 
    }
	
	 
	public Object penultimo(){
        if(!vazio()){ 
        	return this.array[this.posicao - 1];
    	}
        return null; 
    }
 
	public Object ultimo(){
        if(!vazio()){ 
        	return this.array[this.posicao];
    	}
        return null; 
	}
	
    public String converteString() {
        String retorno  = "";
        
        for(int i = 0; i < this.posicao+1; i++){
        	retorno += (this.array[i]);
        	if(i < this.posicao) {
        		retorno += (", ");        		
        	}
        	
        }

        return retorno;
    }
}
