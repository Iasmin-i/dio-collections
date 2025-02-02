package main.java.map.Ordenacao;

public class Evento {
    
    private String nomeEvento;
    private String atracao;
    
    public Evento(String nomeEvento, String atracao){
        this.nomeEvento = nomeEvento;
        this.atracao = atracao;
    }
    
    public String getNomeEvento(){
        return nomeEvento;
    }
    public String getAtracao(){
        return atracao;
    }
    
    public void setNome(String nomeEvento){
        this.nomeEvento = nomeEvento;
    }
    public void setAtracao(String atracao){
        this.atracao = atracao;
    }
    
    public String toString(){
        return
        String.format("Nome do evento = %s\nNome da atração = %s\n", nomeEvento, atracao);
    }
    
    
}