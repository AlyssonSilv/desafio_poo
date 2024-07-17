package com.silfi.iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroSerie;

    public iPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Chamada finalizada.");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url + "...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionado aos favoritos: " + url);
    }
}
