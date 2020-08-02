package projetopulapula;
import java.util.LinkedList;

public class Trampoline {

    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;
    
    private Kid remove_kid(String name, LinkedList<Kid> _list){
        for(int i = 0; i < _list.size(); i++)
            if(_list.get(i).getName().equals(name))
                _list.remove(i);
        return null;    
    }
    
    public Trampoline(){
        waiting = new LinkedList<>();
        playing = new LinkedList<>();
    }
    
    public void arrive(Kid kid){
        waiting.addFirst(kid);
    }
    
    public void in(){
        playing.addFirst(waiting.getLast());
        waiting.removeLast();
    }
    
    public void out(){
        waiting.addFirst(playing.getLast());
        playing.removeLast();
    }
    
    public Kid remove(String name){
        Kid kid = remove_kid(name, playing);
        if(kid != null)
            return kid;
        kid = remove_kid(name, waiting);
        if(kid != null)
            return kid;
        return null;
    }
    
    public String toString(){
        
        String saida = "=> ";
        for(Kid kid : waiting)
            saida += kid + " ";
        saida += "=> ";
        for(Kid kid : playing)
            saida += kid + " ";
        return saida;
    }

}