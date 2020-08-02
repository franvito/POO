package projetotama;

public class Jogo {
    
    Tamagochi tama;
    
    public void iniciar(Tamagochi tama){
        this.tama = tama;
    }
    
    public void brincar(){
        if(tama.getVivo()==true){
            tama.setEnergia(tama.getEnergia()-1);
            tama.setSaciedade(tama.getSaciedade()-1);
            tama.setLimpeza(tama.getLimpeza()-3);
            tama.setDiamantes(tama.getDiamantes()+1);
            tama.setIdade(tama.getIdade()+1); 
            if(tama.getEnergia()<=0 ||tama.getSaciedade()<=0||tama.getLimpeza()<=0){
                if(tama.getEnergia()<=0)
                   System.out.println("Morreu de Fraqueza!");
                if(tama.getSaciedade()<=0)
                    System.out.println("Morreu de Fome!");
                if(tama.getLimpeza()<=0)
                    System.out.println("Morreu por falta de higiene!");
                tama.setVivo(false);
            }
        }else{
            System.out.println("Ele está morto!");  
        }
    }
    
    public void comer(){
        if(tama.getVivo()==true){
            if(tama.getSaciedade()+4<=tama.getMaxSaciedade()){
                tama.setEnergia(tama.getEnergia()-2);
                tama.setSaciedade(tama.getSaciedade()+4);
                tama.setLimpeza(tama.getLimpeza()-2);
                tama.setDiamantes(tama.getDiamantes()+0);
                tama.setIdade(tama.getIdade()+1);
                if(tama.getEnergia()<=0 ||tama.getSaciedade()<=0||tama.getLimpeza()<=0){
                    if(tama.getEnergia()<=0)
                           System.out.println("Morreu de Fraqueza!");
                        if(tama.getSaciedade()<=0)
                            System.out.println("Morreu de Fome!");
                        if(tama.getLimpeza()<=0)
                            System.out.println("Morreu por falta de higiene!");
                    tama.setVivo(false);   
                }
            }else{
                System.out.println("Está satisteito!");
            } 
        }else{
            System.out.println("Ele está morto!");  
        }
    }
    
    public void dormir(){
        if(tama.getVivo()==true){
            if(tama.getEnergia()<=tama.getMaxEnergia()-5){
                tama.setEnergia(tama.getMaxEnergia());
                tama.setSaciedade(tama.getSaciedade()+0);
                tama.setLimpeza(tama.getLimpeza()+0);
                tama.setDiamantes(tama.getDiamantes()+0);
                tama.setIdade(tama.getIdade()+1);
            }else{
                System.out.println("Não está com sono!");
            }
        }else{
            System.out.println("Ele está morto!");  
        }
        
    }
    
    public void banho(){ 
        if(tama.getVivo()==true){
            tama.setEnergia(tama.getEnergia()-3);
            tama.setSaciedade(tama.getSaciedade()-1);
            tama.setLimpeza(tama.getMaxLimpeza());
            tama.setDiamantes(tama.getDiamantes()+0);
            tama.setIdade(tama.getIdade()+2);
            if(tama.getEnergia()<=0 ||tama.getSaciedade()<=0||tama.getLimpeza()<=0){
                if(tama.getEnergia()<=0)
                   System.out.println("Morreu de Fraqueza!");
                if(tama.getSaciedade()<=0)
                    System.out.println("Morreu de Fome!");
                if(tama.getLimpeza()<=0)
                    System.out.println("Morreu por falta de higiene!");
                tama.setVivo(false);
            }
        }else{
            System.out.println("Ele está morto!");  
        }
    }
    
    public void mostrar(){
        System.out.print("E:"+tama.getEnergia()+"/"+tama.getMaxEnergia());
        System.out.print(" S:"+tama.getSaciedade()+"/"+tama.getMaxSaciedade());
        System.out.print(" L:"+tama.getLimpeza()+"/"+tama.getMaxLimpeza());
        System.out.print(" D:"+tama.getDiamantes());
        System.out.println(" I:"+tama.getIdade());
    }
    
}
