package Devices;

import Functions.AparelhoTelefonico;
import Functions.NavegadorInternet;
import Functions.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String telefone;
    private String musicaAtual;
    private String site;
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public void tocarMusica() {
        if(musicaAtual == null){
            System.out.println("Nenhuma música selecionada, por favor, selecione uma música.");
        }else{
            System.out.println("Tocando música: " + musicaAtual);
        }

    }

    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada: " + musicaAtual);

    }

    @Override
    public void selecionarMusica(String musica) {
        if (musica == null){
            System.out.println("Selecione uma música ");
        }else {
            musicaAtual = musica;
            System.out.println("Música Selecionada " + musicaAtual);
        }

    }

    @Override
    public void ligar(String numero) {
        if(numero != telefone){
            System.out.println("Esse número não existe");
        }else {
            telefone = numero;
            System.out.println("Ligando para: " + telefone);
        }
    }


    @Override
    public void atender() {
        boolean ligacaoAtendida = false;
        if (ligacaoAtendida == true){
            System.out.println("Chamada atendida");
        }else{
            System.out.println("ligação perdida");
        }
    }


    @Override
    public void iniciarCorreioVoz() {
        boolean ligarParaPessoa = false;
        if(!ligarParaPessoa == true){
            System.out.println("Deixar recado de voz");
        }
    }

    @Override
    public void exibirPagina(String url) {
        if(url == site){
            System.out.println(site);
        }else{
            System.err.println("Acesse um site válido.");
        }
    }


    @Override
    public void adicionarNovaAba() {
        String novaAba = site;
        if(novaAba != null){
            System.out.println("Nova aba adicionada");

        }
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada...");


    }
}
