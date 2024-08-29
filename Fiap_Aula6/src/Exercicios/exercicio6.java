package Exercicios;
import java.util.Scanner;
public class exercicio6 {
/*Faça um programa que receba o ano de nascimento da pessoa e retorne:
▪ Se o voto é obrigatório este ano;
▪ Se o voto é opcional este ano;
▪ Se o voto é proibido este ano.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anonacido;
		int anoatual = 2024;
		
		System.out.print("Digite seu ano de nacimento: ");
		anonacido = ler.nextInt();
		//calculo de idade.
		int idade = anoatual - anonacido;
		
		if(idade < 16 ) {
			System.out.print("Proibido vota.");
		} else if(idade >= 16 && idade < 18 || idade >= 70) {
			System.out.print("voto opicional.");
		} else if(idade >= 18 && idade < 70) {
			System.out.print("Voto obrigatorio.");
		} 

	}

}
