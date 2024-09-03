package Exercicios;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	//variaveis
		int km,litro;
		int resul = 0;
		System.out.print("Digite a distancia percorida: ");
		km = ler.nextInt();
		System.out.print("Digite os litros usado: ");
		litro = ler.nextInt();
		
		resul = km / litro;
		
		if(resul < 8) {
			System.out.print("Esse carro bebe hein!");
		} else if(resul >= 8) {
			System.out.print("Autonomia legal");
		}
	}

}
