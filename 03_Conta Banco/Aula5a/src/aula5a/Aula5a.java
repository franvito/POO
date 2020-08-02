package aula5a;
import static java.lang.Math.abs;
import java.util.Scanner;
import java.util.Random;
public class Aula5a {
  public static void main(String[] args) {
      
      Scanner ler = new Scanner(System.in);
      ContaBanco c = new ContaBanco();
      Random cont = new Random();
      
      while(true){
          
        int op;
        System.out.println("O que deseja fazer?");
        System.out.println("1: Criar Conta.");
        System.out.println("2: Fechar Conta.");
        System.out.println("3: Depositar.");
        System.out.println("4: Sacar.");
        System.out.println("5: Sobre a Conta.");
        System.out.println("6: Encerrar Sessão.");
        op = ler.nextInt();
        
        switch(op){
            case 1:
                //CRIAR CONTA
                int nc;
                String dn;
                
                nc = abs(cont.nextInt()%100000);
                c.setNumConta(nc);
                System.out.println("Digite o nome do proprietário: ");
                ler.nextLine();
                dn = ler.nextLine();
                c.setDono(dn);
                String tp;
                System.out.println("Digite o tipo de conta desejada:");
                System.out.println("cp: Conta Poupança.");
                System.out.println("cc: Conta Corrente.");
                tp = ler.next();
                c.setTipo(tp);
                c.abrirConta(tp);
                break;

            case 2:
                //FECHAR CONTA
                c.fecharConta();
                break;
                
            case 3:
                //DEPOSITAR
                int v;
                System.out.println("Digite o valor: ");
                v = ler.nextInt();
                c.depositar(v);   
                break;
            
            case 4:
                //SACAR
                int vs;
                System.out.println("Digite o valor: ");
                vs = ler.nextInt();
                c.sacar(vs);
                break;
                
            case 5:
                //SOBRE A CONTA
                c.sobreConta();
                break;   
            
            case 6:
                //ENCERRAR SESSÃO
                System.out.println("Sessão Encerrada.");
                System.exit(0);
                break; 
                
            default:
                System.out.println("Ação Inválida!");
                break;
                
      }
      }
    }
}
