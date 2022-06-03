package calculadora;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Calculadora\n");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Matematica math = new Matematica();
		
		System.out.println("Digite 1 para adição");
		System.out.println("Digite 2 para subtração");
		System.out.println("Digite 3 para multiplicação");
		System.out.println("Digite 4 para divisão");
		System.out.print("Digite aqui: ");
		int operator = sc.nextInt();
		System.out.println();
		
		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.print("Digite um número: ");
		int num2 = sc.nextInt();
		System.out.println();
		
		switch (operator){
		case 1:
			math.somar(num1, num2);
			break;
		case 2:
			math.subtracao(num1, num2);
			break;
		case 3:
			math.multiplicacao(num1, num2);
			break;
		case 4:
			math.divisao(num1, num2);
			break;
		default: 
			System.out.println("Você não escolheu nenhum operador");
		}
	}
}