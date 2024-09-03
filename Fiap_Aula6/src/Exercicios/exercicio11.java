package Exercicios;
import java.util.Scanner;
public class exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 System.out.println("Digite o código do estado de origem da carga (1 a 5):");
	        int codigoEstado = ler.nextInt();
	        
	        // Solicita o peso da carga em toneladas
	        System.out.println("Digite o peso da carga do caminhão em toneladas:");
	        double pesoCargaToneladas = ler.nextDouble();
	        
	        System.out.println("Digite o código da carga (10 a 40):");
	        int codigoCarga = ler.nextInt();
	        
	        // Converte o peso da carga para quilos
	        double pesoCargaQuilos = pesoCargaToneladas * 1000;
	        
	     // Determina o preço por kg baseado no código da carga
	        double precoPorKg;
	        if (codigoCarga >= 10 && codigoCarga <= 20) {
	            precoPorKg = 100.00;
	        } else if (codigoCarga >= 21 && codigoCarga <= 30) {
	            precoPorKg = 250.00;
	        } else {
	            precoPorKg = 340.00;
	        }

	        // Calcula o preço da carga
	        double precoCarga = pesoCargaQuilos * precoPorKg;
	        
	     // Determina a porcentagem de imposto com base no código do estado
	        double percentualImposto;
	        switch (codigoEstado) {
	            case 1:
	                percentualImposto = 0.35;
	                break;
	            case 2:
	                percentualImposto = 0.25;
	                break;
	            case 3:
	                percentualImposto = 0.15;
	                break;
	            case 4:
	                percentualImposto = 0.05;
	                break;
	            case 5:
	                percentualImposto = 0.00;
	                break;
	            default:
	                percentualImposto = 0.00; // Este caso não deve ocorrer devido à validação anterior
	                break;
	        }

	        // Calcula o valor do imposto
	        double valorImposto = precoCarga * percentualImposto;

	        // Calcula o valor total transportado (carga + impostos)
	        double valorTotal = precoCarga + valorImposto;

	        // Exibe os resultados
	        System.out.printf("Peso da carga convertido em quilos: %.2f kg%n", pesoCargaQuilos);
	        System.out.printf("Preço da carga: R$ %.2f%n", precoCarga);
	        System.out.printf("Valor do imposto: R$ %.2f%n", valorImposto);
	        System.out.printf("Valor total transportado pelo caminhão: R$ %.2f%n", valorTotal);


	}

}
