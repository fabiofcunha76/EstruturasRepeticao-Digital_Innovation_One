package org.example.estudoInterfaces;

public class TesteCalculadoraInterface {

    public static void main(String[] args) {

        Calculadora calculator = new Calculadora();

        System.out.println("Multiplicação: " + calculator.multiplicacao(2.5, 2));

        System.out.println("Soma: " + calculator.soma(2.5, 2.5));
    }
}
