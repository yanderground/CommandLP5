package org.example;

public class LigarLuzAcao implements AcaoLuz {

    private Luz luz;

    public LigarLuzAcao(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        this.luz.ligar();
    }

    public void cancelar() {
        this.luz.desligar();
    }
}
