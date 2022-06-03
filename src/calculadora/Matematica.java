package calculadora;

import java.util.Scanner;

public class Matematica {
	
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	
		public void somar(int num1, int num2) {
			
		int soma = num1 + num2;
		System.out.println("Resultado: " + num1 + " + " + num2 + " = " + soma);
		
	}
		public void subtracao(int num1, int num2) {
			
		int soma = num1 - num2;
		System.out.println("Resultado: " + num1 + " - " + num2 + " = " + soma);
		
	}
		public void multiplicacao(int num1, int num2) {
		
		int soma = num1 * num2;
		System.out.println("Resultado: " + num1 + " x " + num2 + " = " + soma);
		
	}
		public void divisao(int num1, int num2) {
		
		int soma = num1 / num2;
		System.out.println("Resultado: " + num1 + " / " + num2 + " = " + soma);
		
	}
	
}
