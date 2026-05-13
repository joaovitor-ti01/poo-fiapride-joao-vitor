package br.com.fiapride.model;

public class Violao extends Instrumento implements Afinavel {

    private String tipoMadeira;
    private String tipoCorda;

    public Violao(String marca, String cor, int quantidadeCordas,String tipoCorda,
                   String tipoMadeira) {

        super(marca, cor, quantidadeCordas);
        this.tipoCorda = tipoCorda;
        this.tipoMadeira = tipoMadeira;
    }
 
    @Override
    public void afinar() {

        System.out.println("Violão afinado.");
    }
    @Override
    public void exibirInformacoes() {

        super.mostrarBase();
        System.out.println("Tipo de corda: " + tipoCorda);
        System.out.println("Madeira: " + tipoMadeira);
    }
}