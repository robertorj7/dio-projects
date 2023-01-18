package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem Vindo ao Cadastro de Nova Conta!\n");
        System.out.println("Por favor, digite o número da Conta");
        Integer numero = sc.nextInt();

        System.out.println("Por favor, digite o código da Agência");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu Nome");
        String nome = sc.next();

        System.out.println("Por favor, digite o Valor Inicial para a Conta");
        BigDecimal valor = sc.nextBigDecimal();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, valor);

        System.out.println("Olá " + conta.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + conta.getAgencia() +
                ", conta " + conta.getNumero() +
                " e seu saldo de R$" + conta.getSaldo() + " já está disponível para saque.");

    }
}