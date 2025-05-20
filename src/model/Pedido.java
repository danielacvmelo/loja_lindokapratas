package model;

public class Pedido {
    private double valor;
    private String data;
    private String codpedido;
    private double desconto;

    public Pedido(double valor, String data, String codpedido, double desconto) {
        this.valor = valor;
        this.data = data;
        this.codpedido = codpedido;
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

    public String getCodpedido() {
        return codpedido;
    }

    public void setCodpedido(String codpedido) {
        this.codpedido = codpedido;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
