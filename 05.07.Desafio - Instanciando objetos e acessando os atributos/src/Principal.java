
public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Bartolomeu";
        cachorro1.raca = "Vira Lata";
        cachorro1.sexo = "Macho";
        cachorro1.idade = 12;

        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "Pichula";
        cachorro2.raca = "Vira Lata";
        cachorro2.sexo = "Fêmea";
        cachorro2.idade = 9;

        System.out.println("Nome do cachorro 1: " + cachorro1.nome);
        System.out.println("Raça do cachorro 1: " + cachorro1.raca);
        System.out.println("Sexo do cachorro 1: " + cachorro1.sexo);
        System.out.println("Idade do cachorro 1: " + cachorro1.idade);

        System.out.println("====================================");

        System.out.println("Nome do cachorro 2: " + cachorro2.nome);
        System.out.println("Raça do cachorro 2: " + cachorro2.raca);
        System.out.println("Sexo do cachorro 2: " + cachorro2.sexo);
        System.out.println("Idade do cachorro 2: " + cachorro2.idade);


    }
}
