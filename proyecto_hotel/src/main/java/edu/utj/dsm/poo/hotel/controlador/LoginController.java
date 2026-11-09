package edu.utj.dsm.poo.hotel.controlador;

import edu.utj.dsm.poo.hotel.App;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private void handleEntrar(ActionEvent event) {
        try {
            // Se capturan los textos para cuando conectes la base de datos
            String usuario = txtUsuario.getText();
            String password = txtPassword.getText();

            // Por ahora abre la ventana principal directamente
            App.setRoot("PanelAdmin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCerrar(ActionEvent event) {
        Platform.exit();
    }
}