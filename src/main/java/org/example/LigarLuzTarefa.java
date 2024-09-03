package org.example;

public class LigarLuzTarefa implements TarefaLuz {

    private Luz luz;

    public LigarLuzTarefa(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        this.luz.ligar();
    }

    public void cancelar() {
        this.luz.desligar();
    }
}
