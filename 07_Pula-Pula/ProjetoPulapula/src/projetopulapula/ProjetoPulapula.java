package projetopulapula;
import java.util.Scanner;

public class ProjetoPulapula {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Trampoline tramp = new Trampoline();
        
        while(true){
           String line = scanner.nextLine();
           String[] ui = line.split(" ");
           if(ui[0].equals("end"))
               break;
           else if(ui[0].equals("arrive"))//nome //idade
               tramp.arrive(new Kid(ui[1], Integer.parseInt(ui[2])));
           else if(ui[0].equals("in"))
               tramp.in();
           else if(ui[0].equals("out"))
               tramp.out();
           else if(ui[0].equals("remove"))//nome
               tramp.remove(ui[1]);
           else if(ui[0].equals("show"))
               System.out.println(tramp);
           else
               System.out.println("Comando inválido!");
        }
        
        scanner.close();
    }
    
}
