package aula5a;
public class ContaBanco {
    //variaveis
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    
    //Metodos construtor
    public ContaBanco(){ 
    }
    public ContaBanco(int numConta, String tipo, String dono, int saldo, boolean status){
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        
        
    }
    //Metodos Especiais
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }
   public String getTipo(){
       return this.tipo;
   }
   public void setTipo(String t){
       this.tipo = t;
   }
   public String getDono(){
       return this.dono;
   }
   public void setDono(String d){
       this.dono = d;
   }
   public int getSaldo(){
       return this.saldo;
   }
   public void setSaldo(int s){
       this.saldo = s;
   }
   public boolean getStatus(){
       return this.status;
   }
   public void setStatus(boolean st){
       this.status = st;
   }
   
   //Metodos
   public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
       if(t.equals("cc")){
           this.setSaldo(50);
       }else if(t.equals("cp")){
           this.setSaldo(150);
       }
       
   }
   public void fecharConta(){
        if(this.getSaldo() > 0){
           System.out.println("Conta com saldo positivo, não posso fechar.");
        }else if(this.getSaldo() < 0){
           System.out.println("Sua conta está em débito, não posso fechar a conta.");
        }else{
           this.setStatus(false);
        }
   }
   public void depositar(int v){
        if(this.getStatus()==true){
        this.setSaldo(this.getSaldo()+v);
        }else if(this.getStatus()==false){
           System.out.println("Conta Fechada!");
        }     
   }
   
   public void sacar(int v){
       if(this.getStatus()==true && this.getSaldo()>0){
       this.setSaldo(this.getSaldo()-v);
       }else if(this.getStatus()==false && this.getSaldo()<=0){
           System.out.println("Sua conta está fechada!");
       }else if(this.getStatus()==true && this.getSaldo()<=0){
           System.out.println("Saldo insuficiente!");
       }
   }
   
   
   public void sobreConta(){
        System.out.println("Número da conta: "+this.getNumConta());
        if(this.getTipo().equals("cc")){
            System.out.println("Tipo da conta: Conta Corrente.");
        }else {//if(this.getTipo().equals("cp")){
            System.out.println("Tipo da conta: Conta Poupança.");
        }
        System.out.println("Nome do Proprietário: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        if(this.getStatus() == true){
            System.out.println("Status: Aberta.");
        }else{
            System.out.println("Status: Fechada.");
        }
       
   }
   
   
   
   
   
}
