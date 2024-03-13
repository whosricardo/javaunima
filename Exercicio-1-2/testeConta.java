package Unima;

    // Classe de teste
    public class testeConta {
        public static void main(String[] args) {
            // Usando o construtor com nome do titular
            conta contaComTitular = new conta("João Silva", 12345, "0001", "05/03/2024");
            contaComTitular.deposita(1000);
    
            // Usando o construtor sem nome do titular
            conta contaSemTitular = new conta(54321, "0002", "06/03/2024");
            contaSemTitular.deposita(2000);
    
            // Exemplos de uso de getters e setters
            System.out.println("Saldo da conta com titular: " + contaComTitular.getSaldo());
            System.out.println("Saldo da conta sem titular: " + contaSemTitular.getSaldo());
        }
    }