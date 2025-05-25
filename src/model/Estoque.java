package model;

public class Estoque extends Pessoa {

    private Long id;
    private String entrada;
    private String saida;
    private int quantidade;

    public Estoque (Long id, String entrada, String saida, int quantidade) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.quantidade = quantidade;
    // Dani, faltou a chave } fechando o código aqui

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

