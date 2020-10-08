package agenda1;
import java.util.Scanner;

public class Agenda1 {

    public static void main(String[] args) {
        
        //Contato conta = new Contato(" ");
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("add")){
                Contato contato = agenda.getCont(ui[1]);
                if(contato == null)
                    agenda.addContato(ui[1]);
                    contato = agenda.getCont(ui[1]);
                for(int i = 2; i < ui.length; i++){
                    String partes[] = ui[i].split(":");
                    contato.addFone(partes[0], partes[1]);
                }
            }else if(ui[0].equals("rmContato")){
                agenda.rmvContato(ui[1]);
            }else if(ui[0].equals("rmFone")){
                Contato contato = agenda.getCont(ui[1]);
                if(contato != null)
                    contato.remvFone(Integer.parseInt(ui[2]));
                else
                    System.out.println("O contato não existe!");
            }else if(ui[0].equals("agenda")){
                agenda.agenda();
            }else if(ui[0].equals("search")){
                agenda.search(ui[1]);
            }else{
                System.out.println("Comando inválido!");
            }
            
               
        }
        scan.close(); 
    }
    
}
