import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("N685", "Programação Orientada a Objetos", 1);
        Disciplina d2 = new Disciplina("N683", "Raciocínio Lógico Alogorítmico", 1);
        Disciplina d3 = new Disciplina("N680", "Matemática para Computação", 1);

        Regular r1 = new Regular("João Silva", 21, "555.555.555-55", 22233);
        Regular r2 = new Regular("Maria de Souza", 19, "057.888.787-85", 22937);
        Bolsista b1 = new Bolsista("Gabriel Campos", 18, "055.222.333-75", 22528);

        Professor p = new Professor ("Pasquales Lerolero", 40, "058.888.923-86", "Fortaleza");

        Visitante v1 = new Visitante("Ana Banana", 25, "057.738.847-37");
        Visitante v2 = new Visitante("Sílvio Santos", 80, "057.738.847-37");

        Turma t1 = new Turma("12A", d1, p);
        Turma t2 = new Turma("14B", d2, p);
        Turma t3 = new Turma("15D", d3, p);

        t1.adicionarAluno(r1);
        t1.adicionarAluno(r2);
        t1.adicionarAluno(b1);

        t2.adicionarAluno(r1);
        t2.adicionarAluno(r2);
        t2.adicionarAluno(b1);

        t3.adicionarAluno(r1);
        t3.adicionarAluno(r2);
        t3.adicionarAluno(b1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo! Por favor, digite o número correspondente à turma:\n");
        System.out.println("\n1: Turma1");
        System.out.println("\n2: Turma2");
        System.out.println("\n3: Turma3");

        int opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Turma 1:\nCódigo: " + t1.getCodigo() +
                        "\nNome da Disciplina: " + d1.getNome() +
                        "\nNome do Professor: " + p.getNome() +
                        "\nLista de alunos matriculados nesta turma:");
                t1.listarAlunos();
                break;

            case 2:
                System.out.println("Turma 2:\nCódigo: " + t2.getCodigo() +
                        "\nNome da Disciplina: " + d2.getNome() +
                        "\nNome do Professor: " + p.getNome());
                t2.listarAlunos();
                break;

            case 3:
                System.out.println("Turma 3:\nCódigo: " + t3.getCodigo() +
                        "\nNome da Disciplina: " + d3.getNome() +
                        "\nNome do Professor: " + p.getNome());
                t3.listarAlunos();
                break;

            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("\nDEMONSTRAÇÃO DE FUNCIONALIDADES ADICIONAIS DO CÓDIGO");

        System.out.println("\n1. Professor dando aula:");
        p.darAula();

        System.out.println("\n2. Pagamento de mensalidades:");
        r1.pagarMensalidade();
        r2.pagarMensalidade();
        b1.pagarMensalidade();

        System.out.println("\n3. Aniversário do aluno:");
        r1.fazerAniversario();

        System.out.println("\n4. Visitantes cadastrados:");
        System.out.println("- " + v1.getNome() + ", " + v1.getIdade() + " anos");
        System.out.println("- " + v2.getNome() + ", " + v2.getIdade() + " anos");

        scanner.close();
    }
}