package br.com.fiapride.model;

public class Guitarra {

    private String modelo;
    private String marca;
    private int quantidadeCordas;
    private String cor;
    private String afinacao;
    private double calibreCorda;
    
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.isEmpty()) {
            System.out.println("Modelo inválido.");
            return;
        }
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
            if (marca.isEmpty()) {
                System.out.println("Marca inválida.");
            return;
        }
        this.marca = marca;
    }

    public int getQuantidadeCordas() {
        return quantidadeCordas;
    }

    public void setQuantidadeCordas(int quantidadeCordas) {
         if (quantidadeCordas <= 0) {
            System.out.println("Quantidade de cordas inválida.");
            return;
        }
        this.quantidadeCordas = quantidadeCordas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
         if (cor.isEmpty()) {
            System.out.println("Cor inválida.");
            return;
        }
        this.cor = cor;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
         if (afinacao.isEmpty()) {
            System.out.println("Afinação inválida.");
            return;
        }
        this.afinacao = afinacao;
    }

    public double getCalibreCorda() {
        return calibreCorda;
    }

    public void setCalibreCorda(double calibreCorda) {
        this.calibreCorda = calibreCorda;
    }
    
    
}