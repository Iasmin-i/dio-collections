package main.java.list.Ordenacao;
import java.util.*;

public class OrdenacaoPessoas {
    
    private List<Pessoa> pessoaList;
    
    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordernarPorIdade(){
        
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
        
        }
        
          public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
        
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        
        
    // Adicionando pessoas à lista
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.pessoaList);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoas.ordernarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
        
        
        
        
    }
    
}