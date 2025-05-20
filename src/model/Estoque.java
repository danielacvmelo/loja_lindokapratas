package model;

public class Estoque extends Pessoa {

    private int id;
    private String entrada;
    private String saida;
    private int quantidade;

    public Estoque (int id, String entrada, String saida, int quantidade){
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.quantidade = quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

