package main.java.set.Ordenacao;
import java.lang.Comparable;
import java.util.*;

public class Aluno implements Comparable<Aluno> {
    
    private String nome;
    private long matricula;
    private double media;
    
    public Aluno(String nome, long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }
    
    public String getNome(){
        return nome;
    }
    public long getMatricula(){
        return matricula;
    }
  public double getMedia() {
    return media;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Aluno)) return false;
    return Objects.equals(getMatricula(), getMatricula());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMatricula());
  }

      @Override
  public int compareTo(Aluno aluno) {
    return nome.compareTo(aluno.getNome());
  }
    
    public String toString(){
        return
        String.format("\nNome = '%s'\n Matrícula = %d\n Nota = %.2f\n", nome, matricula, media);
    }
}

class ComparatorNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno o1, Aluno o2) {
    return Double.compare(o1.getMedia(), o2.getMedia());
  }
}
