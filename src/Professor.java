public class Professor extends Pessoa {

    private String centro;

    public Professor(String nome, int idade, String cpf, String centro) {
        super(nome, idade, cpf);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }
    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula() {
        System.out.println(getNome() + " está dando aula no centro " + centro + ".");
    }
}