package aula01;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        //Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o
        //seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.

        Double salario;
        int idade ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informem sua idade");
        idade = scanner.nextInt();

        System.out.print("Digite o seu salario: ");
        salario = scanner.nextDouble();
        if (idade >=18 && salario>= 2000){
            System.out.println("Aprovado");
        }else {
            System.out.println("Status invalidos");
        }

    }
}
