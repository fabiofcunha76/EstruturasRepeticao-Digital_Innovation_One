package org.example.Array;

import java.util.Scanner;

public class EstudandoArrayJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;

        //int []indice = {10,20,30,40}; //adicionando os elementos do array no momento da declaração do mesmo
        int[] indice = new int[6]; //declarando um array do tipo int com o tamanho já definido, sem adicionar os elementos ainda

        for(int i = 0; i < 6; i++ ){
            System.out.print("Informe um número para adicionar ao arrary na posição " + i +": ");
            indice[i] = scan.nextInt();
        }

        System.out.println(" ");

        for (int i = 0; i < indice.length; i++){
            System.out.println("Indice " + i + "-> elemento :" + indice[i]);
        }

    }
}
