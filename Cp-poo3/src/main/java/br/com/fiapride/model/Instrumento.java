
package br.com.fiapride.model;


public class Instrumento {
    protected String marca;
    protected String cor;
    protected int quantidadeCordas;

    public Instrumento(String marca, String cor, int quantidadeCordas) {
        this.marca = marca;
        this.cor = cor;
        this.quantidadeCordas = quantidadeCordas;
    }
    
    public void exibirInformacoes() {

        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de cordas: " + quantidadeCordas);
    }
}
