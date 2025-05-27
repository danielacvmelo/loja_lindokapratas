package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valor;
    private String data;
    private Long id;
    private double desconto; // Atributo para o desconto

    private List<Produto> produtos;
    private List<Integer> quantidades;

    public Pedido(double valor, String data, Long id, double desconto) {
        this.valor = valor;
        this.data = data;
        this.id = id;
        this.desconto = desconto;

        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(List<Integer> quantidades) {
        this.quantidades = quantidades;
    }
}
