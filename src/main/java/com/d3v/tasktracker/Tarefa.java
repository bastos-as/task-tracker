package com.d3v.tasktracker;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tarefa {
  private String nomeTarefa;
  private String descricaoTarefa;
  
	public Tarefa(String nomeTarefa, String descricaoTarefa) {
		this.nomeTarefa = nomeTarefa;
		this.descricaoTarefa = descricaoTarefa;
	}

	public Tarefa() {
	}
	
	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}
  
}