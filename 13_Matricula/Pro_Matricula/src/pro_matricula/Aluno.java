package pro_matricula;
import java.util.TreeMap;

public class Aluno {
    
    public String idAlu;
    TreeMap<String, Cadeira> cad_m;
    
    public Aluno(String id){
        
        this.idAlu = id;
        cad_m = new TreeMap<String, Cadeira>();
        
    }
    
    public void matricularCad(Cadeira cad){
        
        if(cad_m.containsKey(cad.idCad)){
            return;
        }
        cad_m.put(cad.idCad, cad);
        cad.matricularAlu(this);
        System.out.println("Cadeira matrículada com sucesso!");
        
    }
    
    public void desmatricularCad(Cadeira cad){
        
        if(cad_m.containsKey(cad.idCad)){
            cad_m.remove(cad.idCad);
            cad.desmatricularAlu(this);
            System.out.println("Cadeira removida com sucesso!");
        }

        return;
        
    }
    
    
    public String toString(){
        String saida = this.idAlu + " [ ";
        for(Cadeira cad : cad_m.values())
            saida += cad.idCad+ " ";
        return saida + "]";
    }     
}
