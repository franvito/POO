package agendamapa;

import java.util.ArrayList;

public class Contato {
    
    String pri;
    String nome;
    Boolean favorited;
    ArrayList<Fone> fones;
    
    public Contato(String nome){
        this.pri = "-";
        this.nome = nome;
        this.favorited = false;
        fones = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        String saida = this.pri + this.nome;
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
    
}
