package org.example;

public class DesligarLuzAcao implements AcaoLuz {

    private Luz luz;

    public DesligarLuzAcao(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        this.luz.desligar();
    }

    public void cancelar() {
        this.luz.ligar();
    }
}

