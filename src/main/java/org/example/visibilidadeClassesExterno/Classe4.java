package org.example.visibilidadeClassesExterno;

import org.example.visibilidadeClasses.Classe1;

public class Classe4 {

    Classe1 classeOriginal;

    void exibeDadosSuperClasse(){
        System.out.println(classeOriginal.atributo3);//atributo publico acessivel de qualquer lugar

    }
}
