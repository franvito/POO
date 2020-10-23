package pro_twitter;

import java.util.Scanner;

public class Pro_Twitter {

    public static void main(String[] args) {

        Sistema s = new Sistema();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("add")){
                s.addUser(ui[1]);
            }else if(ui[0].equals("follow")){
                User user1 = s.usuarios.get(ui[1]);
                User user2 = s.usuarios.get(ui[2]);
                user1.follow(user2);
            }else if(ui[0].equals("listar")){
                s.listarUsuarios();
            }else if(ui[0].equals("twitar")){
                String aux="";
                for(int i=2; i < ui.length; i++){
                    if(i==ui.length -1){
                        aux+=ui[i];
                    }else{
                        aux += ui[i] + " ";
                    }
                }
                s.Twitar(ui[1], aux);
            }else if(ui[0].equals("timeline")){
                User user1 = s.usuarios.get(ui[1]);
                user1.getTimeline(user1);
            }else if(ui[0].equals("like")){
                User user1 = s.usuarios.get(ui[1]);
                user1.darLike(Integer.parseInt(ui[2]));    
            }else{
                System.out.println("Comando inválido!");
            } 
        }
        scan.close();

    }
    
}
