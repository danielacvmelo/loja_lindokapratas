package service;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

public class FornecedorService {
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public void adicionarFornecedor(String codFornecedor, String cnpj, String descricao) {
        Fornecedor novoFornecedor = new Fornecedor(codFornecedor, cnpj, descricao);
        fornecedores.add(novoFornecedor);
        System.out.println("Fornecedor adicionado com sucesso!");
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedores;
    }

    public Fornecedor buscarFornecedorPorCnpj(String cnpj) {
        for (Fornecedor f : fornecedores) {
            if (f.getCnpj().equals(cnpj)) {
                return f;
            }
        }
        return null;
    }

    public boolean removerFornecedorPorCnpj(String cnpj) {
        Fornecedor f = buscarFornecedorPorCnpj(cnpj);
        if (f != null) {
            fornecedores.remove(f);
            return true;
        }
        return false;
    }
}