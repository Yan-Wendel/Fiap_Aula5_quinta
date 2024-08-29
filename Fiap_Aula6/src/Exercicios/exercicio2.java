package Exercicios;
import java.util.Scanner;
public class exercicio2 {
/*Faça um programa que peça dois números e imprima o maior deles, e informe caso
	eles sejam iguais.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1,num2;
		System.out.print("Digite um numero: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo: ");
		num2 = ler.nextInt();
		//verifica os dados.
		if( num1 > num2 ) {
			System.out.print("O primeiro foi maior " + num1);
	}
		if(num2>num1) {
			System.out.print("O segundo foi maior " + num2);
		}
		if(num1==num2) {
			System.out.print("Valores iguais.");
		}
		}
}