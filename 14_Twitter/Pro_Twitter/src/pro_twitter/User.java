package pro_twitter;
import java.util.ArrayList;
import java.util.TreeMap;

public class User {

    public String username;
    public int nextId;
    public int naoLidos;
    
    TreeMap<String, User> usuarios;
    
    ArrayList<Tweet> timeline;
    ArrayList<Tweet> myTweets;
    
    
    TreeMap<String, User> seguidos;
    TreeMap<String, User> seguidores;
    
   public User(){
       usuarios = new TreeMap<>(); 
   }
    
    public User(String username){
        this.username = username;
        //this.nextId = 0;
        this.naoLidos = 0;
        timeline = new ArrayList<>();
        myTweets = new ArrayList<>();
        seguidos = new TreeMap<>();
        seguidores = new TreeMap<>();  
        
    }
    
    public void addUser(String username){
       
        if(usuarios.containsKey(username))
            return;
        usuarios.put(username, new User(username));
        
    }
    
    public void follow(User other){
            if(seguidos.containsKey(other.username)){
                return;
            }    
            seguidos.put(other.username, other);
            other.seguidores.put(this.username, this);
            System.out.println("Segudido com sucesso!");
    }
    
    public void twitar(String username, String msg){
        
        this.timeline.add(new Tweet(nextId, username, msg));
        for(User u : seguidores.values()){
            u.timeline.add(new Tweet(nextId, username, msg));
        }
        nextId+=1;
        System.out.println("sucesso");
    }
    
    public void getTimeline(User user){
        for(int i = 0; i < user.timeline.size();i++){
            System.out.println(user.timeline.get(i));
        }
    }
    
    public void darLike(int idTw){
        for(int i = 0; i < timeline.size();i++){
            if(timeline.get(i).idTw == idTw){
                this.timeline.get(i).darLike(this);
                System.out.println("likado");
            }
        }
    }
    
    public void listarUsuarios(){
        for(User use : usuarios.values()){
            System.out.println(use);  
        }
    }
    
    public String toString(){
        String saida = username + " \n";
        saida += "Seguidores [";
        for(User seguidores : seguidores.values())
            saida += seguidores.username + " ";
        saida += "] \n";
        saida += "Seguidos [";
        for(User seguidos : seguidos.values())
            saida += seguidos.username + " ";
        return saida + "]";
    }
    
}
