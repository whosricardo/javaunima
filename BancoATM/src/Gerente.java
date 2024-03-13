public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autenticador(int senha) {
        if(this.senha == senha) {
            System.out.println("Permitir Entrada");
            return true;
        }
        else {
            System.out.println("Acesso Negado");
            return false;
        }
    }


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNumeroDeFuncionario(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public int getSenha() {
        return senha;
    }

    public int getNumeroDeFuncionaro() {
        return numeroDeFuncionariosGerenciados;
    }

}