package com.seubanco.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI {
    private JFrame frame;
    private JTable table;
    private JButton btnNovaConta;
        private JButton btnSalvarDados;

        public BankGUI() {
            createInterface();
        }

        private void createInterface() {
            frame = new JFrame("Banco");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);

            // Table setup
            String[] columns = new String[] {"Titular", "Número", "Agência", "Saldo", "Tipo"};
            Object[][] data = {};

            // Add opening curly brace here
            {

        }
        table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        // Buttons setup
        btnNovaConta = new JButton("Nova Conta");
        btnSalvarDados = new JButton("Salvar Dados");

        // Layout setup
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnNovaConta);
        buttonPanel.add(btnSalvarDados);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);

        // Event handling
        btnNovaConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria um novo JFrame para a criação de conta
                JFrame frameNovaConta = new JFrame("Criar Nova Conta");
                frameNovaConta.setSize(300, 200);
                frameNovaConta.setLayout(new GridLayout(0, 2));
                frameNovaConta.setLocationRelativeTo(null);
        
                // Adiciona campos de texto e labels para a entrada de dados
                frameNovaConta.add(new JLabel("Titular:"));
                JTextField txtTitular = new JTextField();
                frameNovaConta.add(txtTitular);
        
                frameNovaConta.add(new JLabel("Número:"));
                JTextField txtNumero = new JTextField();
                frameNovaConta.add(txtNumero);
        
                frameNovaConta.add(new JLabel("Agência:"));
                JTextField txtAgencia = new JTextField();
                frameNovaConta.add(txtAgencia);
        
                frameNovaConta.add(new JLabel("Saldo Inicial:"));
                JTextField txtSaldo = new JTextField();
                frameNovaConta.add(txtSaldo);
        
                frameNovaConta.add(new JLabel("Tipo de Conta:"));
                JComboBox<String> cbTipoConta = new JComboBox<>(new String[]{"Corrente", "Investimento", "Poupança"});
                frameNovaConta.add(cbTipoConta);
        
                // Adiciona botão para submeter os dados
                JButton btnCriarConta = new JButton("Criar Conta");
                frameNovaConta.add(btnCriarConta);
        
                btnCriarConta.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Aqui você coleta os dados e cria a conta
                        String titular = txtTitular.getText();
                        int numero = Integer.parseInt(txtNumero.getText()); 
                        String agencia = txtAgencia.getText();
                        double saldo = Double.parseDouble(txtSaldo.getText());
                        String tipoConta = (String) cbTipoConta.getSelectedItem();
                        
        
                        // Implemente a lógica de criação da conta aqui
                        // ...
        
                        // Fecha a janela de criação de conta após a criação
                        frameNovaConta.dispose();
                    }
                });
        
                // Mostra a janela
                frameNovaConta.setVisible(true);
            }
        });
        
        btnSalvarDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to save data
            }
        });

        frame.setVisible(true);
    }
}
           
