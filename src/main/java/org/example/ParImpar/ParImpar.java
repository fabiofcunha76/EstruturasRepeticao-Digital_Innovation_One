package org.example.ParImpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int qtdeVerificar, count, numeroCheck, qtdePar, qtdeImpar =0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você deseja verificar se são par ou impar? ");
        qtdeVerificar = scan.nextInt();

        count = 0;
        qtdePar = 0;

        while (count < qtdeVerificar){
            System.out.print("Por favor informe o número para verificar se é par ou impar: ");
            numeroCheck = scan.nextInt();

            if (numeroCheck % 2 == 0) {
                qtdePar++;
            } else { qtdeImpar++;}

            count++;
        }

        System.out.println("****************************************************");
        System.out.println("Qtde de números informados para verificar := " + qtdeVerificar);
        System.out.println("Qtde números pares: " + qtdePar);
        System.out.println("Qtde números ímpares: " + qtdeImpar);
    }
}
