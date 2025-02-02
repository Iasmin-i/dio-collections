package main.java.list.Pesquisa;
import java.util.*;

public class CatalogoLivros {
    
    List<Livro> livros;
    
    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    
    
    public List<Livro> pesquisarPorAutor(String autor){
            List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro l : livros) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    }
    
    public List<Livro> pesquisarPorIntevaloAnos(int anoInicial, int anoFinal){
            List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro l : livros) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    }
    
    public Livro pesquisarPorTitulo(String titulo){
            Livro livroPorTitulo = null;
    if (!livros.isEmpty()) {
      for (Livro l : livros) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    }
    
    
    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        catalogoLivros.adicionarLivro("O Pacifista", "John Boyne", 2011);
        catalogoLivros.adicionarLivro("Sherlock Holmes - Um estudo em vermelho", "Arthur Conan Doyle", 1887);
        catalogoLivros.adicionarLivro("O pequeno príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("A arte de escrever", "Arthur Schopenhauer", 1890);
        
        System.out.println(catalogoLivros.pesquisarPorIntevaloAnos(1880, 1900));
        
        System.out.println(catalogoLivros.pesquisarPorAutor("John Boyne"));
        
        System.out.println(catalogoLivros.pesquisarPorTitulo("O pequeno príncipe"));
        
    }
    
}