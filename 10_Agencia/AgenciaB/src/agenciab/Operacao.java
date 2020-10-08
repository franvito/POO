package agenciab;

public class Operacao {

    public int id;
    public String desc;
    public float valor;
    public float saldo;
    
    public Operacao(int id, String desc, float valor, float saldo){
        this.id = id;
        this.desc = desc;
        this.valor = valor;
        this.saldo = saldo;
        
    }
    
    public String toString(){
        return ": "+desc+": "+valor+": "+saldo;
    }
    
}
