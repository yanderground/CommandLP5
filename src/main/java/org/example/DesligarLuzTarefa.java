package org.example;

public class DesligarLuzTarefa implements TarefaLuz {

    private Luz luz;

    public DesligarLuzTarefa(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        this.luz.desligar();
    }

    public void cancelar() {
        this.luz.ligar();
    }
}

