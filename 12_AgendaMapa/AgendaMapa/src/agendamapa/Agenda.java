package agendamapa;

import java.util.Collection;
import java.util.TreeMap;

public class Agenda {

TreeMap<String ,Contato> contato;
TreeMap<String ,Contato> favoritos;
    
    public Agenda(){
        contato = new TreeMap<>();
        favoritos = new TreeMap<>();
    }
    
    //CONTATOS NORMAIS
    
    public void addContato(String nome){
        contato.put(nome ,new Contato(nome));
        
    }
    
    public void rmvContato(String nome){
        Contato conta = contato.get(nome);
        if(conta != null){
            contato.remove(nome);
        if(conta.favorited = true)
            favoritos.remove(nome);
        }else{
            System.out.println("O contato ou número não existe!");
        }
    }
    
    public void agenda(){
        for(Contato conta : contato.values()){
            System.out.println(conta);
            //for(Contato fav : favoritos.values()){
              //  System.out.println(fav);
            //}
        }
    }
    
    public void search(String pro){
        
        for(Contato conta : contato.values()){
            if(conta.toString().contains(pro))
                System.out.println(conta);
        }
        
    }
    
    //FAVORITOS
    
    public void favoritar(String id){
        
        Contato contatos = contato.get(id);
        
        if(contatos == null){
            System.out.println("Esse contato não existe!");
            return;
        }if(contatos.favorited.equals(true)){
            System.out.println("Já foi favoritado!");
            return;   
        }
        contatos.favorited = true;
        favoritos.put(id, contatos);
        favoritos.get(id).pri= "@";
        System.out.println("Favoritado com sucesso!");
    }
    
    public void desfavoritar(String id){
        
        Contato contatos = contato.get(id);
        
        if(contatos == null){
            System.out.println("Esse contato não existe!");
            return;
        }if(contatos.favorited.equals(false)){
            System.out.println("Ele não é um favorito!");
            return;   
        }
        favoritos.remove(id);
        System.out.println("Desfavoritado!");
    }
    
    public void favoritos(){
        for(Contato fav : favoritos.values()){
            System.out.println(fav);
        }
    }
    
}
