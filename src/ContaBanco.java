import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        String nome, agencia="0001", conta="1826"; double saldo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastro de conta");
        System.out.println("_________________\n");
        System.out.println("Digite seu nome: ");
        nome = teclado.next();
        System.out.println("Digite o valor do primeiro deposito: ");
        saldo = teclado.nextDouble();

        System.out.println("DADOS DA CONTA: \n");
        System.out.println("NOME: "+nome);
        System.out.println("AGENCIA: "+agencia);
        System.out.print("N° CONTA: "); criarConta(conta);
       // System.out.println(" ");
        System.out.println("SALDO: "+saldo);

    }

    public static void criarConta(String conta){
            conta=conta+"0"+1;
            System.out.println(conta);
        }
    }

