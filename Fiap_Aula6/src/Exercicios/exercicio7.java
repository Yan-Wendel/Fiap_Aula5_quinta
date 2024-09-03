package Exercicios;

public class exercicio7 {

	public static void main(String[] args) {
		 int a = 5;
	        int b = 7;
	        int c = 4;
	        int d = 8;
	        
	        // Avaliando as expressões lógicas
	        
	        // Expressão A: (a <= b) e (b < d)
	        boolean expressaoA = (a <= b) && (b < d);
	        System.out.println("Expressão A: " + expressaoA);
	        
	        // Expressão B: (a = b) ou (c != b)
	        // Nota: Em Java, usamos '==' para comparação de igualdade, não '='.
	        boolean expressaoB = (a == b) || (c != b);
	        System.out.println("Expressão B: " + expressaoB);
	        
	        // Expressão C: (d > a) e (c >= b)
	        boolean expressaoC = (d > a) && (c >= b);
	        System.out.println("Expressão C: " + expressaoC);
	        
	        // Expressão D: (a <= b) ou (c <= d)
	        boolean expressaoD = (a <= b) || (c <= d);
	        System.out.println("Expressão D: " + expressaoD);
	        
	        // Expressão E: ((b > c) ou (c < a)) e (d <= b)
	        boolean expressaoE = ((b > c) || (c < a)) && (d <= b);
	        System.out.println("Expressão E: " + expressaoE);

	}

}
