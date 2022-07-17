import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDePagamento {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		//entrada.nextLine;
    	
    	System.out.print("Valor por hora: ");
    	double valorHora = entrada.nextDouble();
    	
    	System.out.print("Horas trabalhadas: ");
    	int horasTrabalhadas = entrada.nextInt();
    	
    	System.out.print("Valor dos descontos: ");
    	double valorDescontos = entrada.nextDouble();
    	
    	double totalBruto = horasTrabalhadas * valorHora;
    	double totalLiquido = totalBruto - valorDescontos;
    	
    	System.out.printf("Folha de pagamento: %s%n", nome);
    	System.out.printf("%d x R$%.2f = %.2f%n", horasTrabalhadas, valorHora, totalBruto);
		System.out.printf("R$%.2f%n", valorDescontos);
		System.out.printf("Total devido: %.2f%n", totalLiquido);
		    	
	}
}
