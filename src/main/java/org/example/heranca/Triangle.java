package org.example.heranca;

public class Triangle extends TwoDimensionShape{
    public Triangle(double largura, double altura) {
        super(largura, altura);
    }

    double area(){
        return largura * altura/2;
    }
}
