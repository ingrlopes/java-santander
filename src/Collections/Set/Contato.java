package Collections.Set;
import java.util.Objects;

public class Contato {

    // Atributos
    private String nome;
    private int numero;

    // Construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    public int hashCode() {
        return Objects.hash(getNome());
    }

    public String toString() {
        return "(" + nome + '\''
                + numero + ")";
    }
}