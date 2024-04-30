import java.util.Scanner;

public class AprendendoFuncoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo=500.00, valor;

        System.out.println("DIGITE O VALOR DO DEPÓSITO: ");
        valor = teclado.nextDouble();
        depositar(saldo,valor);
    }

    public static void depositar(double saldo, double valor){
        saldo+=valor;
        System.out.println("Saldo atualizado: "+ saldo);
    }
}
