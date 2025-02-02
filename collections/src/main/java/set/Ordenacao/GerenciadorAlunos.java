package main.java.set.Ordenacao;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    Set<Aluno> alunos;
    
    public GerenciadorAlunos(){
        this.alunos = new HashSet<>();
    }
    
   public void adicionarAluno(String nome, long matricula, double nota){
       alunos.add(new Aluno(nome, matricula, nota));
   }
    
    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunos.isEmpty()){
            for(Aluno a : alunos){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
                alunos.remove(alunoParaRemover);
            } 
        } else {
                throw new RuntimeException("O conjunto está vazio!");
        }
        }
        
        public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
    if (!alunos.isEmpty()) {
      System.out.println(alunosPorNome);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
    if (!alunos.isEmpty()) {
      alunosPorNota.addAll(alunos);
      System.out.println(alunosPorNota);
    } else {
      System.out.println("O conjunto está vazio!");
    }
    }
    
    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
            
            gerenciador.adicionarAluno("Charlie Brown", 12346L, 4.0);
            gerenciador.adicionarAluno("Lucy", 12347L, 5.5);
            gerenciador.adicionarAluno("Linus", 12348L, 5.0);
            gerenciador.adicionarAluno("Schroeder", 12349, 6.0);
            
            gerenciador.exibirAlunosPorNome();
            gerenciador.exibirAlunosPorNota();
            
    }
    
}