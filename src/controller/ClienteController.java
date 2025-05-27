package controller;

import model.Cliente;
import service.ClienteService;
import java.util.List;

public class ClienteController {

    private ClienteService clienteService = new ClienteService();

    public void adicionarCliente(Long id, String nome, int idade, String endereco, String sexo, String cpf, String telefone, String email, String senha) {
        Cliente cliente = new Cliente(id, nome, idade, endereco, sexo, cpf, telefone, email, senha);
        clienteService.adicionarCliente(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteService.buscarPorId(id);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        return clienteService.buscarClientePorCpf(cpf);
    }

    public boolean removerCliente(Long id) {
        return clienteService.removerCliente(id);
    }
}
