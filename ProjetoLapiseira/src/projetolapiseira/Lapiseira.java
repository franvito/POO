package projetolapiseira;

public class Lapiseira {
    
    
    Grafite gra = new Grafite();
    //VARIAVEIS
    private String marca;
    private int borracha;
    private boolean pontaExposta;
     
   
    //METODO CONSTRUTOR
    public Lapiseira(){
        
    }
    public Lapiseira(String marca, int capacidade, int borracha, boolean pontaExposta){
       //Grafite gra = new Grafite(); 
       this.marca = marca;
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
    
    public void inserirPonta(Grafite gra){
        if(this.gra.getTamanho()==0){
            this.gra = gra;
            
            System.out.println("Estou dentro!");
        }else{
             System.out.println("Já tem um Grafite!");
             }
    }
    
    public void escrever(int esc){
        
        if(esc<=this.gra.getTamanho()&&this.getPontaExposta()==true){
            this.gra.setTamanho(this.gra.getTamanho()-esc);
            System.out.println("Estou escrevendo!");
        }else if(esc>this.gra.getTamanho()&&this.getPontaExposta()==true){
            System.out.println("Não consigo escrever tudo!");   
        }else if(this.gra.getTamanho()==0){
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
        System.out.println("Quantidade de Borracha: "+ this.getBorracha());
        System.out.println("Tamanho da Ponta: "+ gra.getTamanho()+" cm");
        if(this.getPontaExposta()==true){
            System.out.println("A ponta está exposta.");
        }else if(this.getPontaExposta()==false){
            System.out.println("A ponta está guardada.");
        }
        
    }
   
}
