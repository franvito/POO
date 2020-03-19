package projetolapiseira;

public class Grafite {

    static Object gra;
    //VARIAVEIS
    private float ponta;
    private int tamanho;
    
    //METODO CONSTRUTOR
    
    public Grafite(){
        
    }
    
    public Grafite(float ponta, int tamanho){
        this.ponta = ponta;
        this.tamanho = tamanho;
    }
    
    //METODOS GET E SET
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(int t){
        this.tamanho = t;
    }
    
}
