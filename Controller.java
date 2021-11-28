package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {
	Stage stage;
    @FXML
    private Button btnlogin;
    

    @FXML
    private Label forgetbtn;

    @FXML
    private Label forgetbtn1;

    @FXML
    private Pane scenePane;

    @FXML
    private VBox sidebar;

    @FXML
    private Label signuplbl;
    @FXML
    private Button closebtn;
    @FXML
    void btnpressed(ActionEvent e)
    {
    	System.out.println("pressed");
    	Alert alert=new Alert(Alert.AlertType.INFORMATION);
    	alert.setContentText("LOGGED IN SUCCESFULLY");
    	alert.show();
    }
    @FXML
    void btnclosed(ActionEvent e)
    {
    	System.out.println("closed");
    	Platform.exit();
    	System.exit(0);
    }

}
