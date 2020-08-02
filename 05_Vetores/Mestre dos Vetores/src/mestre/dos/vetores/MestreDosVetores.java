package mestre.dos.vetores;
import java.util.ArrayList;
import java.util.Scanner;

public class MestreDosVetores {

    public static void main(String[] args) {
        
	Scanner scan = new Scanner(System.in);
        ArrayList<Integer> vet = new ArrayList<Integer>();

		while(true){
                    String line = scan.nextLine();
                    System.out.println("$" + line);
                    String ui[] = line.split(" ");
                    String cmd = ui[0];
                    
                    if(line.equals("end")){
                        break;
                    }else if(cmd.equals("add")){
                        for(int i = 1; i < ui.length; i++)
                            vet.add(Integer.parseInt(ui[i]));
                    }else if(cmd.equals("show")){
                        System.out.print("[ ");
                        for(Integer value : vet)
                            System.out.print(value + " ");
                            System.out.print("]\n");
                    }else if(cmd.equals("rshow")){
                        System.out.print("[ ");
                        for(int i = vet.size() - 1;i >= 0; --i )
                            System.out.print(vet.get(i)+" ");
                        System.out.print("]\n");
                    }else if(cmd.equals("find")){
                        System.out.print("[ ");
                        for(int i = 1; i<ui.length; i++)
                        System.out.print(vet.indexOf(Integer.parseInt(ui[i])) + " ");
                        System.out.print("]\n");
                    }else if(cmd.equals("ins")){
                            vet.add(Integer.parseInt(ui[1]),Integer.parseInt(ui[2]));
                    }else if(cmd.equals("rmi")){
                            vet.remove(Integer.parseInt(ui[1]));  
                    }else if(cmd.equals("rma")){
                            vet.removeAll(vet);        
                    }else{
                        System.out.print("comando inválido!\n");
                    }
                    
                }
    }
    }

    

