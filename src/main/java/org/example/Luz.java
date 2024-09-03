package org.example;

public class Luz {

    private String local;
    private String estado;

    public Luz(String local) {
        this.local = local;
        this.estado = "Desligada";
    }

    public String getEstado() {
        return estado;
    }

    public void ligar() {
        this.estado = "Ligada";
        System.out.println("A luz do " + local + " foi ligada.");
    }

    public void desligar() {
        this.estado = "Desligada";
        System.out.println("A luz do " + local + " foi desligada.");
    }
}
