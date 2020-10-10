package pro_agenciaheranca;

public abstract class Conta {
    
    public int id;
    public float saldo;
    public String idCliente;
    public String type;
    
    public Conta(int id, String idCliente){
        this.id = id;
        this.idCliente = idCliente;
        this.saldo = 0;
    }
    
    abstract public void attMensal();
    abstract public void sacar(float valor);
    abstract public void depositar(float valor);
    abstract public void transferir(Conta other, float valor);
    
    public String toString(){
        return id + ":" + idCliente + ":" + saldo + ":" + type;
    }
}
