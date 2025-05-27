package service;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private int idAutoIncrement = 1;

    public void adicionarProduto(String nome, String descricao, double preco) {
        Produto produto = new Produto((long) idAutoIncrement++, nome, descricao, preco);
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarProdutoPorId(Long id) {
        for (Produto p : produtos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}