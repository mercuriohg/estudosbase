/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Usuário {
    private int id;
    public String nome;
    private String usuário;
    private String gmail;
    protected String senha;

    public Usuário(int id, String nome, String usuário, String gmail, String senha) {
        this.id = id;
        this.nome = nome;
        this.usuário = usuário;
        this.gmail = gmail;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuário() {
        return usuário;
    }

    public void setUsuário(String usuário) {
        this.usuário = usuário;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
