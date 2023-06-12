package org.example.visibilidadeClasses;

public class Classe3 {

    Classe1 classeOriginal;

    void exibeDadosClasseMae(){
        System.out.println(classeOriginal.atributo2); //atributo protected acessível subclasses e classes do mesmo pacote
        System.out.println(classeOriginal.atributo3); //atributo publico
    }

}
