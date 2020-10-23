package pro_twitter;
import java.util.ArrayList;
import java.util.TreeMap;

public class User {

    public String username;
    public int naoLidos;
    
    ArrayList<Tweet> timeline;
    ArrayList<Tweet> myTweets;
    
    TreeMap<String, User> seguidos;
    TreeMap<String, User> seguidores;
    
    public User(String username){
        this.username = username;
        this.naoLidos = 0;
        timeline = new ArrayList<>();
        myTweets = new ArrayList<>();
        seguidos = new TreeMap<>();
        seguidores = new TreeMap<>();  
        
    }
    
    public void follow(User other){
            if(seguidos.containsKey(other.username)){
                return;
            }    
            seguidos.put(other.username, other);
            other.seguidores.put(this.username, this);
            System.out.println("Seguido com sucesso!");
    }
    
    public void twitar(Tweet tw){
        
        this.timeline.add(tw);
        this.naoLidos+= 1;
        for(User u : seguidores.values()){
            u.timeline.add(tw);
            u.naoLidos+=1;
        }
        System.out.println("sucesso");
    }
    
    public void getTimeline(User user){
        if(naoLidos == 0)
            System.out.println("Timeline vazia!");
        for(int i = user.timeline.size() - user.naoLidos; i < user.timeline.size();i++){
            System.out.println(user.timeline.get(i));
            naoLidos = 0;
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
