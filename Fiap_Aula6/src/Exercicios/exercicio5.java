package Exercicios;
import java.util.Scanner;
/*Escreva um algoritmo que recebe dois números e um caractere (representando uma
das operações matemáticas (+, -, *, /)*/
public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b;
		System.out.print("Digite um numero: ");
		a = ler.nextInt(); 
		System.out.print("Digite a operaçao: ");
		char cal = ler.next().charAt(0);
		System.out.print("Digite o segundo: ");
		b = ler.nextInt();
		//calculo
		int resultado = 0;
		if(cal == '+') {
			resultado = a + b;
		} else if(cal == '-') {
			resultado = a-b;
		} else if(cal == '*') {
			resultado = a*b;
		} else if(cal == '/') {
			resultado = a/b;
		}
		System.out.print("Resultado: "+ resultado);
	}
//alteração
}
