package models;

import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    private boolean emChamada;
    private String numeroAtual;

    public void ligar(String numero) {
        this.numeroAtual = numero;
        this.emChamada = true;
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        this.emChamada = true;
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}