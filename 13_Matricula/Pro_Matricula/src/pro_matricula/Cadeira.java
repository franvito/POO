package pro_matricula;
import java.util.Iterator;
import java.util.TreeMap;

public class Cadeira {
    
    public String idCad;
    TreeMap<String, Aluno> alu_m;
    
    public Cadeira(String id){
        
        this.idCad = id;
        alu_m = new TreeMap<String, Aluno>();
        
    }
    
    public void matricularAlu(Aluno alu){
        
        if(alu_m.containsKey(alu.idAlu)){    
            return;
        }
        alu_m.put(alu.idAlu, alu);
        alu.matricularCad(this);
        System.out.println("Aluno matrículado com sucesso!");
        
    }
    
    public void desmatricularAlu(Aluno alu){
        
        if(alu_m.containsKey(alu.idAlu)){
            alu_m.remove(alu.idAlu);
            alu.desmatricularCad(this);
            System.out.println("Aluno removido com sucesso!");
        }
        
        return;
        
    }
    
    @Override
    public String toString(){
        String saida = this.idCad + " [ ";
        for(Aluno alu : alu_m.values())
            saida += alu.idAlu + " ";
        return saida + "]";
    }
    
}
