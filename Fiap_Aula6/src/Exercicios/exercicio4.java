package Exercicios;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 // Solicita ao usuário os dois valores inteiros
        System.out.println("Digite o valor de A:");
        int A = ler.nextInt();

        System.out.println("Digite o valor de B:");
        int B = ler.nextInt();

        // Verifica se A e B são múltiplos
        if (A % B == 0 || B % A == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }
	}

}
