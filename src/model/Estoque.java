package model;

public class Estoque extends Pessoa {

    private Long id;
    private Long produtoId;
    private String entrada;
    private String saida;
    private int quantidade;

    public Estoque(Long id, Long produtoId, String entrada, String saida, int quantidade) {
        this.id = id;
        this.produtoId = produtoId;
        this.entrada = entrada;
        this.saida = saida;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada){
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida){
        this.saida = saida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}