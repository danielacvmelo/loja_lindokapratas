package controller;

import model.Funcionario;
import service.FuncionarioService;
import java.util.List;

public class FuncionarioController {

    private FuncionarioService funcionarioService = new FuncionarioService();

    public void adicionarFuncionario(Long id, String nome, int idade, String endereco, String sexo, String cpf, String telefone, String email, String senha, double salario) {
        Funcionario funcionario = new Funcionario(id, nome, idade, endereco, sexo, cpf, telefone, email, senha, salario);
        funcionarioService.adicionarFuncionario(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    public Funcionario buscarFuncionarioPorId(Long id) {
        return funcionarioService.buscarPorId(id);
    }

    public Funcionario buscarFuncionarioPorCpf(String cpf) {
        return funcionarioService.buscarFuncionarioPorCpf(cpf);
    }

    public boolean removerFuncionario(Long id) {
        return funcionarioService.removerFuncionario(id);
    }
}
