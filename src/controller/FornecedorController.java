package controller;

import service.FornecedorService;
import model.Fornecedor;
import java.util.List; // Import necessário para List

public class FornecedorController {
    private FornecedorService fornecedorService = new FornecedorService();

    public void adicionarFornecedor(String cnpj, String descricao, String endereco, String email, String telefone) {
        fornecedorService.adicionarFornecedor(cnpj, descricao, endereco, email, telefone);
    }

    // Mude de 'void' para 'List<Fornecedor>' e retorne a lista do service
    public List<Fornecedor> listarFornecedores() {
        // A responsabilidade de listar e retornar a lista é da Controller
        // A impressão dos dados para o usuário deve ser na Main
        return fornecedorService.listarFornecedores();
    }

    public Fornecedor buscarFornecedorPorCnpj(String cnpj) {
        Fornecedor f = fornecedorService.buscarFornecedorPorCnpj(cnpj);
        // A impressão da mensagem "Fornecedor não encontrado." deve ser na Main
        // System.out.println(f != null ? f : "Fornecedor não encontrado."); // Remova esta linha
        return f; // Retorne o objeto ou null
    }
}