package controller;

import model.Pedido;
import model.Produto;
import service.PedidoService;

import java.util.List;

public class PedidoController {

    private PedidoService pedidoService = new PedidoService();

    public void adicionarPedido(double valor, String data, Long id, double desconto) {
        Pedido pedido = new Pedido(valor, data, id, desconto);
        pedidoService.adicionarPedido(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    public Pedido buscarPedidoPorId(Long id) {
        return pedidoService.buscarPorId(id);
    }

    public boolean removerPedido(Long id) {
        return pedidoService.removerPedido(id);
    }

    public void adicionarProdutoAoPedido(Long pedidoId, Produto produto, int quantidade) {
        pedidoService.adicionarProdutoAoPedido(pedidoId, produto, quantidade);
    }

    public void atualizarValorPedido(Long idPedido, double novoValorTotal, double novoDesconto) {
        pedidoService.atualizarValorPedido(idPedido, novoValorTotal, novoDesconto);
    }
}