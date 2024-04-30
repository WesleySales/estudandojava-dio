import java.util.Scanner;

public class AprendendoFuncoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo=500.00, valor;
        int opcao;

        menuIniciar();
        opcao = teclado.nextInt();
        switch (opcao){
            case 1:
                System.out.println(saldo);
                break;
            case 2:
                System.out.println("DIGITE O VALOR DO SAQUE: ");
                valor = teclado.nextDouble();
                sacar(saldo,valor);
                break;
            case 3:
                System.out.println("DIGITE O VALOR DO DEPÓSITO: ");
                valor = teclado.nextDouble();
                depositar(saldo,valor);
                break;
        }

    }

    public static void menuIniciar(){
        System.out.println("1. Ver Saldo");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar\n");
        System.out.println("Escolha uma das opções acima: ");

    }
    public static void depositar(double saldo, double valor){
        saldo+=valor;
        System.out.println("Saldo atualizado: "+ saldo);
    }
    public static void sacar(double saldo, double valor) {
        if (saldo>=valor){
            saldo -= valor;
            System.out.println("Saldo atualizado: "+saldo);
        } else{
            System.out.println("Saldo insuficiente para saque");

        }
    }
}
