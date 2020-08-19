package agenciab;
import java.util.Scanner;

public class AgenciaB {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta(0);
        //Operacao op = new Operacao("abertura", 0, 0);
                
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                conta = new Conta(Integer.parseInt(ui[1]));    
            }else if(ui[0].equals("show")){
                System.out.println(conta);
            }else if(ui[0].equals("extrato")){
                conta.extrato();
            }else if(ui[0].equals("extratoN")){
                conta.extratoN(Integer.parseInt(ui[1]));    
            }else if(ui[0].equals("depositar")){
                conta.depositar(Float.parseFloat(ui[1]));
            }else if(ui[0].equals("saque")){
                conta.saque(Float.parseFloat(ui[1]));
            }else if(ui[0].equals("tarifa")){
                conta.tarifa(Float.parseFloat(ui[1]));
            }else if(ui[0].equals("extornar")){
                for(int i = 1; i < ui.length; i++)
                conta.extorno(Integer.parseInt(ui[i]));
            }
            else{
                System.out.println("Comando inválido!");
            }
        }
        scan.close();
    }
    
}
