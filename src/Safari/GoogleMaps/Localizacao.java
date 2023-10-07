package Safari.GoogleMaps;

public class Localizacao {
  private String rua;
  private String bairro;
  private int numero;
  private String cidade;

  public Localizacao(String rua, String bairro, int numero, String cidade) {
    this.rua = rua;
    this.bairro = bairro;
    this.numero = numero;
    this.cidade = cidade;
  }

  @Override
  public String toString() {
    return "Localizacao [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + "]";
  }

  public String getRua() {
    return rua;
  }

  public String getBairro() {
    return bairro;
  }

  public int getNumero() {
    return numero;
  }

  public String getCidade() {
    return cidade;
  }

}