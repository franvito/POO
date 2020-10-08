package agenda1;
import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    
    ArrayList<Contato> contato;
    
    public Agenda(){
        contato = new ArrayList<>();
    }
    
    public Contato getCont(String conta){
        for(int i = 0; i < contato.size(); i++){
            if(contato.get(i).nome.equals(conta))
               return contato.get(i);
        }
        return null;
    }
    
    public void addContato(String nome){
        contato.add(new Contato(nome));
        Collections.sort(contato);
    }
    
    public void rmvContato(String nome){
        for(int i = 0; i < contato.size(); i++){
            if(contato.get(i).nome.equals(nome))
               contato.remove(i);
        }
        System.out.println("O contato ou número não existe!");
    }
    
    public void agenda(){
        for(int i = 0; i < contato.size(); i++){
            System.out.println(contato.get(i));
        }
    }
    
    public void search(String pro){
        
        for(Contato conta : contato){
            if(conta.toString().indexOf(pro) != -1)
                System.out.println(conta);
        }
        
    }
    
}
