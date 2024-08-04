import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private ArrayList<Servico> servicos;
    private float salario;

    public Funcionario(String nome,String cpf, String dataDeNascimento, String telefone, float salario){
        super(nome, cpf, dataDeNascimento, telefone);
        this.salario = salario;
        this.servicos = servicos;
    }

    public Cliente cadastrarCliente(){
        imprimirLinha(30);
        imprimirCentralizado("Cadastro de Cliente", 30);
        imprimirLinha(30);
        String nome = solicitarString("Nome: ");
        String cpf = solicitarString("CPF: ");
        String data = solicitarString("Data de Nascimento: ");
        String tel = solicitarString("Telefone: ");
        Cliente cliente = new Cliente(nome, cpf, data, tel);  
        imprimirLinha(30);
        imprimirCentralizado("Cadastro realizado com sucesso", 30);
        
        return cliente;
    }
    
    public Servico cadastraServico(){
        
    }


    
}
