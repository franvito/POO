package projeto_junkfood;

public class Espiral {

    public String nome;
    public int qtd;
    public float preco;

    public Espiral(){
        this.nome = "-";
        this.qtd = 0;
        this.preco = (float) 0.0;
    }

    public Espiral(String nome, int qtd, float preco){
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String toString(){
        return nome + " : " + qtd + " U : " + preco + " RS";
    }
    
}
