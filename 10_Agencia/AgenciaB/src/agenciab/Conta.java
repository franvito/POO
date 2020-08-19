package agenciab;
import java.util.ArrayList;

public class Conta {

    private float saldo;
    private int num;
    private ArrayList<Operacao> extrato;
    
    
    public Conta(int num){
        
        this.num = num;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
        extrato.add(new Operacao("abertura", 0, 0));
        
    }
    
    public void depositar(float n){
        if(n > 0){
        this.saldo = saldo + n;;
        extrato.add(new Operacao("deposito", n, saldo));
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public void tarifa(float n){
        if(n > 0){
        this.saldo = saldo - n;
        extrato.add(new Operacao("tarifa", n*(-1), saldo));
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public void saque(float n){
        if(saldo+n < 0)
            System.out.println("Saldo Insuficiente!");
        
        if(n > 0){
            this.saldo = saldo - n;;
            extrato.add(new Operacao("saque", n*(-1), saldo));
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public void extrato(){
        for(int i = 0; i < extrato.size(); i++){
            System.out.println(i +" " + this.extrato.get(i)+"\n");
        }
    }
    
    public void extratoN(int n){
        if(n <= extrato.size()){
            for(int i = 1; i < n+1; i++){
                System.out.println(extrato.size()-i +" " + this.extrato.get(extrato.size()-i)+"\n");
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
            
            this.saldo = saldo - extrato.get(i).valor;
            extrato.add(new Operacao("extorno", extrato.get(i).valor*(-1), saldo));
            
        }else{
            System.out.println("O indice " + i + " não é uma tarifa!");
        }
        
    }
    
    public String toString(){
        
        return "Conta: " + num + " Saldo: " + saldo;  
        
    }
}
