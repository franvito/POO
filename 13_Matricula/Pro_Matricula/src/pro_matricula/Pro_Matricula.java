
package pro_matricula;
import java.util.Scanner;

public class Pro_Matricula {

    public static void main(String[] args) {
       
        Faculdade facul = new Faculdade();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("addAluno")){
                facul.addAluno(ui[1]);
            }else if(ui[0].equals("addCadeira")){
                facul.addCadeira(ui[1]);
            }else if(ui[0].equals("rmAluno")){
                facul.retirarAlu(ui[1]);
            }else if(ui[0].equals("matricular")){
                for(int i = 1; i < ui.length; i++)
                    facul.matricular(ui[1], ui[i]);
            }else if(ui[0].equals("desmatricular")){
                for(int i = 1; i < ui.length; i++)
                    facul.desmatricular(ui[1], ui[i]);
            }else if(ui[0].equals("listar")){
                facul.listar();
            }else{
                System.out.println("Comando inválido!");
            } 
        }
        scan.close();
        
    }
    
}
