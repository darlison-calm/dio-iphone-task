package models;

import java.util.ArrayList;
import java.util.List;
import interfaces.NavegadorInternet;

public class SafariNavegador implements NavegadorInternet {
    
  private String paginaAtual;
  private List<String> listaAbas;
    
  public SafariNavegador() {
      listaAbas = new ArrayList<>();
  }
  public void exibirPagina(String url) {
      this.paginaAtual = url;
      System.out.println("Exibindo página: " + url);
  }
  
  public void adicionarNovaAba() {
      listaAbas.add("Nova aba");
      System.out.println("Nova aba adicionada");
  }
  
  public void atualizarPagina() {
      System.out.println("Atualizando página: " + paginaAtual);
  }
}
