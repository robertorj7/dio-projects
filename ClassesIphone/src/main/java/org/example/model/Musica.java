package org.example.model;

public class Musica {
    private Long id;
    private String nome;
    private String artista;
    private String album;

    public Musica(Long id, String nome, String artista, String album) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.album = album;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
