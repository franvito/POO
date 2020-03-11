package s02e01_intro;

public class Carro {
  
    //VARIAVEIS
    public int maxPessoa;
    public int numPessoa;
    public float gasolina;
    public float maxGasolina;
    public float odometro;
    
    //METODO CONSTRUTOR
    public Carro(){
  
    }
    
    public Carro(int maxPessoa, int numPessoa, float gasolina, float maxGasolina, float odometro){
        this.maxPessoa = maxPessoa;
        this.numPessoa = numPessoa;
        this.gasolina = gasolina;
        this.maxGasolina = maxGasolina;
        this.odometro = odometro;
    }
    
    //METODOS ESPECIAIS
    public int getMaxpessoa(){
        return this.maxPessoa;
    }
    public void setMaxpessoa(int mxp){
        this.maxPessoa = mxp;
    }
    public float getGasolina(){
        return this.gasolina;
    }
    public void setGasolina(float g){
        this.gasolina = g;
    }
    public int getNumpessoa(){
        return this.numPessoa;
    }
    public void setNumpessoa(int np){
        this.numPessoa = np;
    }
    public float getMaxgasolina(){
        return this.maxGasolina;
    }
    public void setMaxgasolina(float mxg){
        this.maxGasolina = mxg;
    }
    public float getOdometro(){
        return this.odometro;
    }
    public void setOdometro(float o){
        this.odometro = o;
    }
    
    //METODOS
    public void abastecer(float add){
        if(this.getGasolina()>this.getMaxgasolina()){
            System.out.println("Desperdicio!");
        }else{
            this.setGasolina(this.getGasolina()+add); 
            System.out.println("Abastecido!");
        }    
    }
    public void embarcar(int pe){
        if((this.getNumpessoa()+pe)>this.getMaxpessoa()){
            System.out.println("Lotado");
        }else if((this.getNumpessoa()+pe)<=this.getMaxpessoa()){
            this.setNumpessoa(this.getNumpessoa()+ pe);
            System.out.println("Embarcou!");
        }
    }
    public void desembarcar(int pes){
        if(this.getNumpessoa()==0){
            System.out.println("Não tem ninguém");
        }else if(this.getNumpessoa()<pes){
            System.out.println("Não tem esse tanto de pessoas!");
        }else if(this.getNumpessoa()>=pes){
            this.setNumpessoa(this.getNumpessoa()-pes);
            System.out.println("Desembarcou!");
        } 
    }
        public void dirigir(int km){
        if((this.getNumpessoa()<=0&&this.getGasolina()>=0)||this.getNumpessoa()<=0){
            System.out.println("Não tem quem dirija!");
        }else if(this.getGasolina()<=km){
            System.out.println("Não tem gasolina!");
        }else if(this.getNumpessoa()>0&&this.getGasolina()>0){
            this.setGasolina(this.getGasolina()-km);
            this.setOdometro(this.getOdometro()+km);
        }
    }
    public void status(){
        System.out.println("Status: ");
        System.out.println("Máximo de Pessoas: "+this.getMaxpessoa());
        System.out.println("Número de Pessoas: "+this.getNumpessoa());
        System.out.println("Máximo de Gasolina: "+this.getMaxgasolina());
        System.out.println("Gasolina Atual: "+this.getGasolina());
        System.out.println("Odometro: "+this.getOdometro());
    }

    
    
}
