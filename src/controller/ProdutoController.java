package controller;

import model.Produto;
import service.ProdutoService;
import java.util.List; // Import necessário para List

public class ProdutoController {
    private ProdutoService produtoService = new ProdutoService();

    public void adicionarProduto(String nome, String descricao, double preco) {
        produtoService.adicionarProduto(nome, descricao, preco);
    }

    // Mude de 'void' para 'List<Produto>' e retorne a lista do service
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    public Produto buscarProdutoPorId(Long id) {
        Produto p = produtoService.buscarProdutoPorId(id);
        return p;
    }

    // Mude de 'void' para 'Produto' e retorne o objeto
    public Produto buscarProdutoPorNome(String nome) {
        Produto p = produtoService.buscarProdutoPorNome(nome);
        // REMOVA a linha abaixo, a impressão será feita na main
        // System.out.println(p != null ? p : "Produto não encontrado.");
        return p; // Retorne o produto encontrado (ou null)
    }
}