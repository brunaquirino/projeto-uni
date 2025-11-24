public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, String cpf, int matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade() {
        System.out.println(getNome() + ", sua mensalidade é R$ 500,00.");
    }
}