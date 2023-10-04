package Aula01;

import java.util.Scanner;

public class Ex001 {
    //Crie um programa que leia seu nome e imprima na tela.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Bem vindo(a) " + nome);
    }
}
