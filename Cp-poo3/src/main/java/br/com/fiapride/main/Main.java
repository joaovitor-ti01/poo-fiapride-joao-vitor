package br.com.fiapride.main;

import br.com.fiapride.model.Guitarra;

public class Main {

    public static void main(String[] args) {

Guitarra guitarra1 = new Guitarra();
        Guitarra guitarra2 = new Guitarra();

        guitarra1.setModelo("Les Paul");
        guitarra1.setMarca("Gibson");
        guitarra1.setCor("Wine Red");
        guitarra1.setQuantidadeCordas(6);
        guitarra1.setAfinacao("Drop D");
        guitarra1.setCalibreCorda(0.10);

        guitarra2.setModelo("Stratocaster");
        guitarra2.setMarca("Fender");
        guitarra2.setCor("Azul");
        guitarra2.setQuantidadeCordas(6);
        guitarra2.setAfinacao("Standard E");
        guitarra2.setCalibreCorda(0.09);

        guitarra1.exibir();
        guitarra2.exibir();

        System.out.println("--------------------------------");

        System.out.println(guitarra1.abaixarAfinacao("Drop A"));
        System.out.println(guitarra2.abaixarAfinacao("Drop C"));

        System.out.println("--------------------------------");

        guitarra1.exibir();
        guitarra2.exibir();
    }
}