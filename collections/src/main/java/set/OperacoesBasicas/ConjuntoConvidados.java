package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidados.isEmpty()) {
            for (Convidado c : convidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidados.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        if (!convidados.isEmpty()) {
            System.out.println(convidados);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    
    conjuntoConvidados.adicionarConvidado("John Lennon", 1001);
    conjuntoConvidados.adicionarConvidado("George Harrison", 1002);
    conjuntoConvidados.adicionarConvidado("Paul McCartney", 1003);
    conjuntoConvidados.adicionarConvidado("Ringo Starr", 1004);
    
    conjuntoConvidados.exibirConvidados();
    System.out.println();
    
    conjuntoConvidados.removerConvidadoPorCodigo(1001);
    conjuntoConvidados.removerConvidadoPorCodigo(1003);
    
    conjuntoConvidados.exibirConvidados();
    System.out.println();
    
    conjuntoConvidados.removerConvidadoPorCodigo(1002);
    conjuntoConvidados.removerConvidadoPorCodigo(1004);
    
    conjuntoConvidados.exibirConvidados();
}
}