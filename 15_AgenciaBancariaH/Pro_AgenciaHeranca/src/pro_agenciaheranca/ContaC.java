package pro_agenciaheranca;

public class ContaC extends Conta{
    
    public ContaC(int id, String idCliente) {
        super(id, idCliente);
        this.type = "CC";
    }

    @Override
    public void attMensal() {
        this.saldo = saldo - 20;
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
