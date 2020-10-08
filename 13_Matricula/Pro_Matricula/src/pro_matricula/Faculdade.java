package pro_matricula;
import java.util.TreeMap;

public class Faculdade {
    
    TreeMap<String, Aluno> alunos;
    TreeMap<String, Cadeira> cadeiras;
    
    public Faculdade(){
        alunos = new TreeMap<>();
        cadeiras = new TreeMap<>();
    }
    
    public void addAluno(String id){
        
        if(alunos.containsKey(id))
            return;
        
        alunos.put(id, new Aluno(id));
        
    }
    
    public void addCadeira(String id){
        
        if(cadeiras.containsKey(id))
            return;
        
        cadeiras.put(id, new Cadeira(id));
        
    }
    
    public void listar(){
        System.out.println("Alunos: ");
        for(Aluno alu : alunos.values()){
            System.out.println(alu);
        }
        System.out.println("Cadeiras: ");
        for(Cadeira cad : cadeiras.values()){
            System.out.println(cad);
        }
        
    }
    
    public void matricular(String idAlu, String idCad){
        
        Aluno alu = alunos.get(idAlu);
        Cadeira cad = cadeiras.get(idCad);
        
        if(alu != null && cad != null){
            alu.matricularCad(cad);
        }
        
    }
    
    public void desmatricular(String idAlu, String idCad){
        
        Aluno alu = alunos.get(idAlu);
        Cadeira cad = cadeiras.get(idCad);
        
        if(alu != null && cad != null){
            alu.desmatricularCad(cad);
        }
        
    }
    
    public void retirarAlu(String id){
        Aluno alu = alunos.get(id);
        if(alu != null){
            for(Cadeira cad : cadeiras.values()){
                if(cadeiras.containsValue(cad)){
                    cad.desmatricularAlu(alu);
                }
            }
            alunos.remove(id);   
        }
        
    }
    
    
}
