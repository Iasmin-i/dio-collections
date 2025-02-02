package main.java.set.OperacoesBasicas;
import java.util.*;

public class Convidado {
    
    private String nome;
    private int codigoConvite;
    
    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    
    public String getNome(){
        return nome;
    }
    public int getCodigoConvite(){
        return codigoConvite;
    }
      @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado)) return false;
    return getCodigoConvite() == getCodigoConvite();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }
    
    @Override
    public String toString(){
      return
        String.format("\nNome = '%s'\nCódigo Convite = %d", nome, codigoConvite);
    }
}