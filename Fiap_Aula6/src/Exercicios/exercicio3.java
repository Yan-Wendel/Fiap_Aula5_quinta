package Exercicios;
import java.util.Scanner;
public class exercicio3 {
/*Faça um programa para a leitura de quatro notas parciais de um aluno. O programa
	deve calcular a média alcançada pelo aluno e apresentar:*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float nota1,nota2,nota3,nota4;
		System.out.print("Digite um numero: ");
		nota1 = ler.nextFloat();
		System.out.print("Digite o segundo: ");
		nota2 = ler.nextFloat();
		System.out.print("Digite o terceiro: ");
		nota3 = ler.nextFloat();
		System.out.print("Digite o quarto: ");
		nota4 = ler.nextFloat();
		//Calculo da nota.
		float notaf= (nota1+nota2+nota3+nota4)/4;	
		//Condição.
		if(notaf>=7) {
			System.out.print("Aprovad0!");
		if(notaf <=5 && notaf <7) 
			System.out.print("Recuperação!");
		}
		else System.out.print("Reprovado");
		System.out.print("\nMedia: "+notaf);
	}
}
