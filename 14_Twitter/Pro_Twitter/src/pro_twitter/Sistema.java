package pro_twitter;

import java.util.TreeMap;

public class Sistema {

    TreeMap<String, User> usuarios;
    
    public int nextId;
    
    public Sistema(){
       this.nextId = 0;
       usuarios = new TreeMap<>(); 
   }
    
    public void addUser(String username){
       
        if(usuarios.containsKey(username))
            return;
        usuarios.put(username, new User(username));
        
    }
    
    public void Twitar(String username, String msg){
        Tweet tw = new Tweet(nextId, username, msg);
        nextId+=1;
        this.usuarios.get(username).twitar(tw);
    }
    
    public void listarUsuarios(){
        for(User use : usuarios.values()){
            System.out.println(use);  
        }
    }
    
}
