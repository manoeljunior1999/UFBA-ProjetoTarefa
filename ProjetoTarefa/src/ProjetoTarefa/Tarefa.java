package ProjetoTarefa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tarefa {
	private String descricao;
	private boolean concluida;
	private int horasGastas;

	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
		this.horasGastas = 0;
	}

	public void finalizarTarefa(int horasGastas, String descricao) {
		if (!concluida) {
			this.horasGastas = horasGastas;
			this.descricao += " - " + descricao;
			this.concluida = true;
		}
		
	}

	public boolean isConcluida() {
		return concluida;
	}

	public int getHorasGastas() {
		return horasGastas;
	}

	@Override
	public String toString() {
		return descricao + " (Concluída: " + concluida + ")";
	}
}