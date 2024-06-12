import Devices.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.print("Selecione a música: ");
        String musica = sc.next();
        iphone.setMusicaAtual(musica);
        iphone.selecionarMusica(iphone.getMusicaAtual());
        iphone.tocarMusica();
        iphone.pausarMusica();


        System.out.print("Digite o número de telefone: ");
        String telefone = sc.next();
        iphone.setTelefone(telefone);
        iphone.ligar(iphone.getTelefone());
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.print("Insira a url da página: ");
        String pagina = sc.next();
        iphone.setSite(pagina);
        iphone.exibirPagina(iphone.getSite());
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();


        sc.close();
        }
    }