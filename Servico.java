public class Servico {
    private int id;
    private String nome;
    private float preco;
    private char tipo;

    public Servico(int id, String nome, float preco, char tipo){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

}
