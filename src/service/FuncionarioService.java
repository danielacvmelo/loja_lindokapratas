package service;

import model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public Funcionario buscarPorId(Long id) {
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(id)) {
                return f;
            }
        }
        return null;
    }

    public boolean removerFuncionario(Long id) {
        return funcionarios.removeIf(f -> f.getId().equals(id));
    }

    public Funcionario buscarFuncionarioPorCpf(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

}
