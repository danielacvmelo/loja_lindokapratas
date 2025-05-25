package controller;

import model.Fornecedor;
import service.FornecedorService;

public class FornecedorController {
    private FornecedorService fornecedorService = new FornecedorService();

    public void adicionarFornecedor(String nome, String cnpj) {
        fornecedorService.adicionarFornecedor(nome, cnpj);
    }

    public void listarFornecedores() {
        for (Fornecedor f : fornecedorService.listarFornecedores()) {
            System.out.println(f);
        }
    }

    public void buscarFornecedorPorCnpj(String cnpj) {
        Fornecedor f = fornecedorService.buscarFornecedorPorCnpj(cnpj);
        System.out.println(f != null ? f : "Fornecedor não encontrado.");
    }
}