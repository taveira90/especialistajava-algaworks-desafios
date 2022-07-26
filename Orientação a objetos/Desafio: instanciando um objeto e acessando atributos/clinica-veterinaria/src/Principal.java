public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Rottweiler";
        cachorro1.sexo = "Macho";
        cachorro1.idade = 6;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Lessie";
        cachorro2.raca = "Border Collie";
        cachorro2.sexo = "Fêmea";
        cachorro2.idade = 7;

        System.out.println("---------------------------------------------");

        System.out.println("Cachorro 1: ");
        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Raça: %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %s%n", cachorro1.idade);

        System.out.println("---------------------------------------------");

        System.out.println("Cachorro 2: ");
        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %s%n", cachorro2.idade);
    }
}
