/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectpage.Manager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sajad cj
 */
public class ManagerArchiveTestController implements Initializable {

    @FXML
    private TextField TestName;
    @FXML
    private TextArea Students;
    @FXML
    private TextField TestDuration;
    @FXML
    private DatePicker DataPicker;
    @FXML
    private TextField StartMinute;
    @FXML
    private TextField StartHour;
    @FXML
    private TextField EndMinute;
    @FXML
    private TextField EndHour;
    @FXML
    private TextArea BlockedStudents;
    @FXML
    private TextField TestMethod;
    @FXML
    private TextField ArrangeMethod;
    @FXML
    private TextField AnswerMethod;
    @FXML
    private TextField TestReview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void OpenQuestions(ActionEvent event) {
        try {
                FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("ManagerArchiveTestQuestions.fxml"));
                Parent root1 = (Parent) fxmlloader.load();
                Stage stage = new Stage();

                stage.setTitle(" Manager Archive Test Questions Page");
                stage.setScene(new Scene(root1));
                stage.show();
//                stage = (Stage)((Lab)event.getSource()).getScene().getWindow();
//                stage.close();
            } catch (IOException ex) {
                System.out.println("Can't Open Manager Archive Test Question page");
            }
    }
    
}
