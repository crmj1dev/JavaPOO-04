package br.com.aplicativoMusica.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproduções;
    private int totalCurtidas;
    private int classificação;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalReproduções() {
        return totalReproduções;
    }
    public int getTotalCurtidas() {
        return totalCurtidas;
    }
    public int getClassificação() {
        return classificação;
    }

    public void curtir() {
        totalCurtidas++;
    }
    public void reproduzir() {
        totalReproduções++;
    }
}
