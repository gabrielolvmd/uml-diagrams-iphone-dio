package Agenda;

public class Contato {
  private String nome;
  private String numero;
  // a opção de usar numero como string é pela possibilidade do numero começar com
  // "0" em alguns casos.

  public Contato(String nome, String numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public String getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return "Contato [nome=" + nome + ", numero=" + numero + "]";
  }

}
