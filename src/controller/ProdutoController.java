package controller;

public class ProdutoController {
    private ProdutoService produtoService = new ProdutoService();

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtoService.adicionarProduto(nome, preco, quantidade);
    }

    public void listarProdutos() {
        for (Produto p : produtoService.listarProdutos()) {
            System.out.println(p);
        }
    }

    public void buscarProdutoPorId(int id) {
        Produto p = produtoService.buscarProdutoPorId(id);
        System.out.println(p != null ? p : "Produto não encontrado.");
    }

    public void buscarProdutoPorNome(String nome) {
        Produto p = produtoService.buscarProdutoPorNome(nome);
        System.out.println(p != null ? p : "Produto não encontrado.");
    }
}