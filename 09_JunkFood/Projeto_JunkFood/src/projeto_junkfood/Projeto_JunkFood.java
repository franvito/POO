package projeto_junkfood;
import java.util.Scanner;

public class Projeto_JunkFood {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Maquina maquina = new Maquina(0, 0);
        
        while(true){
        
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                maquina = new Maquina(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("set")){
                maquina.inserir(new Espiral(ui[1], Integer.parseInt(ui[2]), Float.parseFloat(ui[3])), Integer.parseInt(ui[4]));
            }else if(ui[0].equals("limpar")){
                maquina.limpar(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("dinheiro")){
                maquina.saldo(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("comprar")){
                maquina.comprar(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("troco")){
                maquina.troco();
            }else if(ui[0].equals("show")){
                System.out.println(maquina);    
            }else{
                System.out.println("Comando Inválido");
            }
            
        
        }
        
        scan.close();
        
    }
    
}
