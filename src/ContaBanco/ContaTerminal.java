package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int Numero = sc.nextInt();

        System.out.println("Por favor, digite sua Agência !");
        String Agencia = sc.next();

        System.out.println("Digite seu nome !");
        String Cliente = sc.next();

        System.out.println("Digite seu saldo");
        double Saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", Cliente, Agencia, Numero, Saldo);
    }
}

