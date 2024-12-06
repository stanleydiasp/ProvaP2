package Ex3;


public class TesteUniversidade {
    public static void main (String[] args) {

        Pessoa einstein = new Pessoa("Albert Einstein", 14, 03, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 04, 01, 1643);

        Universidade princeton = new Universidade("Princeton", einstein);
        Universidade cambridge = new Universidade("Cambridge", newton);

        System.out.println("### Informações sobre " + einstein.informaNome() + " ###");
        System.out.println("Einsten trabalhou como professor de física na Universidade de " + einstein.informaUniversidade() + ", nos Estados Unidos.");

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("### Informações sobre " + newton.informaNome() + " ###");
        System.out.println("Newton trabalhou como professor de matemática na universidade de " + newton.informaUniversidade() + ", na Inglaterra.");


    }
}
