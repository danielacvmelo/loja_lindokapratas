package model;

public class Fornecedor extends Pessoa {

    private Long id;
    private String cnpj;
    private String descricao;
    private String endereco;
    private String email;
    private String telefone;

    public Fornecedor(Long id, String cnpj, String descricao, String endereco, String email, String telefone) {
        this.id = id;
        this.cnpj = cnpj;
        this.descricao = descricao;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor ID: " + id + ", CNPJ: " + cnpj + ", Descrição: " + descricao;
    }
}