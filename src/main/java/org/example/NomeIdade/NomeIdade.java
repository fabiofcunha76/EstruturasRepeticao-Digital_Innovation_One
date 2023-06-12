package org.example.NomeIdade;

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade = 0;

        do {
            System.out.print("Por favor informe seu nome: ");
            nome = scan.next();
            System.out.print("Agora informe a sua idade: ");
            idade = scan.nextInt();

        } while (!(nome.equalsIgnoreCase("cansei")));
    }
}