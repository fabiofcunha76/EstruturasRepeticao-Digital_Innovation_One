package org.example.visibilidadeClasses;

public class Classe1 {

    private String atributo1; //uso e acesso somente pela própria classe, subclasse não herda e nem acessa

    protected String atributo2; //acessivel pelas subclasse e demais classes do mesmo pacote

    public String atributo3; //acesso geral de qualquer lugar e por qualquer classe

}
