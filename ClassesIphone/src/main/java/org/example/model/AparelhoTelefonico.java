package org.example.model;

public class AparelhoTelefonico {
    private Long id;
    private String numero;
    private String ddd;

    public AparelhoTelefonico(String numero, String ddd) {
        this.numero = numero;
        this.ddd = ddd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void ligar(AparelhoTelefonico telefone) {
        System.out.println("Ligando para: (" + telefone.getDdd() + ") " + telefone.getNumero());
    }

    public void atender(AparelhoTelefonico telefone) {
        System.out.println("Recebendo ligação de: (" +
                telefone.getDdd() + ") " + telefone.getNumero());
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
