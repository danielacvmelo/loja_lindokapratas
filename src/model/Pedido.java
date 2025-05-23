package model;

public class Pedido {
    private double valor;
    private String data;
    private Long id;
    private double desconto;

    public Pedido(double valor, String data, Long id, double desconto) {
        this.valor = valor;
        this.data = data;
        this.id = id;
        this.desconto = desconto;
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

    public String getId() {
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
}