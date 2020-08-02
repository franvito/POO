package projetotama;
import java.util.Scanner;

public class ProjetoTama {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Jogo jogo = new Jogo();
        
        while(true){
            
            String line = ler.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                int me = Integer.parseInt(ui[1]);
                int ms = Integer.parseInt(ui[2]);
                int ml = Integer.parseInt(ui[3]);
                jogo.iniciar(new Tamagochi(me, ms, ml));
            }else if(ui[0].equals("play")){
                jogo.brincar();    
            }else if(ui[0].equals("eat")){
                jogo.comer();
            }else if(ui[0].equals("sleep")){
                jogo.dormir();
            }else if(ui[0].equals("shower")){
                jogo.banho();
            }else if(ui[0].equals("show")){
                jogo.mostrar();
            }else{
                System.out.println("Comando inválido!");
            }
            
        }
    }
    
}
