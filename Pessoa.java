import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String telefone;

    public Pessoa(String nome,String cpf, String dataDeNascimento, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;

    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public Cliente procurarCliente(ArrayList<Cliente> clientes){
        while (true) {
            int verificar = 0;
            String cpf = solicitarString("Digite o CPF do Cliente: ");
            for(Cliente cliente: clientes){
                String CPF = cliente.getCpf();
                if (cpf.equals(CPF)){
                    return cliente;
                }
            }
            imprimir("O CPF não foi encontrado, tente novamente!");
        }
        
    }

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


    
}