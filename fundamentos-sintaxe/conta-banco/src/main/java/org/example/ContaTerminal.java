package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bando DIO");
        System.out.println("Cadastro de cliente. . .");

        System.out.println("Entre com o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.println("Entre com o número da conta: ");
        Integer numeroConta = input.nextInt();

        System.out.println("Entre com o número da agência: ");
        String numeroAgencia = input.next();

        System.out.println("Entre com o depósito inicial: ");
        Double saldoConta = input.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d, e seu saldo é %.2f já está disponível para saque.",
                nomeCliente, numeroAgencia, numeroConta, saldoConta));

        input.close();
    }
}
