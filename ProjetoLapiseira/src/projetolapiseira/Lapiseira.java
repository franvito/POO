package projetolapiseira;

public class Lapiseira {
    
    //Grafite grafite;
    
    //VARIAVEIS
    private String marca;
    private int capacidade;
    private int borracha;
    private boolean pontaExposta;
    Grafite gra = new Grafite(); 
   
    //METODO CONSTRUTOR
    public Lapiseira(){
        this.setCapacidade(1);
    }
    public Lapiseira(String marca, int capacidade, int borracha, boolean pontaExposta){
       //Grafite gra = new Grafite(); 
       this.marca = marca;
       this.capacidade = capacidade;
       this.borracha = borracha;
       this.pontaExposta = pontaExposta;
    }
   
    //METODOS GET E SET
    public String getMarca(){
       return this.marca;
    }
    public void setMarca(String m){
       this.marca = m;
    }
   
    public int getCapacidade(){
       return this.capacidade;
    }
    public void setCapacidade(int c){
       this.capacidade = c;
    }
    public int getBorracha(){
       return this.borracha;
    }
    public void setBorracha(int b){
       this.borracha = b;
    }
    public boolean getPontaExposta(){
       return this.pontaExposta;
    }
    public void setPontaExposta(boolean pe){
       this.pontaExposta = pe;
    }
   
    //METODOS
    public void escrever(int esc){
        //Grafite gra = new Grafite();
        if(esc<=gra.getTamanho()&&this.getPontaExposta()==true){
            gra.setTamanho(gra.getTamanho() -esc);
            System.out.println("Estou escrevendo!");
        }else if(esc>gra.getTamanho()&&this.getPontaExposta()==true){
            System.out.println("Não consigo escrever tudo!");   
        }else if(gra.getTamanho()==0){
            System.out.println("A ponta acabou!");
        }else if(this.getPontaExposta()==false){
            System.out.println("A ponta está guardada!");
        }
    }
    
    public void apagar(int ap){
        if(ap<=this.getBorracha()){
            this.setBorracha(this.getBorracha()-ap);
            System.out.println("Estou apagando!");
        }else if(ap>this.getBorracha()){
            System.out.println("Não consigo apagar tudo.");
        }else if(this.getBorracha()==0){
            System.out.println("Não tem borracha.");
        }
    }
    public void exporPonta(){
        this.setPontaExposta(true);
    }
    public void guardarPonta(){
       this.setPontaExposta(false);
    }
    public void status(){
        System.out.println("Marca da Lapiseira: "+ this.getMarca());
        System.out.println("Ponta do Grafite: "+ gra.getPonta());
        System.out.println("Capacidade de Grafite: "+ this.getCapacidade());
        System.out.println("Quantidade de Borracha: "+ this.getBorracha());
        System.out.println("Tamanho da Ponta: "+ gra.getTamanho());
        if(this.getPontaExposta()==true){
            System.out.println("A ponta está exposta.");
        }else if(this.getPontaExposta()==false){
            System.out.println("A ponta está guardada.");
        }
        
    }
   
}
