package Ex3;


public class Universidade {

    private String nome;

    public Universidade(String nome, Pessoa professor) {
        this.nome = nome;
        professor.setUniversidade(this);
    }

    public String getNome() {
        return nome;
    }


}
