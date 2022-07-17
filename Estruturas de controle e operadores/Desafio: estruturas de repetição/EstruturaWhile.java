import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaNumeros = 0;
		
		while (somaNumeros < 100) {
			System.out.print("Digite um número: ");
			int numeroDigitado = scanner.nextInt();
			somaNumeros += numeroDigitado;
		}
		
		System.out.printf("Soma dos números: %d%n", somaNumeros);
		
		scanner.close();
	}
}
