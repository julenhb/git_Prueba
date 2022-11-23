package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController {
	
@FXML
private Label mensaje;

@FXML
private TextField mensajeTexto;

@FXML
private Button ok;

@FXML
private Button cambio;

@FXML
private void mostrar() {
	System.out.println(mensajeTexto.getText());
}

@FXML
private void switchToSecondary() throws IOException{
	Main.setRoot("Secondary");
    
}
}
