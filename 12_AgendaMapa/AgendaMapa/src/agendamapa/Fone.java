package agendamapa;

public class Fone {
    
    public String id;
    public String number;
    
    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }
    
    public String toString(){
        return id + ":" + number;
    }
    
    public static boolean validar(String number){
        
        String validos = "0123456789().-";
        
        for(int i = 0; i < number.length();i++){
            char c = number.charAt(i);
            if(validos.indexOf(c) == -1)
                return false;
        }
        return true;
    }
    
}
