public class Regular extends Aluno {

    public Regular(String nome, int idade, String cpf, int matricula) {
        super(nome, idade, cpf, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " (Aluno Regular), pagando mensalidade cheia.");
    }
}