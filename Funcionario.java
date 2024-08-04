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
    
    public ServicoRealizado cadastrarServico(ArrayList<Cliente> clientes, ArrayList<Servico> servicos, Funcionario fun){
        imprimirLinha(30);
        imprimirCentralizado("Cadastro de Venda", 30);
        imprimirLinha(30);
        Cliente cliente = procurarCliente(clientes);
        for(Servico servico: servicos){
            imprimir(servico.getId() + "-" + servico.getNome());
        }

        int escolha = solicitarInt("Qual serviço será realizado: ");

        Servico escolhido = null;

        for(Servico servico: servicos){
            if(escolha == servico.getId()){
                escolhido = servico;
                break;
            }

        }

        imprimirLinha(30);
        imprimirCentralizado("Venda registrada com sucesso", 30);
        imprimirLinha(30);
        return  new ServicoRealizado(fun, cliente, escolhido);

    }


    
}
