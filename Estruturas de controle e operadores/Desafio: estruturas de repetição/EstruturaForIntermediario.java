import java.util.Scanner;

public class EstruturaForIntermediario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		int numeroDigitado = scanner.nextInt();
		boolean numeroPrimo = true;
		
		for (int contador = 2; contador < numeroDigitado; contador++) {
			if (numeroDigitado % contador == 0) {
				numeroPrimo = false;
				break;
			} 
		} 
		
		if (numeroPrimo && numeroDigitado > 1) {
			System.out.printf("O número %d é um número primo.%n", numeroDigitado);
		} else {
			System.out.printf("O número %d não é um número primo.%n", numeroDigitado);		
		}
		
		scanner.close();
	}
}
