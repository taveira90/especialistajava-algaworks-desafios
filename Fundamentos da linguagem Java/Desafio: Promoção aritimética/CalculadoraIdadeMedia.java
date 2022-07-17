public class CalculadoraIdadeMedia {
	
	public static void main(String[] args) {
		int idade1 = 30;
		int idade2 = 40;
		int idade3 = 60;
		
		float idadeMedia = (idade1 + idade2 + idade3) / 3f;
		// havia alterado o tipo da variável idade3 para float, porém o código mostra que a solução seria apenas acrescentar o f ao 3 da divisão
		
		System.out.println("Idade média: " + idadeMedia);
	}
}
