package org.example.model;

import java.util.List;
import java.util.Optional;

public class ReprodutorMusical {
    private Long id;
    private String nome;

    public ReprodutorMusical(String nome) {
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

    public void tocar(Musica musica) {
        System.out.println("Tocando " + musica.getNome() + ", de " + musica.getArtista());
    }

    public void pausar(Musica musica) {
        System.out.println("Música " + musica.getNome() + " pausada!");
    }

    public Musica selecionarMusica(List<Musica> playlist, Long id) throws Exception {
        Optional<Musica> optional = playlist.stream().filter(m -> m.getId().equals(id)).findFirst();
         if (optional.isEmpty()) {
             throw new Exception("Música não encontrada!");
         }

         return optional.get();
    }
}
