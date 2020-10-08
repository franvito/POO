package agenciab;
import java.util.ArrayList;

public class Conta {
    
    private int nextId;
    private float saldo;
    private int num;
    private ArrayList<Operacao> extrato;
    
    
    public Conta(int num){
        this.nextId = 0;
        this.num = num;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
        extrato.add(new Operacao(nextId, "abertura", 0, 0));
        nextId+=1;
        
        
    }
    
    private void addOP(String label, float valor){
        saldo+= valor;
        Operacao operacao = new Operacao(nextId, label, valor, saldo);
        nextId+= 1;
        extrato.add(operacao);
        
    }
    
    public void depositar(float n){
        if(n > 0){
        addOP("deposito", n);
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public void tarifa(float n){
        if(n > 0){
         addOP("tarifa", -n);
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public void saque(float n){
        if(saldo-n < 0){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        
        if(n > 0){
             addOP("saque", -n);
        }else{
            System.out.println("Valor Inválido!");
        }
        }
    
    
    public void extrato(){
        for(int i = 0; i < extrato.size(); i++){
            System.out.println(this.extrato.get(i).id +" " + this.extrato.get(i)+"\n");
        }
    }
    
    public void extratoN(int n){
        if(n <= extrato.size()){
            for(int i = 1; i < n+1; i++){
                System.out.println(this.extrato.get(extrato.size()-i).id +" " + this.extrato.get(extrato.size()-i)+"\n");
            }
        }else{
            System.out.println("Não tem isso tudo!");
        }
    }
    
    public void extorno(int i){
        
        if(i > extrato.size()-1){
            System.out.println("O indice " + i + " é inválido!");
            return;
        }
        if(extrato.get(i).desc.equals("tarifa")){
            
            
            addOP("extorno", -extrato.get(i).valor);
            
            
        }else{
            System.out.println("O indice " + i + " não é uma tarifa!");
        }
        
    }
    
    public String toString(){
        
        return "Conta: " + num + " Saldo: " + saldo;  
        
    }
}
