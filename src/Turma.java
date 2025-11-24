import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    void adicionarAluno(Aluno novoAluno){
        alunos.add(novoAluno);
    }

    void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a.getNome());
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
