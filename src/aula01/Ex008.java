package aula01;

import java.util.Scanner;

public class Ex008 {
    //Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções,
    //perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD, Idosa ou
    //Gestante, tem direito a fila prioritária. Se não, não tem direito.
    //Respostas:
    public static void main(String[] args) {

        int status;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as 1 para pessoa gestante : ");
        System.out.println("digite 2 para pessoa idosa : ");
        System.out.println("Digite as 3 para pessoa PCD : ");
        System.out.println("Digite as 4 para nenhuma das anteriores : ");


        status = scanner.nextInt();



        switch (status) {
            case 1:
                System.out.println("tem direito");
                break;
            case 2:
                System.out.println("tem direito");
                break;
            case 3:
                System.out.println("tem direito");
                break;
            case 4:
                System.out.println(" nao tem direito");
                break;

        }
// Outputs "Thursday" (day 4)


    }
}
