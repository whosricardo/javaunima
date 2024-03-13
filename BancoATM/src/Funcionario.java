public class Funcionario {
    private String nome;
    private String cpf;
    private int salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBonificacao(){
        return salario * 0.10;
    }

    public int getSalario() {
        return salario;
    }
}
