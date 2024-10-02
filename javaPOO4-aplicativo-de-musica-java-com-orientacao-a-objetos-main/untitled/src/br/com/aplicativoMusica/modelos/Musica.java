package br.com.aplicativoMusica.modelos;

import br.com.aplicativoMusica.modelos.Audio;

public class Musica extends Audio {
    private String cantor;
    private String genero;
    private String album;

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificação() {
        if (getTotalReproduções() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
