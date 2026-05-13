
package br.com.fiapride.model;


public abstract class Instrumento {
    protected String marca;
    protected String cor;
    protected int quantidadeCordas;

    public Instrumento(String marca, String cor, int quantidadeCordas) {
        this.marca = marca;
        this.cor = cor;
        this.quantidadeCordas = quantidadeCordas;
    }
    public void mostrarBase() {

        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de Cordas: " + quantidadeCordas);
    }
    
    public abstract void exibirInformacoes();
}
