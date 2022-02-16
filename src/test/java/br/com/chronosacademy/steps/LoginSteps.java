package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
    LoginPage loginPage;

    @Before
    public void iniciaNavegador(){
        new Driver("chrome");
    }

    @After
    public void fechaNavegador() {
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado o clique fora da modal")
    public void forRealizadoOCliqueForaDaModal() {
       loginPage.clickDivFecharModal();
    }
    @Entao("a janela deve ser fechada")
    public void aJanelaDeveSerFechada() {

    }

    @Quando("for realizado um clique no icone de fechar modal")
    public void forRealizadoUmCliqueNoIconeDeFecharModal() {
       loginPage.clickBtnFechar();
    }

    @Quando("for realizado o clique em create new account")
    public void forRealizadoOCliqueEmCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a página create account deve ser exibida")
    public void aPáginaCreateAccountDeveSerExibida() {
        
    }

    @Quando("os campos de login forem preenchidos com os valores")
    public void osCamposDeLoginForemPreenchidosComOsValores() {

    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        
    }

    @Entao("deve ser possível logar no sistema")
    public void deveSerPossívelLogarNoSistema() {
        
    }

    @Entao("o sisitema devera exibir uma mensagem de erro")
    public void oSisitemaDeveraExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {

    }
}
