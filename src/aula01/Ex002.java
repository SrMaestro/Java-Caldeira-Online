package Aula01;

import java.util.Scanner;

public class Ex002 {

    //Crie um programa que receba 2 números e imprima na tela.

    public static void main(String[] args) {
        int n1 ;
        int n2;
        int soma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n1 = scanner.nextInt();
        System.out.print("Digite um  outro numero: ");
        n2 = scanner.nextInt();

        soma = n1+ n2;

        System.out.println(soma);
    }
}
