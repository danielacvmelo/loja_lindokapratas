package model;

public class Funcionario extends Pessoa {

    private Long id;
    private double salario;

    public Funcionario (Long id, String nome, int idade, String endereco, String sexo, String cpf, String telefone, String email, String senha, double salario){
        this.id = id;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
