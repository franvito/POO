package pro_agenciaheranca;

public class ContaP extends Conta{
    
    public ContaP(int id, String idCliente) {
        super(id, idCliente);
        this.type = "CP";
    }

    @Override
    public void attMensal() {
        this.saldo = saldo + (saldo*1/100);
    }

    @Override
    public void sacar(float valor) {
        if(this.saldo == 0 || (this.saldo - valor) < 0){
            System.out.println("Saldo insuficiente");
        }
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(float valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(Conta other, float valor) {
        if(this.saldo == 0 || (this.saldo - valor) < 0){
            System.out.println("Saldo insuficiente");
        }
        this.saldo = saldo - valor;
        other.saldo = other.saldo + valor;
    }
    
}
