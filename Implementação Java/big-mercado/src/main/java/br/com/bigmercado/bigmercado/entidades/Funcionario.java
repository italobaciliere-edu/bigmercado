package br.com.bigmercado.bigmercado.entidades;

public abstract class  Funcionario {
    protected int matricula;
    protected String nome;
    protected int salario;

    public Funcionario(int matricula, String nome, int salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
