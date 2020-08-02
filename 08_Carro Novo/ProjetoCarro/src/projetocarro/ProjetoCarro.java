package projetocarro;
import java.util.Scanner;

public class ProjetoCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();
        
        while(true){
            
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("show")){
                System.out.println(carro);
            }else if(ui[0].equals("init")){//maxPass e maxGas
                carro = new Carro();
            }else if(ui[0].equals("in")){//nome idade posiçao
                carro.in(new Pessoa(ui[1], Integer.parseInt(ui[2])), Integer.parseInt(ui[3]));
            }else if(ui[0].equals("out")){//nome
                carro.out((ui[1]));
            }else if(ui[0].equals("drive")){
                carro.drive();    
            }else{
                System.out.println("Comando Inválido!");
            }
            
        }
        scan.close();
    }
    
}
