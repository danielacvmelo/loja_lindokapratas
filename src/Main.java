
import model.Produto;
import model.Funcionario;
import model.Cliente;
import model.Pedido;
import enums.TipoProduto;
import enums.CargoFuncionario;
import enums.Setor;
import enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar alguns produtos
        Produto p1 = new Produto(1L, "Anel Solitário", "Anel de prata com zircônia", 120.0, TipoProduto.ANEL);
        Produto p2 = new Produto(2L, "Colar Coração", "Colar de prata 925", 150.0, TipoProduto.COLAR);

        // Criar um funcionário
        Funcionario func = new Funcionario(
                1L, "Amanda", 28, "Rua das Pratas", "Feminino", "12345678900",
                "(11) 99999-9999", "amanda@lindoka.com", "senha123",
                2200.0, CargoFuncionario.ATENDENTE, Setor.VENDAS
        );

        // Criar um cliente
        Cliente cliente = new Cliente(1L, "Carlos", 35, "Av. Central", "Masculino",
                "98765432100", "(11) 98888-8888", "carlos@email.com", "1234");

        // Criar um pedido
        List<Produto> itens = new ArrayList<>();
        itens.add(p1);
        itens.add(p2);

        Pedido pedido = new Pedido(1L, cliente, itens, StatusPedido.PENDENTE);

        // Exibir informações
        System.out.println("----- FUNCIONÁRIO -----");
        System.out.println("Nome: " + func.getNome());
        System.out.println("Cargo: " + func.getCargo());
        System.out.println("Setor: " + func.getSetor());

        System.out.println("\n----- CLIENTE -----");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());

        System.out.println("\n----- PEDIDO -----");
        System.out.println("ID do Pedido: " + pedido.getId());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Produtos no pedido:");
        for (Produto prod : pedido.getProdutos()) {
            System.out.println("- " + prod.getNome() + " (" + prod.getTipo() + ") R$ " + prod.getPreco());
        }
    }
}

