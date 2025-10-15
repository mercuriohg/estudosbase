/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author alunos
 */
public class Pessoa implements Serializable {
    private static int contador = 1;
    private int id;    
    private String nome;
    private String email;
    private String senha;
    private String senha2;

    public Pessoa( String nome, String email, String senha, String senha2) {
        this.id = contador++;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.senha2 = senha2;
    }
    
    public int getID(){
        return this.id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
    
    
}
