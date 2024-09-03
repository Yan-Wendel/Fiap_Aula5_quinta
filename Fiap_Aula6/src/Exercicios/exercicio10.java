package Exercicios;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salario;
		float valoraumentado;
		float salafinal;
		float percentual = 0;
		System.out.print("Digite o seu salario: ");
		salario = ler.nextFloat();
		if(salario <= 280.00) {
			percentual=20;
		} else if (salario <= 700.00) {
			percentual=15;
		} else if(salario <= 1500.00) {
			percentual=10;
		} else {
			percentual=5;
		}
		valoraumentado = salario + percentual/100;
		salafinal=salario + valoraumentado;
		
		 System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
	        System.out.printf("Percentual de aumento aplicado: %.2f%%%n", percentual);
	        System.out.printf("Valor do aumento: R$ %.2f%n", valoraumentado);
	        System.out.printf("Novo salário após o aumento: R$ %.2f%n", salafinal);
	}
}
