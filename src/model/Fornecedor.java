package model;

public class Fornecedor extends Pessoa {

    private String  codfornecedor;
    private String cnpj;
    private String endereco;
    private String descricao;
    private String email;
    private String telefone;

    public Fornecedor(String codfornecedor, String cnpj, String descricao) {
        this.codfornecedor = codfornecedor;
        this.cnpj = cnpj;
        this.descricao = descricao;
        super.endereco = endereco;
        super.email = email;
        super.telefone = telefone;
    }

    public String getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(String codfornecedor) {
        this.codfornecedor = codfornecedor;
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
