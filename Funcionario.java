import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private ArrayList<Servico> servicos;
    private float salario;

    public Funcionario(String nome,String cpf, String dataDeNascimento, String telefone, float salario, ArrayList<Servico> servicos){
        super(nome, cpf, dataDeNascimento, telefone);
        this.salario = salario;
        this.servicos = servicos;
    }

    


    
}
