package Ipod;

public class Musica {
  private String titulo;
  private String artista;
  private String album;
  private double duracao;

  public Musica(String titulo, String artista, String album, double duracao) {
    this.titulo = titulo;
    this.artista = artista;
    this.album = album;
    this.duracao = duracao;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getArtista() {
    return artista;
  }

  public String getAlbum() {
    return album;
  }

  public double getDuracao() {
    return duracao;
  }

}
