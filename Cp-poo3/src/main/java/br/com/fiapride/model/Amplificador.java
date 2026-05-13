package br.com.fiapride.model;

public class Amplificador {
    private String marca;
    private int potencia;

    public Amplificador(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public void exibir() {
        System.out.println("Marca do amp: " + marca);
        System.out.println("Potência: " + potencia + "W");
    }
    
}

