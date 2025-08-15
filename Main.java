import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        // Lista de alunos cadastrados
        Aluno[] alunos = {
            new Aluno("Caio Guerra", "G9210J0"),
            new Aluno("Pedro Lima", "G899HE2"),
            new Aluno("Pedro Matias", "R074ID9"),
            new Aluno("Daniel Augusto", "G959833"),
            new Aluno("Marcela Santos", "G967AH1"),
            new Aluno("Yasmin Fogaça", "G9843H8")
        };

        System.out.print("Digite o nome do aluno: ");
        String nomeDigitado = sc.nextLine();

        boolean encontrado = false;

        // Procura aluno pelo nome (ignora maiúsculas/minúsculas)
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nomeDigitado)) {
                System.out.println("\nAluno encontrado:");
                a.exibirDados();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nNenhum aluno encontrado com o nome informado.");
        }

        sc.close();
    }
}