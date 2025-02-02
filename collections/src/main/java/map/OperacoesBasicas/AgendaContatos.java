package main.java.map.OperacoesBasicas;
import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    
    private Map<String, Integer> contatos;
    
    public AgendaContatos(){
        this.contatos = new HashMap<>();
    }
    
    public void adicionarContato(String nome, int telefone){
        contatos.put(nome, telefone);
    }
    
    public void removerContato(String nome){
        if(!contatos.isEmpty()){
            contatos.remove(nome);
        } else{
            System.out.println("A agenda está vazia");
        }
    }
    
    public void exibirContatos(){
        System.out.println(contatos);
    }
    
      public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!contatos.isEmpty()) {
      numeroPorNome = contatos.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato não encontrado na agenda.");
      }
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
    return numeroPorNome;
      }
    
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.adicionarContato("Freddie Mercury", 1234567);
        agendaContatos.adicionarContato("Brian May", 1234678);
        agendaContatos.adicionarContato("John Deacon", 1234789);
        agendaContatos.adicionarContato("Roger Taylor", 1234890);
        
        agendaContatos.exibirContatos();
        System.out.println();
        agendaContatos.removerContato("Freddie Mercury");
        agendaContatos.pesquisarPorNome("Freddie Mercury");
        System.out.println();
        agendaContatos.exibirContatos();
        
    }
    
}