package org.example.model;

public class PhoneMain {
    public static void main(String[] args) {
        AparelhoTelefonico fone = new AparelhoTelefonico("988885555", "11");
        fone.iniciarCorreioDeVoz();

        AparelhoTelefonico fone2 = new AparelhoTelefonico("999991111", "21");

        fone.ligar(fone2);
        fone2.atender(fone);
    }
}
