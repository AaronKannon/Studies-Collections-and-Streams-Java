package collections.exercise;

public class Pessoa implements Comparable<Pessoa>{

    private final String nome;
    private final String sobrenome;
    private final Integer idade;

    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getHashCodeName() {
        return this.getNome().hashCode();
    }

    @Override
    public String toString() {
        return nome + " - " + sobrenome + " - " + idade;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }
}
