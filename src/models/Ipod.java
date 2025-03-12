package models;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    private String musicaAtual;
    private boolean tocando;

    public void tocar() {
        this.tocando = true;
        System.out.println("Tocando: " + musicaAtual);
    }

    public void pausar() {
        this.tocando = false;
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
