import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<Veiculo> veiculos;
    
    public Cliente(String nome, String cpf, String data, String telefone){
        super(nome, cpf, data, telefone);
        this.veiculos = new ArrayList<>();
    }

}
