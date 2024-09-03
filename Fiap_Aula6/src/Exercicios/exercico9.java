package Exercicios;
import java.util.Scanner;
public class exercico9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tipo de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoCliente = ler.nextInt();

        // Verifica se o tipo de cliente é válido
        if (tipoCliente < 1 || tipoCliente > 3) {
            System.out.println("Tipo de cliente inválido.");
            ler.close();
            return;
        }

        // Solicita o consumo de energia em kWh
        System.out.println("Digite o consumo de energia em kWh:");
        double consumo = ler.nextDouble();

        // Declara a variável para armazenar o valor do KW/h
        double valorKW;

        // Define o valor do KW/h com base no tipo de cliente
        switch (tipoCliente) {
            case 1:
                valorKW = 0.60;
                break;
            case 2:
                valorKW = 0.48;
                break;
            case 3:
                valorKW = 1.29;
                break;
            default:
                // Embora já tenha sido validado, o default é uma segurança adicional
                System.out.println("Tipo de cliente inválido.");
                ler.close();
                return;
        }

        // Calcula o valor da conta
        double valorConta = consumo * valorKW;

        // Exibe o valor da conta de luz
        System.out.printf("O valor da conta de luz é: R$ %.2f%n", valorConta);
	}

}
