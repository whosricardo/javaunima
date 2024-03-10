package Unima;
public class conta {
    // Atributos da classe Conta
    private static int contador = 0; // Contador estático para atribuir identificador único
    private final int identificador;
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    // Construtor
    public conta(String nomeTitular, int numero, String agencia, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
        this.dataAbertura = dataAbertura;
        this.identificador = ++contador; // Atribui e incrementa o contador
    }

    // Construtor opcional sem o nome do titular
    public conta(int numero, String agencia, String dataAbertura) {
        this("", numero, agencia, dataAbertura); // Chama o construtor principal com o nome do titular vazio
    }

    // Métodos
    public void saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    // Getters e Setters
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}