package org.example;

import org.example.model.Musica;
import org.example.model.ReprodutorMusical;

import java.util.List;

public class PlayerMain {
    public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical("VLC");
        Musica patience = new Musica(
                1125L,
                "Patience",
                "Guns n' Roses",
                "G N' R Lies");
        Musica smells = new Musica(
                1545L,
                "Smells Like Teen Spirit",
                "Nirvana",
                "Nevermind");

        Musica musicaEscolhida = null;

        try {
            musicaEscolhida = player.selecionarMusica(List.of(patience, smells), 1545L);
        } catch (Exception e) {
            throw new RuntimeException("Música não encontrada");
        }
        player.tocar(musicaEscolhida);
        player.pausar(musicaEscolhida);
    }
}