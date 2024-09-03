package Exercicios;
import java.util.Scanner;
public class exercicio12 {
/*Faça um programa que leia 3 valores que representam os lados de um triângulo A, B
e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior
dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com
base nos seguintes casos:*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        // Solicita ao usuário os três lados do triângulo
        System.out.println("Digite o valor do lado A:");
        double A = ler.nextDouble();

        System.out.println("Digite o valor do lado B:");
        double B = ler.nextDouble();

        System.out.println("Digite o valor do lado C:");
        double C = ler.nextDouble();
     // Ordena os lados em ordem decrescente
        if (B > A) {
            double temp = A;
            A = B;
            B = temp;
        }
        if (C > A) {
            double temp = A;
            A = C;
            C = temp;
        }
        if (C > B) {
            double temp = B;
            B = C;
            C = temp;
        }
     // Verifica se os lados formam um triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verifica o tipo de triângulo
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verifica se o triângulo é equilátero ou isósceles
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
	}
}
