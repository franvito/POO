package projetocarro;

import java.util.ArrayList;

public class Carro {
    
    public int pass, maxPass, km, gas, maxGas;
    
    ArrayList<Pessoa> passageiros;
    
    public Carro(){

        this.maxPass = 5;
        this.passageiros = new ArrayList<>();
        for(int i = 0; i < this.maxPass; i++){
            this.passageiros.add(null);
        }
        
    }
    
    public void drive(){
        
        if(this.passageiros.get(0) == null){
            System.out.println("Não tem motorista!");
            return;
        }if(this.passageiros.get(0) != null && this.passageiros.get(0).getIdade() >= 18){
            System.out.println("Estou dirigindo!");
        }else{
            System.out.println("Você não tem idade para dirigir!");
        }
    }
    
    public void in(Pessoa pessoa, int ind){
        
        if(ind < 0 || ind > maxPass){
            System.out.println("Esse lugar não existe!");
            return;
        }if(this.passageiros.get(ind) != null){
            System.out.println("Já tem alguém!");
            return;  
        }
        this.passageiros.set(ind, pessoa);
    }
    
    public void out(String nome){
        
        for(int i = 0; i < this.passageiros.size(); i++){
            if(this.passageiros.get(i) != null && passageiros.get(i).getNome().equals(nome)){
                this.passageiros.set(i, null);
                break;
            }
        }
    }
    
    public String toString(){
        String saida = "[--O--|----]\n";
        saida += this.passageiros.get(0) + " | " +this.passageiros.get(1) + "\n";
        saida += this.passageiros.get(2) + " " +this.passageiros.get(3) + " " +
        this.passageiros.get(4);
        return saida;
    }
    
}
