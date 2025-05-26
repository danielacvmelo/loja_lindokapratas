package controller;

import service.EstoqueService;

public class EstoqueController {
    private EstoqueService estoqueService = new EstoqueService();

    public void atualizarEstoque(Long produtoId, int novaQuantidade) {
        estoqueService.atualizarEstoque(produtoId, novaQuantidade);
    }

    // Renomeado para seguir o padrão de getter e retornar a quantidade
    public int getQuantidadeProduto(Long produtoId) {
        return estoqueService.consultarQuantidadeProduto(produtoId);
    }
}