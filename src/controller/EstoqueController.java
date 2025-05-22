package controller;

public class EstoqueController {
    private EstoqueService estoqueService = new EstoqueService();

    public void atualizarEstoque(int produtoId, int novaQuantidade) {
        estoqueService.atualizarEstoque(produtoId, novaQuantidade);
    }

    public void consultarQuantidade(int produtoId) {
        int quantidade = estoqueService.consultarQuantidadeProduto(produtoId);
        System.out.println("Quantidade atual do produto " + produtoId + ": " + quantidade);
    }
}