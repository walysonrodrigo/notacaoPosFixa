package notacaoPosFixa;

public class Teste {
	public static void main(String args[]) {
		Pilha teste = new Pilha(20);
		teste.inserirValor(121);
		teste.inserirValor(122);
		teste.inserirValor(123);
		teste.inserirValor(124);
		teste.inserirValor(125);
		teste.inserirValor(126);
		Object impressao = teste.pop();
		Object impressaao = teste.pop();
		Object stringRetorno = teste.converteString();
		System.out.print(impressaao);
		System.out.print(stringRetorno);
	}
}
