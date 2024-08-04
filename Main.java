import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void imprimirLinha(int quantidade){
        String linha = "";
        for (int i = 0; i < quantidade; i++){
            linha += "-";
        }
        imprimir(linha);
    }


    public static void imprimir(String conteudo){
        System.out.println(conteudo);
    }


    public static void imprimirCentralizado(String texto, int quant){
        int espaco = (quant - texto.length()) /2;
        if (espaco > 0){
                String esp = " ".repeat(espaco);
                imprimir(esp + texto + esp);
        }
        else{
            imprimir(texto);
        }
    }

        public static String solicitarString(String pergunta){
        Scanner scaneer = new Scanner(System.in);
        while (true){
            imprimir(pergunta);
            try {
                return scaneer.nextLine();
            } catch (InputMismatchException e) {
                imprimir("Entrada Inválida!\nTente Novamente!");
                imprimirLinha(50);
                scaneer.next();
            }
        }
    }


    public static int solicitarInt(String pergunta){
        Scanner scaneer = new Scanner(System.in);
        while (true){
            imprimir(pergunta);
            try {
                return scaneer.nextInt();
            } catch (InputMismatchException e) {
                imprimirLinha(30);
                imprimir("Entrada Inválida!\nTente Novamente!");
                imprimirLinha(30);
                scaneer.next();
            }
        }
    }

    public static Funcionario autenticar(ArrayList<Funcionario> funcionarios){
        while (true) {
            String cpf = solicitarString("Digite seu Cpf: ");
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getCpf().equals(cpf)) {
                    return funcionario;
                }
            }
            imprimirLinha(30);
            imprimir("Cpf não identificado!\nTente Novamente!");
            imprimirLinha(30);
        }
    }

    public static void main(String[] args){

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();

        Funcionario fun1 = new Funcionario("Julia", "111111", "30/01/2004", "123456789", 1200);
        funcionarios.add(fun1);
        Cliente cliente = new Cliente("Doru", "222222", "bbb", "bbb");
        clientes.add(cliente);
        Servico ser1 = new Servico(1, "Lavagem Carro", 50, 'B');
        servicos.add(ser1);
        Servico ser2 = new Servico(2, "Lavagem Moto", 30, 'A');
        servicos.add(ser2);

        while (true){
            imprimirLinha(30);
            imprimirCentralizado("Bem-Vindo ao Lava car", 30);
            imprimirLinha(30);
            Funcionario fun = autenticar(funcionarios);

            menu:
            while (true) {
                imprimirLinha(30);
                imprimirCentralizado("Bem-Vindo " + fun.getNome(), 30);
                imprimirLinha(30);
                imprimir("1- Sair");
                imprimir("2- Cadastrar Cliente");
                imprimir("3- Cadastrar serviço");
                imprimirLinha(30);

                switch (solicitarInt("Digite o número da opção que quer acessar: ")) {
                    case 1:
                        break menu;
                    case 2:
                        clientes.add(fun.cadastrarCliente());
                        break;
                    case 3:
                        fun.cadastrarServico(clientes, servicos, fun);
                        break;
                    default:
                        imprimirLinha(30);
                        imprimir("Opcão não encontrada!\nTente Novamente!");
                        break;    
                    
                }
                
            }

            imprimirLinha(30);
            imprimir("Salvando dados.....");
            imprimir("Obrigado por usar o sistema");
            imprimirLinha(30);
            break;


        }


    } 
    
}
