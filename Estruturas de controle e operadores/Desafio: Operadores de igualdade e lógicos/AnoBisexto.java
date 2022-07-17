import java.util.Locale;
import java.util.Scanner;

public class AnoBisexto {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = scanner.nextInt();
		
		if (ano % 400 == 0 || ano % 4 == 0) {
			System.out.printf("%d é Bisexto.%n", ano);
		} else {
			System.out.printf("%d não é bisexto.%n", ano);
		}
		
		scanner.close();
	}
}
