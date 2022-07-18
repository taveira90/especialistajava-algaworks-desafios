import java.util.Scanner;

public class EstruturaDoWhile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroDigitado = 0;
		int somaPares = 0;
		int somaImpares = 0;
		char opcao;
		
		do {
			System.out.print("Digite um número: ");
			numeroDigitado = scanner.nextInt();
			
			if (numeroDigitado % 2 == 0) {
				somaPares += numeroDigitado;
			} else {
				somaImpares += numeroDigitado;
			}
			
			System.out.print("Deseja digitar outro? (s/n): ");
			opcao = scanner.next().charAt(0);
			
		} while (opcao == 's');
		
		System.out.printf("A soma dos números pares é: %d%n", somaPares);
		System.out.printf("A soma dos números impares é: %d%n", somaImpares);
		
		scanner.close();
	}
}

