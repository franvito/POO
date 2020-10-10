package pro_agenciaheranca;
import java.util.TreeMap;

public class Agencia {
    
    public int nextId;
    
    TreeMap<Integer, Conta> contas;
    TreeMap<String, Cliente> clientes;
    
    public Agencia(){
        this.nextId = 0;
        contas = new TreeMap<>();
        clientes = new TreeMap<>();
    }
    
    public void addCliente(String id){
        
        clientes.put(id, new Cliente(id));
        contas.put(nextId, new ContaC(nextId, id));
        nextId += 1;
        contas.put(nextId, new ContaP(nextId, id));
        nextId += 1;
   
    }

    public void attMensal(){
        for(Conta cont : contas.values()){
            cont.attMensal();
        }
    }
    
    public void show(){
        for(Conta cont : contas.values()){
            System.out.println(cont);
        }
    }
    
}
