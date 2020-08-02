package motoca;

public class Moto {
    Pessoa pessoa;
    int pot;
    
        public Moto(){
            
        }
	public Moto(int pot){
            this.pot = pot;
            Pessoa pessoa = new Pessoa();
	}
	
	void embarcar(Pessoa pessoa) {
            
            if(this.pessoa.nome == null){
                this.pessoa = pessoa;
            }else{
                System.out.println("Ja tem gente na motoca");
            }
	}
	
	void desembarcar() {
            if(this.pessoa != null)
                this.pessoa = null;
            else
                System.out.println("Nao tem ninguem na moto");
	}

	void dirigir(){
		if(this.pessoa == null)
			System.out.println("Nao tem ninguem na moto");
		else if(this.pessoa.idade < 2)
			System.out.println("Muito pequeno pra andar de moto");
		else if(this.pessoa.idade > 10)
			System.out.println("Muito grande pra andar de moto");
		else
			System.out.print(this.pessoa.nome);
	}

}
