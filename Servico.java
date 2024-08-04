public class Servico {
    private String nome;
    private float preco;
    private Funcionario funcionario;
    private Cliente cliente;

    public Servico(String nome, float preco, Funcionario funcionario, Cliente cliente){
        this.nome = nome;
        this.preco = preco;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
}
