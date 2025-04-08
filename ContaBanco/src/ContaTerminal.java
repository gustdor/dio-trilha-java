import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digita o numero: ");
        int Numero = sc.nextInt();

        System.out.println("Digita a agencia: ");
        String Agencia = sc.next();

        System.out.println("Digita seu nome: ");
        String NomeCliente = sc.next();

        System.out.println("Digita o saldo: ");
        float Saldo = sc.nextFloat();


        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
        ", conta " + Numero + " e seu saldo " + Saldo + " já esta disponível para saque.");

           

    }
}
