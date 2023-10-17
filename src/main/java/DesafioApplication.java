package main.java;

import main.java.model.Iphone;

public class DesafioApplication {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    
    // reprodutor musical
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();

    // aparelho telefonico
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorrerioVoz();

    // navegador de internet
    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}