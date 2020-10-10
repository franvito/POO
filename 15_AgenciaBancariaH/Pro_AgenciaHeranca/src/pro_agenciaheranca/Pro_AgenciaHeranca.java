package pro_agenciaheranca;

import java.util.Scanner;

public class Pro_AgenciaHeranca {

    public static void main(String[] args) {

        /*ContaC conta = new ContaC(2, "joao");
        ContaP conta2 = new ContaP(1, "joao");
        
        System.out.println(conta.type);
        System.out.println(conta.idCliente);
        System.out.println(conta.saldo);
        conta.attMensal();
        System.out.println(conta.saldo);
        
        System.out.println(conta2.type);
        System.out.println(conta2.idCliente);
        System.out.println(conta2.saldo);
        conta2.attMensal();
        System.out.println(conta2.saldo);
        */
        
        Agencia agen = new Agencia();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("add")){
                agen.addCliente(ui[1]);
            }else if(ui[0].equals("sacar")){
                Conta ag = agen.contas.get(Integer.parseInt(ui[1]));
                if(ag != null){
                    ag.sacar(Float.parseFloat(ui[2]));
                }else{    
                    System.out.println("Essa conta não existe!");
                }
            }else if(ui[0].equals("depositar")){
                Conta ag = agen.contas.get(Integer.parseInt(ui[1]));
                if(ag != null){
                    ag.depositar(Float.parseFloat(ui[2]));
                }else{    
                    System.out.println("Essa conta não existe!");
                }
            }else if(ui[0].equals("transf")){
                Conta ag = agen.contas.get(Integer.parseInt(ui[1]));
                Conta other = agen.contas.get(Integer.parseInt(ui[2]));
                
                if(ag != null && other != null){
                    ag.transferir(other, Float.parseFloat(ui[3]));
                }else{
                    System.out.println("Uma das contas não existe!");
                }
                
            }else if(ui[0].equals("att")){
                agen.attMensal();
            }else if(ui[0].equals("show")){
                agen.show();    
            }else{
                System.out.println("Comando inválido!");
            } 
        }
        scan.close();
        
        
    }
    
}
