package Ex3;

import Ex1.Data;
import java.time.LocalDate;

public class Pessoa {

    private int idade;

    private String nome;

    private Data dataDeNascimento;

    private Universidade universidade;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataDeNascimento = new Data(dia, mes, ano);
    }

    public void calculaIdade() {
        LocalDate dataAtual = LocalDate.now();

        int anoAtual = dataAtual.getYear();
        int idade = anoAtual - dataDeNascimento.getAno();

        this.idade = idade;
    }

    public int informaIdade() {
        return this.idade;
    }

    public String informaNome() {
        return this.nome;
    }

    public String informaUniversidade() {
        return universidade.getNome();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

}
