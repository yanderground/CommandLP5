package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {

    private List<AcaoLuz> tarefas = new ArrayList<AcaoLuz>();

    public void executarTarefa(AcaoLuz tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (!tarefas.isEmpty()) {
            AcaoLuz tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(tarefas.size() - 1);
        }
    }
}

