package service;

import java.util.ArrayList;
import java.util.List;
import model.Estoque;
import model.Produto;

public class EstoqueService {

    private List<Estoque> estoques = new ArrayList<>();

    public void adicionarProdutoNoEstoque(Produto produto, int quantidade) {
        for (Estoque e : estoques) {
            if (e.getProduto().getId().equals(produto.getId())) {
                // Se o produto já existe no estoque, atualiza a quantidade
                e.setQuantidade(e.getQuantidade() + quantidade);
                return;
            }
        }
        // Se não existe, adiciona um novo registro de estoque
        estoques.add(new Estoque(produto, quantidade));
    }

    public void atualizarQuantidadeProduto(Produto produto, int novaQuantidade) {
        for (Estoque e : estoques) {
            if (e.getProduto().getId().equals(produto.getId())) {
                e.setQuantidade(novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public int consultarQuantidadeProduto(Long produtoId) {
        for (Estoque e : estoques) {
            if (e.getProduto().getId().equals(produtoId)) {
                return e.getQuantidade();
            }
        }
        return 0;
    }

    public void listarEstoque() {
        for (Estoque e : estoques) {
            System.out.println("Produto: " + e.getProduto().getNome() +
                    ", Quantidade: " + e.getQuantidade());
        }
    }
}

