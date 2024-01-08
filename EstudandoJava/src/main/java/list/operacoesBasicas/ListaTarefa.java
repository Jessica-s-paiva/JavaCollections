package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		super();
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa (String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa (String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefa tarefa: tarefaList) {
			if(tarefa.getDescricao().equals(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
}
