package service;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

public class FornecedorService {
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private Long idAutoIncrement = 1L;

    public void adicionarFornecedor(String cnpj, String descricao, String endereco, String email, String telefone) {
        Fornecedor novoFornecedor = new Fornecedor(idAutoIncrement++, cnpj, descricao, endereco, email, telefone);
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