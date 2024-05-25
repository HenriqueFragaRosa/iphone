public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.pausar();
    }

    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
        tocar();
    }
}
