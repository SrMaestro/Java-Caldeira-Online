package Aula01;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        //Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

        int n1;
        int n2;
        int n3;
        int media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        n1 = scanner.nextInt();
        //System.out.println(n1);

        System.out.print("Digite novamente: ");
        n2 = scanner.nextInt();
        //System.out.println(n2);

        System.out.print("Digite novamente: ");
        n3 = scanner.nextInt();
        //System.out.println(n3);

        if (n1 > n2 && n1 > n3 ){
            System.out.println(n1 + " E o maior numero");
        } else  if (n2 > n1 && n2 >n3){
            System.out.println(n2 + " E o maior numero");
        }else {
            System.out.println(n3 + " E o maior numero");
        }

        if (n1 < n2 && n1 < n3 ){
            System.out.println(n1 + " E o menor numero");
        } else  if (n2 < n1 && n2 < n3){
            System.out.println(n2 + " E o menor numero");
        }else {
            System.out.println(n3 + " E o menor numero");
        }

        media = (n1+n2+n3)/3;
        System.out.println("Sua média aritmética e igual a " + media);


    }
}
