package iphone;

public class Iphone implements
        NavegadorInternet,
        AparelhoTelefonico,
        ReprodutorMusical {


    public void aumentarVolume(){
        System.out.println("Aumentando volume");
    }

    public void abaixarVolume() {
        System.out.println("Abaixando volume");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }
}
