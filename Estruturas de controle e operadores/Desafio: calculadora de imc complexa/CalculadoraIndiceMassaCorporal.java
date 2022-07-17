import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Peso: ");
		int peso = scanner.nextInt();
		
		System.out.print("Altura: ");
		double altura = scanner.nextDouble();
		
		System.out.print("Sexo (M / F): ");
		char sexo = scanner.next().charAt(0);
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.1f%n", imc);
		
		if (sexo == 'm') {
			if (imc < 20.7) {
				System.out.println("Abaixo do peso.");
			} else if (imc >= 20.7 && imc < 26.4) {
				System.out.println("Peso ideal.");
			} else if (imc >= 26.4 && imc < 27.8) {
				System.out.println("Um pouco acima do peso.");
			} else if (imc >=27.8 && imc < 31.1) {
				System.out.println("Acima do peso ideal.");
			} else {
				System.out.println("Obeso.");
			}
		} else if (sexo == 'f') {
			if (imc < 19.1) {
				System.out.println("Abaixo do peso.");
			} else if (imc >= 19.1 && imc < 25.8) {
				System.out.println("Peso ideal.");
			} else if (imc >= 25.8 && imc < 27.3) {
				System.out.println("Um pouco acima do peso.");
			} else if (imc >=27.3 && imc < 32.3) {
				System.out.println("Acima do peso ideal.");
			} else {
				System.out.println("Obeso.");
			}	
		}
				
		scanner.close();
	}
}
