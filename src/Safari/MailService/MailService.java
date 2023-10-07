package Safari.MailService;

public class MailService {
  public void enviaEmail(Email email) {
    System.out.println("E-mail enviado para " + email.getEmailDestino() + "!\n" + "Conteúdo: " + email.getConteudo());
  }
}
