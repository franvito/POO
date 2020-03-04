package s02e01_intro;
import static java.lang.System.exit;
import java.util.Scanner;
public class S02e01_intro {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        Carro carro = new Carro();   
        int n = 1;
        int v[]= new int[n];
        int i;
        
        while(true){
           int op;
           System.out.println("Oque deseja fazer?");
           System.out.println("1: Criar carro.");
           System.out.println("2: Embarcar.");
           System.out.println("3: Desembarcar.");
           System.out.println("4: Abastecer.");
           System.out.println("5: Dirigir.");
           System.out.println("6: Status.");
           System.out.println("7: Encerrar.");
           op = ler.nextInt();
            switch(op){
                
                
                case 1:
                    //criar carro
                    int mp;
                    int pa;
                    float mg;
                    float qg;
                    System.out.println("Quantas pessoas cabem no carro?");
                    mp = ler.nextInt();
                    carro.setMaxpessoa(mp);
                    System.out.println("Quantidade de pessoas atualmente?");
                    pa = ler.nextInt();
                    carro.setNumpessoa(pa);
                    System.out.println("Quantidade máxima de gasolina?");
                    mg = ler.nextFloat();
                    carro.setMaxgasolina(mg);
                    System.out.println("Quanto de gasolina tem atualmente?");
                    qg = ler.nextFloat();
                    carro.setGasolina(qg);
                    break;
                    
                case 2:
                   //embarcar
                        int q;
                        System.out.println("Quantos?");
                        q = ler.nextInt();
                        carro.embarcar(q);
                    break;
                    
                case 3:
                   //desembarcar
                        int qu;
                        System.out.println("Quantos?");
                        qu = ler.nextInt();
                        carro.desembarcar(qu);
                    break;
                    
                case 4:
                    //abastecer
                        float li;
                        System.out.println("Quantos litros?");
                        li = ler.nextFloat();
                        carro.abastecer(li);
                    break;
                    
                case 5:
                    //dirigir
                        int km;
                        System.out.println("Quantos quilômetros: ");
                        km = ler.nextInt();
                        carro.dirigir(km);    
                    break;
                
                case 6:
                    //status
                        carro.status();   
                    break;
                    
                case 7:
                    //encerrar
                        System.exit(0);   
                    break;    
                    
                default:
                    System.out.println("Ação Inválida!");
                    break;
                   
            } 
          
        }
        
    }
    
}//FINAL
