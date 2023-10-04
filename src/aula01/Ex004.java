package Aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
 //Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
 //calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.

        double salarioDoUsuario;
        double salarioMinimo = 1320;
        double quantidadeDeSalariosMinimos;
        double quantidadeDeSalariosMinimosConversao;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salario: ");
        salarioDoUsuario = scanner.nextDouble();
        //System.out.println(salarioDoUsuario);
        quantidadeDeSalariosMinimos = salarioDoUsuario/salarioMinimo;
        System.out.print(new DecimalFormat(".##").format(quantidadeDeSalariosMinimos ));

        scanner.close();
    }
}
