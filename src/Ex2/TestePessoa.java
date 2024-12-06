package Ex2;


public class TestePessoa {
    public static void main(String[] args) {

        //Instanciando a data de nascimento do Einsten com a data errada
        Pessoa albertEinsten = new Pessoa("Albert Einsten", 20, 01, 1699);

        //Ajustando a data de nascimento do Einsten para a correta
        albertEinsten.ajustaDataNascimento(14, 03, 1879);
        albertEinsten.calculaIdade();
        System.out.println("### " + albertEinsten.informaNome() + " ###");
        System.out.println("Se estivesse vivo hoje, teria: " + albertEinsten.informaIdade() + " anos de idade");

        System.out.println("-----------------------------------------------");
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 04, 01, 1643);
        isaacNewton.calculaIdade();
        System.out.println("### " + isaacNewton.informaNome() + " ###");
        System.out.println("Se estivesse vivo hoje, teria: " + isaacNewton.informaIdade() + " anos de idade");

    }
}