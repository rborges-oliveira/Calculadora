package br.com.calculadora;

import br.com.calculadora.negocio.Operacoes;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inicialização do objeto operações
        Operacoes operacoes = new Operacoes();

        System.out.println("Insira um número: ");
        Double num1 = scanner.nextDouble();
        System.out.println("Insira um número: ");
        Double num2 = scanner.nextDouble();



        // soma
        Double retorno = operacoes.soma(num1, num2);
        System.out.println("O resultado da soma é: "+ retorno);
    }
}
