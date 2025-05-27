package model;

public class Cliente extends Pessoa {

    private Long id;

    public Cliente(Long id, String nome, int idade, String endereco, String sexo, String cpf, String telefone, String email, String senha) {
        this.id = id;
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        setSexo(sexo);
        setCpf(cpf);
        setTelefone(telefone);
        setEmail(email);
        setSenha(senha);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
