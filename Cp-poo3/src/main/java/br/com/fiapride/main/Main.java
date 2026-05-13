package br.com.fiapride.main;

import br.com.fiapride.model.Amplificador;
import br.com.fiapride.model.Guitarra;
import br.com.fiapride.model.Violao;

public class Main {

    public static void main(String[] args) {
        
        Amplificador amp= new Amplificador("Orange", 120);
        Guitarra guitarra = new Guitarra("Les Paul", "Gibson", 6,"Wine Red", "Drop D", 0.10);
        Violao violao = new Violao("Yamaha","Natural",6,"Mogno");
        guitarra.setAmplificador(amp);
       
        guitarra.exibir();
       
        System.out.println("--------------------------------");
        System.out.println(guitarra.abaixarAfinacao("Drop A"));
        System.out.println("--------------------------------");
        
        guitarra.exibir();
        System.out.println("----------------");
        violao.exibir();
    }
}