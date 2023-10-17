package main.java.model;

import main.java.dados.AparelhoTelefonico;
import main.java.dados.NavegadorInternet;
import main.java.dados.RepodutorMusicial;

public class Iphone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet {
  public Iphone() {
  }

  @Override
  public void tocar() {
    System.out.println();
  }

  @Override
  public void pausar() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'pausar'");
  }

  @Override
  public void selecionarMusica() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'selecionarMusica'");
  }

  @Override
  public void ligar() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'ligar'");
  }

  @Override
  public void atender() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'atender'");
  }

  @Override
  public void iniciarCorrerioVoz() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'iniciarCorrerioVoz'");
  }

  @Override
  public void exibirPagina() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'exibirPagina'");
  }

  @Override
  public void adicionarNovaAba() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'adicionarNovaAba'");
  }

  @Override
  public void atualizarPagina() {
    // TODO Auto-generated method stub
    System.out.println("implemente method 'atualizarPagina'");
  }

}
