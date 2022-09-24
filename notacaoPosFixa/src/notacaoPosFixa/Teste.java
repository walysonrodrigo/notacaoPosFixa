package notacaoPosFixa;

import java.util.Scanner;

public class Teste {
	public static void main(String args[]) {
		
		Calculadora calculadora = new Calculadora();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva sua expressão já em notação polênsa ou pos fixa");
		String expressao = entrada.nextLine();
		System.out.println("O resultado é: " + calculadora.executar(expressao)); 
        
		entrada.close();
	}
}
