package projetolapiseira;
import java.util.Scanner;

public class ProjetoLapiseira {

    public static void main(String[] args) {
        
        Lapiseira lap = new Lapiseira();
        Scanner ler = new Scanner(System.in);
        
        while(true){

            int op;
            System.out.println("O que deseja fazer?");
            System.out.println("1: Criar Lapiseira.");
            System.out.println("2: Inserir Grafite.");
            System.out.println("3: Escrever.");
            System.out.println("4: Apagar.");
            System.out.println("5: Expor Ponta.");
            System.out.println("6: Guardar Ponta.");
            System.out.println("7: Status.");
            System.out.println("8: Terminar.");
            op = ler.nextInt();
            
            switch(op){
                
                case 1:
                    //CRIAR LAPISEIRA
                    String mc;
                    int bor;
                    System.out.println("Digite a marca: ");
                    ler.nextLine();
                    mc = ler.nextLine();
                    lap.setMarca(mc);
                    System.out.println("Digite a quatidade de borracha: ");
                    bor = ler.nextInt();
                    lap.setBorracha(bor);
                    
                    break;
                
                case 2:
                    int tam;
                    float pt;
                    System.out.println("Digite a ponta: ");
                    pt = ler.nextFloat();
                    System.out.println("Digite o tamanho: ");
                    tam = ler.nextInt();
                    lap.inserirPonta(new Grafite(pt, tam));
                    
                    break;    
                
                case 3:
                    //ESCREVER
                    int es;
                    System.out.println("Quanto deseja escrever? ");
                    es = ler.nextInt();
                    lap.escrever(es);
                    break;
                
                case 4:
                    //APAGAR
                    int ap;
                    System.out.println("Quanto deseja apagar?");
                    ap = ler.nextInt();
                    lap.apagar(ap);
                    break;    
                
                case 5:
                    //EXPOR PONTA
                    lap.exporPonta();
                    System.out.println("Ponta exposta!");
                    break;    
                
                case 6:
                    //GUARDAR PONTA
                    lap.guardarPonta();
                    System.out.println("Ponta guardada!");
                    break;    
                    
                case 7:
                    //STATUS
                    lap.status();
                    break;
                
                case 8:
                    //TERMINAR
                    System.out.println("Até.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ação inválida!");
                    break;
            }
        }
        
        
        
        
        
        
    }
    
}
