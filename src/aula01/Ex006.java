package aula01;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        //Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
        //Se for menor de 16 anos, avisar que não pode votar;
        //Se tiver 16 ou 17, avisar que o voto é facultativo;
        //Se tiver mais de 65, avisar que também é facultativo o voto;
        //De 18 até 65, é obrigatório votar.

        int idade ;

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Informe sua idade");
        idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Nao pode votar");
        }else if (idade == 16 && idade == 17){
            System.out.println("Voto facultativo");
        } else if (idade >= 65) {
            System.out.println("Voto Facultativo");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Voto obrigatorio");
        }
    }
}
