package main;

import controller.*;
import model.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClienteController clienteController = new ClienteController();
        FuncionarioController funcionarioController = new FuncionarioController();
        FornecedorController fornecedorController = new FornecedorController();
        ProdutoController produtoController = new ProdutoController();
        EstoqueController estoqueController = new EstoqueController();
        PedidoController pedidoController = new PedidoController();

        boolean executando = true;

        while (executando) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Cadastrar Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("5. Cadastrar Fornecedor");
            System.out.println("6. Listar Fornecedores");
            System.out.println("7. Cadastrar Produto");
            System.out.println("8. Listar Produtos");
            System.out.println("9. Atualizar Estoque");
            System.out.println("10. Cadastrar Pedido");
            System.out.println("11. Listar Pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1: // Cadastrar Cliente
                    System.out.println("== Cadastro de Cliente ==");
                    System.out.print("ID: ");
                    Long idCliente = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    clienteController.adicionarCliente(idCliente, nomeCliente, idade, endereco, sexo, cpf, telefone, email, senha);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2: // Listar Clientes
                    System.out.println("== Lista de Clientes ==");
                    List<Cliente> clientes = clienteController.listarClientes();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente c : clientes) {
                            System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", CPF: " + c.getCpf() + ", Email: " + c.getEmail());
                        }
                    }
                    break;

                case 3: // Cadastrar Funcionário
                    System.out.println("== Cadastro de Funcionário ==");
                    System.out.print("ID: ");
                    Long idFunc = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeFunc = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idadeFunc = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoFunc = scanner.nextLine();
                    System.out.print("Sexo: ");
                    String sexoFunc = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfFunc = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telFunc = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailFunc = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaFunc = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    funcionarioController.adicionarFuncionario(idFunc, nomeFunc, idadeFunc, enderecoFunc, sexoFunc, cpfFunc, telFunc, emailFunc, senhaFunc, salario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 4: // Listar Funcionários
                    System.out.println("== Lista de Funcionários ==");
                    List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : funcionarios) {
                            System.out.println("ID: " + f.getId() + ", Nome: " + f.getNome() + ", CPF: " + f.getCpf() + ", Salário: R$" + String.format("%.2f", f.getSalario()));
                        }
                    }
                    break;

                case 5: // Cadastrar Fornecedor
                    System.out.println("== Cadastro de Fornecedor ==");
                    System.out.print("ID: ");
                    Long idFornecedor = scanner.nextLong();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoForn = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telForn = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailForn = scanner.nextLine();

                    fornecedorController.adicionarFornecedor(cnpj, descricao, enderecoForn, emailForn, telForn);
                    System.out.println("Fornecedor cadastrado com sucesso!");
                    break;

                case 6: // Listar Fornecedores
                    System.out.println("== Lista de Fornecedores ==");
                    List<Fornecedor> fornecedores = fornecedorController.listarFornecedores();
                    if (fornecedores.isEmpty()) {
                        System.out.println("Nenhum fornecedor cadastrado.");
                    } else {
                        for (Fornecedor f : fornecedores) {
                            System.out.println("ID: " + f.getId() + ", CNPJ: " + f.getCnpj() + ", Descrição: " + f.getDescricao() + ", Email: " + f.getEmail());
                        }
                    }
                    break;

                case 7: // Cadastrar Produto
                    System.out.println("== Cadastro de Produto ==");
                    System.out.print("Nome: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricaoProduto = scanner.nextLine();
                    System.out.print("Preço: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Quantidade Inicial em Estoque: "); // Solicitando a quantidade inicial
                    int qtdInicialEstoque = scanner.nextInt();
                    scanner.nextLine();

                    // Adiciona o produto
                    produtoController.adicionarProduto(nomeProduto, descricaoProduto, precoProduto);
                    // Obtém o ID do produto recém-adicionado (pode ser necessário ajustar se o ID não for retornado ou auto-incrementado)
                    // Para fins de demonstração, assumimos que o último produto adicionado tem o ID correspondente ou você busca por nome.
                    // Uma maneira mais robusta seria fazer adicionarProduto retornar o ID do produto.
                    // Por enquanto, vamos assumir que produtoController.listarProdutos() vai te dar o último.
                    Long novoProdutoId = produtoController.listarProdutos().stream()
                            .filter(p -> p.getNome().equals(nomeProduto))
                            .map(Produto::getId)
                            .findFirst().orElse(null);

                    if (novoProdutoId != null) {
                        // Atualiza o estoque para o produto recém-cadastrado
                        estoqueController.atualizarEstoque(novoProdutoId, qtdInicialEstoque);
                        System.out.println("Produto e estoque inicial cadastrados com sucesso!");
                    } else {
                        System.out.println("Erro ao cadastrar o estoque do produto. Produto não encontrado após o cadastro.");
                    }
                    break;

                case 8: // Listar Produtos
                    System.out.println("== Lista de Produtos ==");
                    List<Produto> produtos = produtoController.listarProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto p : produtos) {
                            System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Descrição: " + p.getDescricao() + ", Preço: R$" + String.format("%.2f", p.getValor()));
                            // Opcional: mostrar estoque atual do produto
                            int qtdEstoque = estoqueController.getQuantidadeProduto(p.getId());
                            System.out.println("  Estoque Atual: " + qtdEstoque);
                        }
                    }
                    break;

                case 9: // Atualizar Estoque
                    System.out.println("== Atualizar Estoque ==");
                    System.out.print("ID do Produto: ");
                    Long idEstoque = scanner.nextLong();
                    System.out.print("Nova Quantidade: ");
                    int novaQtd = scanner.nextInt();
                    scanner.nextLine();
                    estoqueController.atualizarEstoque(idEstoque, novaQtd);
                    break;

                case 10: // Cadastrar Pedido
                    System.out.println("== Cadastro de Pedido ==");
                    System.out.print("ID do Pedido: ");
                    Long idPedido = scanner.nextLong();
                    scanner.nextLine();

                    // Inicializa o valor total e o desconto (serão atualizados)
                    double valorTotalPedido = 0.0;
                    double descontoAplicado = 0.0;

                    System.out.print("Data (dd/mm/aaaa): ");
                    String data = scanner.nextLine();
                    System.out.print("Desconto percentual para o pedido (ex: 10 para 10%): ");
                    descontoAplicado = scanner.nextDouble(); // Lendo o desconto como percentual
                    scanner.nextLine();

                    // Adiciona o pedido inicialmente com valor e desconto 0.0
                    pedidoController.adicionarPedido(0.0, data, idPedido, 0.0);

                    char adicionarMaisProdutos;
                    do {
                        System.out.print("ID do Produto a adicionar: ");
                        Long prodId = scanner.nextLong();
                        scanner.nextLine();
                        Produto prod = produtoController.buscarProdutoPorId(prodId);

                        if (prod != null) {
                            System.out.print("Quantidade desejada para '" + prod.getNome() + "': ");
                            int quantidadeDesejada = scanner.nextInt();
                            scanner.nextLine();

                            // --- Lógica de Verificação de Estoque ---
                            int estoqueAtual = estoqueController.getQuantidadeProduto(prod.getId());

                            if (quantidadeDesejada > 0 && quantidadeDesejada <= estoqueAtual) {
                                // Adiciona o produto ao pedido (na lista de produtos do pedido)
                                pedidoController.adicionarProdutoAoPedido(idPedido, prod, quantidadeDesejada);
                                System.out.println("Produto '" + prod.getNome() + "' (" + quantidadeDesejada + " unid.) adicionado ao pedido.");

                                // **Reduz o estoque** imediatamente
                                estoqueController.atualizarEstoque(prod.getId(), estoqueAtual - quantidadeDesejada);
                                System.out.println("Estoque de '" + prod.getNome() + "' atualizado para " + (estoqueAtual - quantidadeDesejada) + ".");

                                // Soma ao valor total do pedido
                                valorTotalPedido += (prod.getValor() * quantidadeDesejada);
                            } else if (quantidadeDesejada <= 0) {
                                System.out.println("Quantidade deve ser maior que zero. Produto não adicionado.");
                            } else {
                                System.out.println("Estoque insuficiente para o produto '" + prod.getNome() + "'. Disponível: " + estoqueAtual + ". Produto não adicionado.");
                            }
                        } else {
                            System.out.println("Produto com ID " + prodId + " não encontrado. Não foi possível adicionar ao pedido.");
                        }
                        System.out.print("Deseja adicionar outro produto ao pedido? (s/n): ");
                        adicionarMaisProdutos = scanner.nextLine().toLowerCase().charAt(0);
                    } while (adicionarMaisProdutos == 's');

                    // Aplica o desconto ao valor total
                    double valorFinalComDesconto = valorTotalPedido * (1 - (descontoAplicado / 100));

                    // Atualiza o pedido no serviço com o valor final e o desconto
                    pedidoController.atualizarValorPedido(idPedido, valorFinalComDesconto, descontoAplicado);

                    System.out.println("\nResumo do Pedido " + idPedido + ":");
                    System.out.println("Valor Original: R$" + String.format("%.2f", valorTotalPedido));
                    System.out.println("Desconto Aplicado: " + String.format("%.0f", descontoAplicado) + "%");
                    System.out.println("Valor Total a Pagar: R$" + String.format("%.2f", valorFinalComDesconto));

                    // --- Lógica de Troco ---
                    System.out.print("Valor pago pelo cliente: R$");
                    double valorPagoPeloCliente = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer

                    if (valorPagoPeloCliente >= valorFinalComDesconto) {
                        double troco = valorPagoPeloCliente - valorFinalComDesconto;
                        System.out.println("Troco: R$" + String.format("%.2f", troco));
                    } else {
                        System.out.println("Valor pago insuficiente. Faltam: R$" + String.format("%.2f", (valorFinalComDesconto - valorPagoPeloCliente)));
                    }
                    System.out.println("Pedido " + idPedido + " finalizado com sucesso!");
                    break;

                case 11: // Listar Pedidos
                    System.out.println("== Lista de Pedidos ==");
                    List<Pedido> pedidos = pedidoController.listarPedidos();
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido cadastrado.");
                    } else {
                        for (Pedido p : pedidos) {
                            System.out.println("--------------------");
                            System.out.println("Pedido ID: " + p.getId() + ", Data: " + p.getData() + ", Valor: R$" + String.format("%.2f", p.getValor()) + ", Desconto: " + String.format("%.0f", p.getDesconto()) + "%");
                            if (!p.getProdutos().isEmpty()) {
                                System.out.println("  Produtos no Pedido:");
                                List<Produto> prods = p.getProdutos();
                                List<Integer> qtds = p.getQuantidades();
                                for (int i = 0; i < prods.size(); i++) {
                                    System.out.println("    - " + prods.get(i).getNome() + " (ID: " + prods.get(i).getId() + "), Quantidade: " + qtds.get(i));
                                }
                            } else {
                                System.out.println("  Nenhum produto adicionado a este pedido.");
                            }
                        }
                    }
                    break;

                case 0:
                    executando = false;
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
//main finalizada
