package org.example.heranca;

public class TwoDimensionShape {
    double largura;
    double altura;
    public TwoDimensionShape(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    void showDimension(){
        System.out.println("Dimensões do objeto são: largura:=  " + this.largura + "\n altura: altura:= " + this.altura + "." );
    }

}
