package Ex1;

public class TesteData {
    public static void main(String[] args) {
        System.out.println("Data da máquina / Construtor sem parâmetros");
        Data dataMaquina = new Data();
        System.out.println(dataMaquina);
        System.out.println("------------------------------------------------------------------");

        System.out.println("Testando fevereiro, caso seja instanciado 30 dias (Data inválida)");
        Data data1 = new Data(30, 2, 2024);
        System.out.println(data1);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Testando fevereiro / Considerei que fevereiro sempre terá 28 dias.");
        Data data2 = new Data(20, 2, 2024);
        System.out.println(data2);

        System.out.println("Avançando 10 dias a partir do dia 20 e mudando de mês");
        data2.aumentarDias(10);
        System.out.println(data2);

        System.out.println("Retrocedendo 100 dias e mudando de ano");
        data2.retrocederDias(100);
        System.out.println(data2);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Testando agosto");
        Data data3 = new Data(10, 8, 2024);
        System.out.println(data3);

        System.out.println("Avançando 32 dias a partir do dia 10 e mudando de mês");
        data3.aumentarDias(32);
        System.out.println(data3);

        System.out.println("Retrocedendo 1500 dias e também retrocedendo de ano");
        data3.retrocederDias(1500);
        System.out.println(data3);


    }
}