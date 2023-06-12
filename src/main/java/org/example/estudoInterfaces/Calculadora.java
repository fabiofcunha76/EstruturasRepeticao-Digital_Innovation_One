package org.example.estudoInterfaces;

public class Calculadora  implements OperacoesMatematicas{

    @Override
    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }
}
