package org.example.model;

import java.util.List;
import java.util.Optional;

public class Navegador {
    private Long id;
    private String nome;

    public Navegador(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pagina exibirPagina(List<Pagina> favoritos, String url) throws Exception {
        Optional<Pagina> optional = favoritos.stream().filter(p -> p.getUrl().equals(url)).findFirst();
        if (optional.isEmpty()) {
            throw new Exception("Página não encontrada!");
        }

        return optional.get();
    }

    public void adicionarnovaAba() {
        System.out.println("Nova aba adicionada ao navegador");
    }

    public void atualizarPagina(Pagina pagina) {
        System.out.println("Página " + pagina.getNome() + " atualizada!");
    }
}
