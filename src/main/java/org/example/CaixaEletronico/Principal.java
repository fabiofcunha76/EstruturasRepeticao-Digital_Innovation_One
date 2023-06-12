package org.example.CaixaEletronico;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor informe o valor a decompor em notas de R$200, R$100, R$50, R$20, R$10 : ");
        valor = entrada.nextInt();

        int[] divisores = {200,100,50,20,10};

        for (int i: divisores){
            //System.out.println("Divisores: " + i);
           // System.out.println("O valor " + valor + " dividido por "+ i + " tem resto de " + valor % i + " .");
            System.out.println("Divisor :" + i + "- Dividendo: " + (valor / i) + ". Resto: " + (valor % i) + ".");

        }
        System.out.println("Tamanho do array de divisores : " + divisores.length);

        /*System.out.println(270 / 20);
        System.out.println(270 % 20);*/
    }
}
