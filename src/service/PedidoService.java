package service;

import model.Pedido;
import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido " + pedido.getId() + " criado com sucesso!");
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public Pedido buscarPorId(Long id) {
        for (Pedido p : pedidos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean removerPedido(Long id) {
        boolean removido = pedidos.removeIf(p -> p.getId().equals(id));
        if (removido) {
            System.out.println("Pedido " + id + " removido com sucesso!");
        } else {
            System.out.println("Pedido " + id + " não encontrado para remoção.");
        }
        return removido;
    }

    public void adicionarProdutoAoPedido(Long pedidoId, Produto produto, int quantidade) {
        Pedido pedido = buscarPorId(pedidoId);
        if (pedido != null) {
            pedido.getProdutos().add(produto);
            pedido.getQuantidades().add(quantidade);
            System.out.println("Produto '" + produto.getNome() + "' adicionado ao pedido " + pedidoId + ".");
        } else {
            System.out.println("Erro: Pedido " + pedidoId + " não encontrado para adicionar produto.");
        }
    }

    // Novo método para atualizar o valor total e desconto de um pedido existente
    public void atualizarValorPedido(Long idPedido, double novoValorTotal, double novoDesconto) {
        Pedido pedido = buscarPorId(idPedido);
        if (pedido != null) {
            pedido.setValor(novoValorTotal);
            pedido.setDesconto(novoDesconto);
            System.out.println("Valor total do Pedido " + idPedido + " atualizado para R$" + String.format("%.2f", novoValorTotal) + " (Desconto: " + novoDesconto + "%).");
        } else {
            System.out.println("Erro: Pedido " + idPedido + " não encontrado para atualização de valor.");
        }
    }
}
