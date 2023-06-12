package org.example.foreach;

public class TesteForEachJava {
    public static void main(String[] args) {
        System.out.println("Imprimindo a relação dos meses do ano:");

        String meses[] = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto",
                            "setembro","outubro","novembro","dezembro"};

        for (String mesDoAno: meses) {
            System.out.println(mesDoAno.toUpperCase());
        }


    }

}
