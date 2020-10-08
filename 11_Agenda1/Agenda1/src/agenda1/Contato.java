package agenda1;
import java.util.ArrayList;
import java.lang.Comparable;

public class Contato implements Comparable<Contato>{
    
    String nome;
    ArrayList<Fone> fones;
    
    public Contato(String nome){
        this.nome = nome;
        fones = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }

    public String toString(){
        String saida = "- " + this.nome;
        if(fones.size() > 0)
            saida += " ";
        for(int i = 0; i < this.fones.size(); i++)
            saida += "[" + i + ":" + this.fones.get(i) + "]";
        return saida;
    }
    
    public void addFone(String id, String number){
        if(Fone.validar(number))
            this.fones.add(new Fone(id, number));
        else
            System.out.println("Fone inválido!");
    }
    
    public void remvFone(int id){
        if(id < 0 || id >= fones.size())
            return;
        
        this.fones.remove(id);
    }
    
    public int compareTo(Contato other){
        return this.nome.compareTo(other.nome);
    }

}