package br.com.fiapride.model;

public class Guitarra {

    public String modelo;
    public String marca;
    public int quantidadeCordas;
    public String cor;
    public String afinacao;
    public double calibreCorda;

    public void exibir() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade de Cordas: " + quantidadeCordas);
        System.out.println("Afinação: " + afinacao);
        System.out.println("Cor: " + cor);
        System.out.println("Calibre da Corda: " + calibreCorda);
    }

    public String abaixarAfinacao(String novaAfinacao) {

        if (novaAfinacao.equalsIgnoreCase("Drop C") && calibreCorda < 0.11) {
            return "Cordas muito finas para Drop C.";
        }

        afinacao = novaAfinacao;

        return "Afinação alterada para " + afinacao;
    }
}