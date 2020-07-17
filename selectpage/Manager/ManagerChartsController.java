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
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sajad cj
 */
public class ManagerChartsController implements Initializable {

    @FXML
    private BarChart<?, ?> TestsChart;
    @FXML
    private ListView<?> TestsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OpenTestChart(ActionEvent event) {
        try {

                FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("ManagerChartsTestSelected.fxml"));
                Parent root1 = (Parent) fxmlloader.load();
                Stage stage = new Stage();

                stage.setTitle("Manager Charts Test Selected Page");
                stage.setScene(new Scene(root1));
                stage.show();
                stage = (Stage)((Button)event.getSource()).getScene().getWindow();
                stage.close();
            } catch (IOException ex) {
                System.out.println("Can't Open Manager Charts Test Selected Page");

            }
    }
    
}
