    package com.seubanco.gui;

    import com.seubanco.model.Conta;

    import javafx.application.Application;
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.scene.Scene;
    import javafx.scene.control.*;
    import javafx.scene.control.cell.PropertyValueFactory;
    import javafx.scene.layout.BorderPane;
    import javafx.scene.layout.GridPane;
    import javafx.scene.layout.HBox;
    import javafx.stage.Stage;

    public class BankGUI extends Application {

        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Banco");

            // Table setup
            TableView<Conta> table = new TableView<>();
            TableColumn<Conta, String> column1 = new TableColumn<>("Titular");
            column1.setCellValueFactory(new PropertyValueFactory<>("titular"));

            TableColumn<Conta, String> column2 = new TableColumn<>("Número");
            column2.setCellValueFactory(new PropertyValueFactory<>("numero"));

            TableColumn<Conta, String> column3 = new TableColumn<>("Agência");
            column3.setCellValueFactory(new PropertyValueFactory<>("agencia"));

            TableColumn<Conta, Double> column4 = new TableColumn<>("Saldo");
            column4.setCellValueFactory(new PropertyValueFactory<>("saldo"));

            TableColumn<Conta, String> column5 = new TableColumn<>("Tipo");
            column5.setCellValueFactory(new PropertyValueFactory<>("tipo"));

            table.getColumns().add(column1);
            table.getColumns().add(column2);
            table.getColumns().add(column3);
            table.getColumns().add(column4);
            table.getColumns().add(column5);

            table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


            // Buttons setup
            Button btnNovaConta = new Button("Nova Conta");
            Button btnSalvarDados = new Button("Salvar Dados");

            // Layout setup
            BorderPane pane = new BorderPane();
            pane.setCenter(table);

            HBox buttonPanel = new HBox(10);
            buttonPanel.setAlignment(Pos.CENTER);
            buttonPanel.setPadding(new Insets(10, 0, 10, 0));
            buttonPanel.getChildren().addAll(btnNovaConta, btnSalvarDados);

            pane.setBottom(buttonPanel);

            // Event handling
            btnNovaConta.setOnAction(e -> createContaForm());
            btnSalvarDados.setOnAction(e -> {
                // Logic to save data
            });

            Scene scene = new Scene(pane, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        private void createContaForm() {
            Stage ContaStage = new Stage();
            ContaStage.setTitle("Criar Nova Conta");

            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));

            grid.add(new Label("Titular:"), 0, 0);
            TextField txtTitular = new TextField();
            grid.add(txtTitular, 1, 0);

            grid.add(new Label("Número:"), 0, 1);
            TextField txtNumero = new TextField();
            grid.add(txtNumero, 1, 1);

            grid.add(new Label("Agência:"), 0, 2);
            TextField txtAgencia = new TextField();
            grid.add(txtAgencia, 1, 2);

            grid.add(new Label("Saldo Inicial:"), 0, 3);
            TextField txtSaldo = new TextField();
            grid.add(txtSaldo, 1, 3);

            grid.add(new Label("Tipo de Conta:"), 0, 4);
            ComboBox<String> cbTipoConta = new ComboBox<>();
            cbTipoConta.getItems().addAll("Corrente", "Investimento", "Poupança");
            grid.add(cbTipoConta, 1, 4);

            Button btnCriarConta = new Button("Criar Conta");
            grid.add(btnCriarConta, 1, 5);

            btnCriarConta.setOnAction(e -> {
                // Aqui você coleta os dados e cria a conta
                // ...
                ContaStage.close();
            });

            Scene scene = new Scene(grid, 300, 275);
            ContaStage.setScene(scene);
            ContaStage.show();
        }
    }
