package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleRemotoTest {

    ControleRemoto controleRemoto;
    Luz luzSala;
    Luz luzCozinha;

    @BeforeEach
    void setUp() {
        controleRemoto = new ControleRemoto();
        luzSala = new Luz("sala");
        luzCozinha = new Luz("cozinha");
    }

    @Test
    void deveLigarLuzSala() {
        TarefaLuz ligarLuzSala = new LigarLuzTarefa(luzSala);
        controleRemoto.executarTarefa(ligarLuzSala);

        assertEquals("Ligada", luzSala.getEstado());
    }

    @Test
    void deveDesligarLuzCozinha() {
        TarefaLuz ligarLuzCozinha = new LigarLuzTarefa(luzCozinha);
        TarefaLuz desligarLuzCozinha = new DesligarLuzTarefa(luzCozinha);

        controleRemoto.executarTarefa(ligarLuzCozinha);
        controleRemoto.executarTarefa(desligarLuzCozinha);

        assertEquals("Desligada", luzCozinha.getEstado());
    }

    @Test
    void deveCancelarDesligarLuzSala() {
        TarefaLuz ligarLuzSala = new LigarLuzTarefa(luzSala);
        TarefaLuz desligarLuzSala = new DesligarLuzTarefa(luzSala);

        controleRemoto.executarTarefa(ligarLuzSala);
        controleRemoto.executarTarefa(desligarLuzSala);

        controleRemoto.cancelarUltimaTarefa();

        assertEquals("Ligada", luzSala.getEstado());
    }
}
