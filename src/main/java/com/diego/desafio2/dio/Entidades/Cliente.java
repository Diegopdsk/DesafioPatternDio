
package com.diego.desafio2.dio.Entidades;

import com.diego.desafio2.dio.Credito.LiberarCredito;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *Essa classe é o Contexto onde será implementado o teste de Liberação de Credito 
 * @author Diego
 */
public class Cliente {
    
    private LiberarCredito liberarCredito;
    
    protected String nome;
    protected String cpf;
    protected Double valorCredito;
    protected int score;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Double valorCredito, int score) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorCredito = valorCredito;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", valorCredito=" + valorCredito + ", score=" + score + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.liberarCredito);
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.cpf);
        hash = 61 * hash + Objects.hashCode(this.valorCredito);
        hash = 61 * hash + this.score;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.liberarCredito, other.liberarCredito)) {
            return false;
        }
        if (!Objects.equals(this.valorCredito, other.valorCredito)) {
            return false;
        }
        return true;
    }  
    
    
}
