package avaliacao.exe1;

/**
 *CLASSE TODO
 * @author jrica
 */
public class Pessoa {
    private String nome;
    private String idade;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String idade, Endereco endereco) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + '}';
    }
    
}
