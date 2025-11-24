public class Bolsista extends Aluno {

    public Bolsista(String nome, int idade, String cpf, int matricula) {
        super(nome, idade, cpf, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista e está isento de mensalidade.");
    }
}