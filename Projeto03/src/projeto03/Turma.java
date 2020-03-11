package projeto03;

public class Turma {
    Pessoa pessoa;
    
    //VARIAVEIS
    private String disciplina;
    private String professor;
    private int vagas;
    private int sala;
    private int bloco;
    
    //METODOS CONSTRUTORES
    public Turma(){
        
    }
    public Turma(String disciplina, String professor, int vagas, int sala, int bloco){
        this.disciplina = disciplina;
        this.professor = professor;
        this.vagas = vagas;
    }
    
    //METODOS GET E SET
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(String d){
        this.disciplina = d;
    }
    
    public int getVagas(){
        return this.vagas;
    }
    public void setVagas(int v){
        this.vagas = v;
    }
    
    
    
    //METODOS
    public void cadastrarProfessor(){
        
    }
    
    public void cadastrarAluno(){
        
    }
    
    
    
    
    
}
