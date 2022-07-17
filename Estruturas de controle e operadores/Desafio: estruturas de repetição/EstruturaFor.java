import java.util.Scanner;

public class EstruturaFor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroAtual;
		int somaNumeros = 0;
		
		System.out.println("Digite 10 números pares: ");
		for (int contador = 1; contador <= 10;) {
			System.out.printf("%d/10: ", contador);
			numeroAtual = scanner.nextInt();
			if (numeroAtual % 2 == 0) {
				somaNumeros += numeroAtual;
			} else {
				System.out.printf("O número %d não é par. Digite números pares.%n", numeroAtual);
				continue;
			}
			contador++;
		}
		
		System.out.printf("Soma dos números digitados: %d%n", somaNumeros);
		
		scanner.close();
	}
}
