package model;

public class Cliente extends Pessoa {

    private Long id;

    public Cliente (String nome, int idade, String endereco, String sexo, String cpf, String telefone, String email, String senha, Long id ){
        this.id = id;
        super nome = nome;
        super idade = idade;
        super endereco = endereco;
        super sexo = sexo;
        super cpf = cpf;
        super telefone = telefone;
        super email = email;
        super senha = senha;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
