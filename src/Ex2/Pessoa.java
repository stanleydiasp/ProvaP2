package Ex2;

import Ex1.Data;
import java.time.LocalDate;

public class Pessoa {

    private int idade;

    private String nome;

    private Data dataDeNascimento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataDeNascimento = new Data(dia, mes, ano);
    }

    public void calculaIdade() {
        LocalDate dataAtual = LocalDate.now();

        int idadeCalculada = dataAtual.getYear() - this.dataDeNascimento.getAno();

        if (dataAtual.getMonthValue() < this.dataDeNascimento.getMes() || (dataAtual.getMonthValue() == this.dataDeNascimento.getMes() && dataAtual.getDayOfMonth() < this.dataDeNascimento.getDia()))
            idadeCalculada--;

        this.idade = idadeCalculada;
    }


    public int informaIdade() {
        return this.idade;
    }

    public String informaNome() {
        return this.nome;
    }

    public void ajustaDataNascimento(int dia, int mes, int ano) {
        this.dataDeNascimento.setDia(dia);
        this.dataDeNascimento.setMes(mes);
        this.dataDeNascimento.setAno(ano);
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

}
