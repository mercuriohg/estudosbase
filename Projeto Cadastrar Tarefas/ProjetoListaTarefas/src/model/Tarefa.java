package model;

import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate prazo;
    private boolean concluida;
    private int usuarioId; // FK -> Usuário dono da tarefa

    public Tarefa(int id, String titulo, String descricao, LocalDate dataCriacao, LocalDate prazo, boolean concluida, int usuarioId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.prazo = prazo;
        this.concluida = concluida;
        this.usuarioId = usuarioId;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDate dataCriacao) { this.dataCriacao = dataCriacao; }

    public LocalDate getPrazo() { return prazo; }
    public void setPrazo(LocalDate prazo) { this.prazo = prazo; }

    public boolean isConcluida() { return concluida; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }

    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }
}


