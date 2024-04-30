import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, anoNascimento,anoAtual;

        System.out.println("Digite o ano atual");
        anoAtual = teclado.nextInt();
        System.out.println("Digite o ano do seu nascimento");
        anoNascimento = teclado.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println(idade);
    }
}
