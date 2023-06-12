package org.example.heranca;


public class Shapes {

    public static void main(String[] args) {

        Triangle tri1 = new Triangle(4.0, 8.0);

        System.out.println("Area deste triângulo é: " + tri1.area() );

        tri1.showDimension();
    }

}
