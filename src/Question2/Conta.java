package Question2;

public class Conta {
    private boolean ativate = true;
    private double valorAprovado;

    private String nomeUser;

    public Conta(String nomeUser, double valorAprovado) {
        this.valorAprovado = valorAprovado;
        this.nomeUser = nomeUser;
    }

    public boolean isAtivate() {
        return ativate;
    }

    public void setAtivate(boolean ativate) {
        this.ativate = ativate;
    }

    public double valorAprovado() {
        return valorAprovado;
    }
}