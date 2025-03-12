import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import models.Ipod;
import models.SafariNavegador;
import models.Telefone;

public class Iphone {

  private ReprodutorMusical reprodutorMusical;
  private AparelhoTelefonico aparelhoTelefonico;
  private NavegadorInternet navegadorInternet;

  public Iphone() {
    this.reprodutorMusical = new Ipod();
    this.aparelhoTelefonico = new Telefone();
    this.navegadorInternet = new SafariNavegador();
  }

  public ReprodutorMusical acessarReprodutorMusical() {
    return this.reprodutorMusical;
  }

  public AparelhoTelefonico acessarAparelhoTelefonico() {
    return this.aparelhoTelefonico;
  }

  public NavegadorInternet acessarNavegadorInternet() {
    return this.navegadorInternet;

  }

  public static void main(String[] args) {
    Iphone meuIPhone = new Iphone();

    ReprodutorMusical reprodutor = meuIPhone.acessarReprodutorMusical();
    reprodutor.selecionarMusica("Mamãe eu quero");
    reprodutor.tocar();
    reprodutor.pausar();

    AparelhoTelefonico telefone = meuIPhone.acessarAparelhoTelefonico();
    telefone.ligar("123-456-789");
    telefone.atender();
    telefone.iniciarCorreioVoz();

    NavegadorInternet navegador = meuIPhone.acessarNavegadorInternet();
    navegador.exibirPagina("https://www.apple.com");
    navegador.adicionarNovaAba();
    navegador.atualizarPagina();
  }

}
