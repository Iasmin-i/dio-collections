package main.java.list.OperacoesBasicas;
import java.util.*;

public class ListaTarefas {
    
   private List <Tarefa> tarefas;
  
  public ListaTarefas(){
    this.tarefas = new ArrayList<>();
  }
    
    
    public void adicionarTarefa(String descricao){
      Tarefa tarefa = new Tarefa(descricao);
      this.tarefas.add(tarefa);
    }
    
  public void removerTarefa(int index) {
    if (!tarefas.isEmpty()) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    } else {
        System.out.println("A lista está vazia!");
    }
}
    
    public int obterNumeroTotalTarefas(){
      String mensagem = " Número de tarefas";
      return tarefas.size();
    }
    
    public void obterDescricaoTarefas(){
     System.out.println(tarefas);
    }
    
    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();
      
         listaTarefas.adicionarTarefa("Exercício Collections API");
         listaTarefas.adicionarTarefa("Exercício Stream API");
         listaTarefas.adicionarTarefa("Exercício Lambda Expression");
         listaTarefas.adicionarTarefa("Exercício Collections API");
         listaTarefas.obterDescricaoTarefas();
         System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
      
         listaTarefas.removerTarefa(0);
         listaTarefas.obterDescricaoTarefas();
         System.out.println("Novo número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
      
    }
    
}