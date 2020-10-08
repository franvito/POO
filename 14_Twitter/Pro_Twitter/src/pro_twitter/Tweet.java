package pro_twitter;
//import java.util.ArrayList;
import java.util.TreeMap;

public class Tweet {
    
    TreeMap<String, User> likes;
    
    public int idTw;
    public String username;
    public String msg;
    
    public Tweet(int idTw, String username, String msg){
        this.idTw = idTw;
        this.username = username;
        this.msg = msg;
        likes = new TreeMap<>();
    }
    
    public void darLike(User username){
            if(likes.containsKey(username.username)){
                return;
            }else{
                likes.put(username.username, username);
            }   
    }
    
    public String toString(){
        String saida = idTw + ":" + username + "( " + msg + ") "+ "[ "; 
        for(User l : likes.values())
            saida+= l.username + " ";
        return saida + " ]";
            
    }
    
}
