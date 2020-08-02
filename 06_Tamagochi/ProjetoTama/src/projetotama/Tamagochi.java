package projetotama;

public class Tamagochi {
    //VARIAVEIS
    private int diamantes;
    private int idade;
    private int energia, saciedade,limpeza;
    private int maxEnergia, maxSaciedade, maxLimpeza;
    private boolean vivo;
    
    //METODO CONSTRUTOR
    public Tamagochi(){

    }
    
    public Tamagochi(int maxEnergia, int maxSaciedade, int maxLimpeza){
        this.maxEnergia = maxEnergia;
        this.maxSaciedade = maxSaciedade;
        this.maxLimpeza = maxLimpeza;
        this.setEnergia(this.getMaxEnergia());
        this.setSaciedade(this.getMaxSaciedade());
        this.setLimpeza(this.getMaxLimpeza());
        this.setDiamantes(0);
        this.setIdade(0);
        this.setVivo(true);
    }
    
    //METODOS GET E SET
    public void setDiamantes(int d){
        this.diamantes = d;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setEnergia(int e){
        this.energia = e;
    }
    public void setSaciedade(int s){
        this.saciedade = s;
    }
    public void setLimpeza(int l){
        this.limpeza = l;
    }
    public void setMaxEnergia(int me){
        this.maxEnergia = me;
    }
    public void setMaxSaciedade(int ms){
        this.maxSaciedade = ms;
    }
    public void setMaxLimpeza(int ml){
        this.maxLimpeza = ml;
    }
    public void setVivo(boolean v){
        this.vivo = v;
    }
    
    public int getDiamantes(){
        return this.diamantes;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getSaciedade(){
        return this.saciedade;
    }
    public int getEnergia(){
        return this.energia;
    }
    public int getLimpeza(){
        return this.limpeza;
    }
    public int getMaxSaciedade(){
        return this.maxSaciedade;
    }
    public int getMaxEnergia(){
        return this.maxEnergia;
    }
    public int getMaxLimpeza(){
        return this.maxLimpeza;
    }
    public boolean getVivo(){
        return this.vivo;
    }
    
    
}
