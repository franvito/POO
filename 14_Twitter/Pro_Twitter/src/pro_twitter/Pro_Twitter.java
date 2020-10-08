package pro_twitter;

import java.util.Scanner;

public class Pro_Twitter {

    public static void main(String[] args) {

        User u = new User();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("add")){
                u.addUser(ui[1]);
            }else if(ui[0].equals("follow")){
                User user1 = u.usuarios.get(ui[1]);
                User user2 = u.usuarios.get(ui[2]);
                user1.follow(user2);
            }else if(ui[0].equals("listar")){
                u.listarUsuarios();
            }else if(ui[0].equals("twitar")){
                User user1 = u.usuarios.get(ui[1]); 
                user1.twitar(ui[1], ui[2]);
            }else if(ui[0].equals("timeline")){
                User user1 = u.usuarios.get(ui[1]);
                user1.getTimeline(user1);
            }else if(ui[0].equals("like")){
                User user1 = u.usuarios.get(ui[1]);
                user1.darLike(Integer.parseInt(ui[2]));    
            }else{
                System.out.println("Comando inválido!");
            } 
        }
        scan.close();

    }
    
}
