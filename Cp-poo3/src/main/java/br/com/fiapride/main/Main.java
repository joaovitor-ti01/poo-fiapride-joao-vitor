package br.com.fiapride.main;

import br.com.fiapride.model.Afinavel;
import br.com.fiapride.model.Amplificador;
import br.com.fiapride.model.Guitarra;
import br.com.fiapride.model.Instrumento;
import br.com.fiapride.model.Violao;

public class Main {

    public static void main(String[] args) {

        Amplificador amp = new Amplificador("Orange", 120);

        Guitarra guitarra = new Guitarra("Les Paul","Gibson",6,"Wine Red","Drop D",0.10);

        Violao violao = new Violao("Yamaha","Natural",6,"Nylon","Mogno");
        guitarra.setAmplificador(amp);

        System.out.println("========== GUITARRA ==========");
        guitarra.exibirInformacoes();
        
        System.out.println("--------------------------------");
        System.out.println(guitarra.abaixarAfinacao("Drop C"));
        System.out.println("--------------------------------");

        guitarra.exibirInformacoes();

        System.out.println("\n========== VIOLÃO ==========");
        violao.exibirInformacoes();

        System.out.println("\n========== POLIMORFISMO ==========");

        Instrumento instrumento1 = guitarra;
        Instrumento instrumento2 = violao;

        instrumento1.exibirInformacoes();
        System.out.println("----------------");
        instrumento2.exibirInformacoes();
        
        Afinavel afinavel1 = guitarra;
        Afinavel afinavel2 = violao;

        afinavel1.afinar();
        afinavel2.afinar();
    }
}