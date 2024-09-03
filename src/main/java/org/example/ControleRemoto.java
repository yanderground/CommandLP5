package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {

    private List<TarefaLuz> tarefas = new ArrayList<TarefaLuz>();

    public void executarTarefa(TarefaLuz tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (!tarefas.isEmpty()) {
            TarefaLuz tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(tarefas.size() - 1);
        }
    }
}

