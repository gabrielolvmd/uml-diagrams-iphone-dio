package Safari.MailService;

public class Email {
  private String emailDestino;
  private String conteudo;

  public Email(String emailDestino, String conteudo) {
    this.emailDestino = emailDestino;
    this.conteudo = conteudo;
  }

  public String getEmailDestino() {
    return emailDestino;
  }

  public String getConteudo() {
    return conteudo;
  }

  @Override
  public String toString() {
    return "Email [emailDestino=" + emailDestino + ", conteudo=" + conteudo + "]";
  }
}
