/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bianca.Escola;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bianca.149817
 */
public abstract class Pessoa  {
private String nome,rg,cpf;
private int idade;
private Date dataNascimanto;

 public Pessoa(String nome, String rg, String cpf, Date dataNascimanto) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.idade = this.calculaIdade(dataNascimanto);
        this.dataNascimanto = dataNascimanto;
    }
 
public static int calculaIdade(java.util.Date dataNasc) {

    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
    idade--; 
        }
    }

    return idade;
} 

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", idade=" + idade + ", dataNascimanto=" + dataNascimanto + '}';
    }



    public Date getDataNascimanto() {
        return dataNascimanto;
    }

    public void setDataNascimanto(Date dataNascimanto) {
        this.dataNascimanto = dataNascimanto;
    }
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   
   
   

    
   
}
