package main.java.set.Pesquisa;

public class Tarefa {
    
    private String descricao;
    private boolean concluido;
    
    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public boolean getConcluido(){
        return concluido;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setConcluido(boolean concluido){
        this.concluido = concluido;
    }
    
    @Override
    public String toString(){
        return
        String.format("Descrição = '%s'\nConcluído = %b\n", descricao, concluido);
    }
}