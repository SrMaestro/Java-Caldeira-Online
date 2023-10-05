package aula01;

import java.util.Scanner;

public class Ex005 {
    //Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e
    // exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.


    //*Dividr e conquistar*
    //Passp 1 :Criar uma varivael que armazene um horario (hora,mminuto e segundo)
    //Passo 2 : Converte aqueles diferentes de segundos para o mesmo
    //passo 3 : Exiba a quantidade de segundos que se passaram deste a meia noite de segundo que faltam do mesmo
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;
        int segundosAposAMeiaNoite;
        int segundosAtesAMeiaNoite;
        int totalEmSegundos;

        //Coletando parametros
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        hora = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        minutos  = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        segundos  = scanner.nextInt();

        //trasformaçao de dos valores diferentes de segundo para segundo
         hora =(hora*60)*60;
        System.out.println(hora);

        minutos = minutos*60;
        System.out.println(minutos);

        System.out.println(segundos);

        totalEmSegundos = hora+minutos+segundos;

        if (totalEmSegundos > 86400    ){
            System.out.println("Passaram " + totalEmSegundos + " Apos a meia noite");
       }


    }

}
