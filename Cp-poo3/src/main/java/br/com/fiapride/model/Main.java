package br.com.fiapride.model;

import br.com.fiapride.model.Guitarra;
import br.com.fiapride.model.Guitarra;

public class Main {
    public static void main(String[] args) {

        Guitarra guitarra1 = new Guitarra();
        Guitarra guitarra2 = new Guitarra();

        guitarra1.modelo = "Les Paul";
        guitarra1.marca = "Gibson";
        guitarra1.quantidadeCordas = 6; 
        guitarra1.cor = "Wine Red"; 
        guitarra1.afinacao = "Standard D"; 
        guitarra1.calibreCorda = 0.10;
        
        guitarra2.modelo = "Stratocaster";
        guitarra2.marca = "Fender";
        guitarra2.quantidadeCordas = 6; 
        guitarra2.cor = "Blue"; 
        guitarra2.afinacao = "Standard E"; 
        guitarra2.calibreCorda = 0.09;
        
        System.out.println("Minha guitarra é a " + guitarra1.modelo + " da marca " + guitarra1.marca + "com a cor " + guitarra1.cor + " com a afinação " + guitarra1.afinacao + " com o calibre de corda de " + guitarra1.calibreCorda);
        
        System.out.println("Minha guitarra é a " + guitarra2.modelo + " da marca " + guitarra2.marca + "com a cor " + guitarra2.cor + " com a afinação " + guitarra2.afinacao + " com o calibre de corda de " + guitarra2.calibreCorda);

    }
}