package com.d3v.tasktracker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
  
  List<Tarefa> tarefas = new ArrayList<>();
  Tarefa tarefa = new Tarefa("Minha tarefa", "agora vai");

  @PostMapping
  public Tarefa criarTarefa(@RequestBody Tarefa tarefa){
	  tarefas.add(tarefa);
	  return tarefa;
  }
  
  @GetMapping
  public List<Tarefa> listaTarefas(){
	  tarefas.add(tarefa);
	  return tarefas;
  }
  
  @GetMapping(path="/{posicaoTarefa}")
  public Tarefa lerTarefa(@PathVariable int posicaoTarefa){
  	return tarefas.get(posicaoTarefa);
  }
  
  @DeleteMapping(path="/{posicaoTarefa}")
  public List<Tarefa> removerTarefa(@PathVariable int posicaoTarefa){
	  tarefas.remove(posicaoTarefa);
	  return tarefas;
  }
}
