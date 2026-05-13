package br.com.fiapride.model;

public class Violao extends Instrumento {

    private String tipoMadeira;

    public Violao(String marca, String cor, int quantidadeCordas,
                   String tipoMadeira) {

        super(marca, cor, quantidadeCordas);

        this.tipoMadeira = tipoMadeira;
    }

    public void exibir() {

        exibirInformacoes();

        System.out.println("Madeira: " + tipoMadeira);
    }
}