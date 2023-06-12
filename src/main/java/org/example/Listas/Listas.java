package org.example.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {

        String escolha = "s";
        double nota = 0.0;
        Scanner entrada = new Scanner(System.in);

        List<Double> listaNotasAluno = new ArrayList<Double>();

        while( escolha.equals("s")){

            System.out.print("Por favor informe a nota para adicionar na lista: ");
            nota = entrada.nextDouble();
            listaNotasAluno.add(nota);

            System.out.print("Deseja continuar informando as notas (s/n)? ");
            escolha = entrada.next();
        }

        System.out.println("");
        System.out.println("As notas informadas são: " + listaNotasAluno);
        System.out.println("Total de " + listaNotasAluno.size() + " notas informadas.");
    }
}
