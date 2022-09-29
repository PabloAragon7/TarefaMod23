import java.util.List;

public class Pessoa {

    private String nome;

    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public List pessoagenero(){

        Pessoa pessoa1 = new Pessoa("Ricardo", "masculino");
        Pessoa pessoa2 = new Pessoa("Maria", "feminino");
        Pessoa pessoa3 = new Pessoa("Caio", "masculino");
        Pessoa pessoa4 = new Pessoa("Célia", "feminino");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);



    }

}

