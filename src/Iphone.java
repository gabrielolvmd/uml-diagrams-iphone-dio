import Ipod.Ipod;
import Ipod.Musica;
import Agenda.Contato;
import Agenda.Agenda;
import Safari.Safari;
import Safari.GoogleMaps.Localizacao;
import Safari.MailService.Email;

public class Iphone extends Safari implements Ipod, Agenda {

    protected String email;
    protected String senha;
    private Safari safari;

    public Iphone() {
        safari = new Safari();
    }

    public Safari getSafari() {
        return safari;
    }

    @Override
    public void tocaMusica(Musica musica) {
        System.out.println("Tocando " + musica.getTitulo() + " de " + musica.getArtista());
    }

    @Override
    public void pausaMusica() {
        System.out.println("Musica pausada");
    }

    @Override
    public void proxMusica() {
        System.out.println("Reproduzindo próxima música");
    }

    @Override
    public void voltaMusica() {
        System.out.println("Reproduzindo música anterior");
    }

    @Override
    public boolean salvaMusica(Musica musica) {
        System.out.println("Música: " + musica.getTitulo() + " do album " + musica.getAlbum() + " salva com sucesso!");
        return true;
    }

    @Override
    public void fazerChamada(Contato contato) {
        System.out.println("Ligando para " + contato.getNome());
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    @Override
    public Contato adicionarContato(String nome, String numero) {
        Contato novoContato = new Contato("Gabriel", "586314862");
        return novoContato;
    }

    @Override
    public Contato editarContato(Contato contato, String novoNome, String novoNumero) {
        System.out.println("Contato " + contato + "atualizado com sucesso!");
        return contato = new Contato(novoNome, novoNumero);
    }

    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();
        Musica musicaNova = new Musica("Diz a verdade", "Manim Vaqueiro", "Sonhe e realize", 2.5);
        Contato contatoNovo = new Contato("Gabriel", "89165161");
        Localizacao joaoPessoa = new Localizacao("Joao 123", "Centro", 253, "João Pessoa");
        Email novoEmail = new Email("joaodasilva@gmail.com", "Bom dia, João!");

        iphone.tocaMusica(musicaNova);
        iphone.fazerChamada(contatoNovo);

        iphone.getSafari().getGoogleMaps().rotas(joaoPessoa);
        iphone.getSafari().getMailService().enviaEmail(novoEmail);
    }
}
