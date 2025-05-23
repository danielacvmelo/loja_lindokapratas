package model;

public class Fornecedor extends Pessoa {

    private Long id;
    private String cnpj;
    private String endereco;
    private String descricao;
    private String email;
    private String telefone;

    public Fornecedor(Long id, String cnpj, String descricao) {
        this.id = id;
        this.cnpj = cnpj;
        this.descricao = descricao;
        setTelefone(telefone);
        setEmail(email);
        setSenha(endereco);
    }

    public String getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}