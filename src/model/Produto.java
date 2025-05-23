package model;

public class Produto extends Pessoa {

    private Long id;
    private String descricao;
    private double valor;

    public Produto (Long id, String nome, String descricao, double valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        super nome = nome;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
