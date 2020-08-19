package agenciab;

public class Operacao {

    public String desc;
    public float valor;
    public float saldo;
    
    public Operacao(String desc, float valor, float saldo){
        
        this.desc = desc;
        this.valor = valor;
        this.saldo = saldo;
        
    }
    
    public String toString(){
        return ": "+desc+": "+valor+": "+saldo;
    }
    
}
