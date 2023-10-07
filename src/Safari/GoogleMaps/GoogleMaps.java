package Safari.GoogleMaps;

public class GoogleMaps {

  public Localizacao rotas(Localizacao localizacao) {
    System.out.println("Estabelendo rotas para: " + localizacao);
    return localizacao;
  };

  public static void salvaEndereco(String nome, Localizacao localizacao) {
    System.out.println("O endereço de: " + nome + " foi salvo para " + localizacao);
  }

  public static void removeEndereco(Localizacao endereco) {
    System.out.println("Endereço:" + endereco + " removido!");
  }
}
