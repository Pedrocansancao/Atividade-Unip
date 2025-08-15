public class Pessoa {
String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }
}