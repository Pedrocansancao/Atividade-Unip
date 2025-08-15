public class Aluno extends Pessoa {
  String ra;

    public Aluno(String nome, String ra) {
        super(nome);
        this.ra = ra;
    }

    public String getRA() {
        return ra;
    }

    public void exibirDados() {
        super.exibirNome();
        System.out.println("RA: " + ra);
    }
}
