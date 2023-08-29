package ProjetoTarefa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Projeto {
	private String nome;
	private List<Tarefa> tarefas;
	private Map<String, Double> valorPorResponsavel;

	public Projeto(String nome) {
		this.nome = nome;
		this.tarefas = new ArrayList<>();
		this.valorPorResponsavel = new HashMap<>();
	}

	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}

	public void adicionarTarefa(Tarefa tarefa, String responsavel) {
		tarefas.add(tarefa);
		valorPorResponsavel.put(responsavel, valorPorResponsavel.getOrDefault(responsavel, 0.0) + 150.00); 
																											
	}

	public double calcularValorProjeto() {
		double valorTotal = 0.0;
		for (double valor : valorPorResponsavel.values()) {
			valorTotal += valor;
		}
		return valorTotal;
	}

	@Override
	public String toString() {
		return nome + " - Valor: R$ " + calcularValorProjeto();
	}
}