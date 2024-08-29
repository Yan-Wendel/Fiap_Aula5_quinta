package Exercicios;
import java.util.Scanner;
public class exercicio1 {
//Faça um programa que leia um número, e informe se ele é par ou impar.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.print("Digite um numero: ");
		num = ler.nextInt();
		
		if(num % 2==0) {
			System.out.print("O numero "+ num + " é par.");	
		}
		else {
			System.out.print("O numero "+ num + " é impar.");
		}
	}

}