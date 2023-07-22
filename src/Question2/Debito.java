package Question2;

public class Debito extends Cartao {
    private Conta conta;
    private double saldo;

    public Debito(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void saldo() {
        System.out.println();
        System.out.println("Seu saldo é R$: "+saldo);
        System.out.println();
    }


    @Override
    public void set(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void sacar(double valor) {
        if (saldo <= 0){
            System.out.println();
            System.out.println("Você não tem limite suficiente");
            System.out.println();
        }else {
            if (valor > saldo || valor > conta.valorAprovado()){
                System.out.println();
                System.out.println("Você não pode realizar essa transação");
                System.out.println();
            }else{
                System.out.println();
                System.out.println("Transação realizada com sucesso");
                System.out.println();
                saldo -= valor;
            }
        }
    }

}