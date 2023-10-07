package Agenda;

public interface Agenda {

  public void fazerChamada(Contato contato);

  public void encerrarChamada();

  public Contato adicionarContato(String nome, String numero);

  public Contato editarContato(Contato contato, String novoNome, String novoNumero);
}
