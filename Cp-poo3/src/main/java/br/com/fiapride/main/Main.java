package br.com.fiapride.main;

import br.com.fiapride.model.Amplificador;
import br.com.fiapride.model.Guitarra;

public class Main {

    public static void main(String[] args) {
        Amplificador amp1 = new Amplificador("Marshall", 100);
        Amplificador amp2 = new Amplificador("Orange", 120);
        Guitarra guitarra1 = new Guitarra("Les Paul", "Gibson", 6,"Wine Red", "Drop D", 0.10);
        Guitarra guitarra2 = new Guitarra("Stratocaster", "Fender", 6, "Azul", "Standard E", 0.09);
        
        guitarra1.setAmplificador(amp2);
        guitarra2.setAmplificador(amp1);
        
        guitarra1.exibir();
        guitarra2.exibir();

        System.out.println("--------------------------------");

        System.out.println(guitarra1.abaixarAfinacao("Drop A"));
        System.out.println(guitarra2.abaixarAfinacao("Drop C"));

        System.out.println("--------------------------------");

        guitarra1.getAmplificador().exibir();
        guitarra2.getAmplificador().exibir();
    }
}