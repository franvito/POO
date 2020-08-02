package projeto_junkfood;
import java.util.ArrayList;

public class Maquina {

    private ArrayList<Espiral> espirais;
    private float saldoCliente;
    private float lucro;
    private int maxProd;
    private int nesp;

    public Maquina(int nesp, int maxProd){
    
        this.saldoCliente = (float) 0.0;
        this.lucro = (float) 0.0;
        this.maxProd = maxProd;
        this.espirais = new ArrayList<>();
    
        for(int i = 0; i < nesp; i++){
            this.espirais.add(new Espiral());
        }
    }
    
    public void inserir(Espiral espiral, int id){
        
        if(id < 0 || id > nesp){
            System.out.println("Não existe essa espiral!");
            return;
        }if(this.espirais.get(id).nome != "-"){
            System.out.println("Já tem um produto aqui!");
            return;
        }if(this.maxProd < espiral.qtd){
            System.out.println("Não cabe tudo isso!");
            return;
        }
            this.espirais.set(id, espiral);
        
    }
    
    public void limpar(int id){
         
        if(this.espirais.get(id).nome != "-"){
            this.espirais.set(id, new Espiral());
        }
    }
    
    public void saldo(int money){
        this.saldoCliente = money;
    }
    
    public void comprar(int id){
        
        if(this.espirais.get(id).qtd == 0){
            System.out.println("Produto em falta!");
            return;
        }else if(this.saldoCliente >= this.espirais.get(id).preco && this.espirais.get(id).nome != "-"){
            this.saldoCliente = saldoCliente - this.espirais.get(id).preco;
            this.espirais.get(id).qtd = espirais.get(id).qtd - 1;
            System.out.println("Você comprou: " + this.espirais.get(id).nome);    
        }else if(this.saldoCliente < this.espirais.get(id).preco || this.saldoCliente == 0 && this.espirais.get(id).nome != "-"){
            System.out.println("Você não tem saldo o suficiente!");
        }else{
            System.out.println("Produto não disponivél!");
            return;
        }
    }
    
    public void troco(){
        System.out.println("Você recebeu: "+ this.saldoCliente);
        this.saldoCliente = 0;
    }
    
    public String toString(){
        String saida = "";
        saida += "Saldo: " + saldoCliente + "\n";
        for(int i = 0; i < this.espirais.size(); i++)
            saida += i + "[" + this.espirais.get(i) + "]\n";
        return saida;
    }
    
}
