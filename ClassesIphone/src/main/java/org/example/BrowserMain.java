package org.example;

import org.example.model.Navegador;
import org.example.model.Pagina;

import java.util.List;

public class BrowserMain {
    public static void main(String[] args) {
        Navegador chrome = new Navegador("Chrome");
        Pagina terra = new Pagina("Terra", "terra.com.br");
        Pagina uol = new Pagina("Uol", "uol.com.br");
        chrome.adicionarnovaAba();

        try {
            System.out.println(chrome.exibirPagina(List.of(terra, uol), "uol.com.br").getNome());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        chrome.atualizarPagina(uol);
    }
}
