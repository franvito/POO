package motoca;
import java.util.Scanner;

public class Motoca {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Moto moto  = new Moto();
        
	while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")) {
		break;
            }else if(ui[0].equals("embarcar")) { //nome  idade
		int idade = Integer.parseInt(ui[2]);
		moto.embarcar(moto.pessoa.nome(ui[1]), moto.pessoa.idade);
            }else if(ui[0].equals("desembarcar")) {
		moto.desembarcar();
            }else if(ui[0].equals("dirigir")) {
		moto.dirigir();
            }else {
		System.out.println("Comando invalido");
            }
        }
            scanner.close();
	    
	}
    }
    

