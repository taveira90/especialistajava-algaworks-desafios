import java.util.Scanner;

public class EstruturaWhileIntermediario {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numeroDigitado = scanner.nextInt();
		int numeroInvertido = 0;
		int numeroOriginal = numeroDigitado;
		
		while (numeroDigitado > 0) {
			int resto = numeroDigitado % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			numeroDigitado /= 10;	
		}
		
		System.out.printf("O número %d ao contrário fica: %d%n", numeroOriginal, numeroInvertido);
		
		scanner.close();
	}
}


// necessita da variável numeroOriginal porque ao fim da excecução a variável numeroDigitado assume o valor 0.
