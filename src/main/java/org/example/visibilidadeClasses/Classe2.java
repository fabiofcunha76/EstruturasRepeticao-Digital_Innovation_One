package org.example.visibilidadeClasses;

public class Classe2 extends Classe1{

    String atributoClasse2;

    void exibeAtributoClasseMae (){
        System.out.println(super.atributo2); //atributo protected acessivel pela subclasse e demais classes do mesmo pacote
        System.out.println(super.atributo3); //atributo publico
    }
}
