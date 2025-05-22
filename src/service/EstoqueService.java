package service;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<ProdutoEstoque> estoque = new ArrayList<>();

    public void atualizarEstoque(int produtoId, int novaQuantidade) {
        for (ProdutoEstoque pe : estoque) {
            if (pe.getProdutoId() == produtoId) {
                pe.setQuantidade(novaQuantidade);
                return;
            }
        }
        estoque.add(new ProdutoEstoque(produtoId, novaQuantidade));
    }

    public int consultarQuantidadeProduto(int produtoId) {
        for (ProdutoEstoque pe : estoque) {
            if (pe.getProdutoId() == produtoId) {
                return pe.getQuantidade();
            }
        }
        return 0;
    }
}