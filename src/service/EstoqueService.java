package service;

import model.Estoque;
import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<Estoque> estoque = new ArrayList<>();
    private Long contadorId = 1L; // Para gerar ID único de Estoque

    public void atualizarEstoque(Long produtoId, int novaQuantidade) {
        for (Estoque e : estoque) {
            if (e.getProdutoId().equals(produtoId)) {
                e.setQuantidade(novaQuantidade);
                System.out.println("Estoque do produto ID " + produtoId + " atualizado para " + novaQuantidade + ".");
                return;
            }
        }

        // Se não encontrou, cria novo Estoque
        Estoque novo = new Estoque(contadorId++, produtoId, null, null, novaQuantidade);
        estoque.add(novo);
        System.out.println("Novo registro de estoque criado para o produto ID " + produtoId + " com quantidade " + novaQuantidade + ".");
    }

    public int consultarQuantidadeProduto(Long produtoId) {
        for (Estoque e : estoque) {
            if (e.getProdutoId().equals(produtoId)) {
                return e.getQuantidade();
            }
        }
        return 0; // Retorna 0 se o produto não estiver no estoque
    }
}