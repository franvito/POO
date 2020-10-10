package pro_agenciaheranca;
import java.util.TreeMap;

public class Cliente {
    
    public int nextId;
    
    TreeMap<Integer, Conta> contas;
    
    public String clienteId;
    
    public Cliente(String clienteId){
        this.clienteId = clienteId;
        this.nextId = 0;
        contas = new TreeMap<>();
        contas.put(nextId, new ContaC(nextId, clienteId));
        nextId+= + 1;
        contas.put(nextId, new ContaP(nextId, clienteId));
        nextId+= + 1;
    }
    
    public String toString(){
        return clienteId;
    }
    
}
