package br.com.fiapride.model;

public class Guitarra extends Instrumento implements Afinavel {

    private String modelo;
    private String afinacao;
    private double calibreCorda;
    private Amplificador amplificador;

    public Guitarra() {

        this("","",6,"","Standard E",0.10);
    }

    public Guitarra(String modelo, String marca, int quantidadeCordas,
                     String cor, String afinacao, double calibreCorda) {

        super(marca, cor, quantidadeCordas);

        this.modelo = modelo;
        this.afinacao = afinacao;
        this.calibreCorda = calibreCorda;
    }

    @Override
    public void afinar() {

        System.out.println("Guitarra afinada em " + afinacao);
    }

    @Override
    public void exibirInformacoes() {

        super.mostrarBase();

        System.out.println("Modelo: " + modelo);
        System.out.println("Afinação: " + afinacao);
        System.out.println("Calibre da Corda: " + calibreCorda);

        if (amplificador != null) {
            amplificador.exibir();
        }
    }

    public String abaixarAfinacao(String novaAfinacao) {

        if (novaAfinacao.equalsIgnoreCase("Drop C") && calibreCorda < 0.11) {
            return "Cordas muito finas para Drop C.";
        }

        afinacao = novaAfinacao;

        return "Afinação alterada para " + afinacao;
    }

    public Amplificador getAmplificador() {
        return amplificador;
    }

    public void setAmplificador(Amplificador amplificador) {
        this.amplificador = amplificador;
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

        if (calibreCorda <= 0) {
            System.out.println("Calibre inválido.");
            return;
        }

        this.calibreCorda = calibreCorda;
    }
}