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
        AcaoLuz ligarLuzSala = new LigarLuzAcao(luzSala);
        controleRemoto.executarTarefa(ligarLuzSala);

        assertEquals("Ligada", luzSala.getEstado());
    }

    @Test
    void deveDesligarLuzCozinha() {
        AcaoLuz ligarLuzCozinha = new LigarLuzAcao(luzCozinha);
        AcaoLuz desligarLuzCozinha = new DesligarLuzAcao(luzCozinha);

        controleRemoto.executarTarefa(ligarLuzCozinha);
        controleRemoto.executarTarefa(desligarLuzCozinha);

        assertEquals("Desligada", luzCozinha.getEstado());
    }

    @Test
    void deveCancelarDesligarLuzSala() {
        AcaoLuz ligarLuzSala = new LigarLuzAcao(luzSala);
        AcaoLuz desligarLuzSala = new DesligarLuzAcao(luzSala);

        controleRemoto.executarTarefa(ligarLuzSala);
        controleRemoto.executarTarefa(desligarLuzSala);

        controleRemoto.cancelarUltimaTarefa();

        assertEquals("Ligada", luzSala.getEstado());
    }
}
