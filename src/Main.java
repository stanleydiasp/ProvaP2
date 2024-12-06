import Ex1.TesteData;
import Ex2.TestePessoa;
import Ex3.TesteUniversidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha qual exercício deseja rodar:");
            System.out.println("1 - Exercício 1: TesteData");
            System.out.println("2 - Exercício 2: TestePessoa");
            System.out.println("3 - Exercício 3: TesteUniversidade");
            System.out.println("0 - Sair");
            System.out.print("Digite a sua opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Rodando o TesteData (Exercício 1):");
                    TesteData.main(null);
                }
                case 2 -> {
                    System.out.println("Rodando o TestePessoa (Exercício 2):");
                    TestePessoa.main(null);
                }
                case 3 -> {
                    System.out.println("Rodando o TesteUniversidade (Exercício 3):");
                    TesteUniversidade.main(null);
                }
                case 0 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
