package br.com.fiapride.main;

import br.com.fiapride.model.Guitarra;

public class Main {

    public static void main(String[] args) {

        Guitarra guitarra1 = new Guitarra();
        Guitarra guitarra2 = new Guitarra();

        guitarra1.modelo = "Les Paul";
        guitarra1.marca = "Gibson";
        guitarra1.cor = "Wine Red";
        guitarra1.quantidadeCordas = 6;
        guitarra1.afinacao = "Drop D";
        guitarra1.calibreCorda = 0.10;

        guitarra2.modelo = "Stratocaster";
        guitarra2.marca = "Fender";
        guitarra2.cor = "Azul";
        guitarra2.quantidadeCordas = 6;
        guitarra2.afinacao = "Standard E";
        guitarra2.calibreCorda = 0.09;

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