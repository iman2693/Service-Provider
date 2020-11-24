

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class scene1Controller implements Initializable {
   
    
   @FXML
    private void button2(ActionEvent event) throws IOException {
         Parent root2 = FXMLLoader.load(getClass().getResource("FinanceFx.fxml"));
        Scene financescene= new Scene(root2);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(financescene);
        window.show();    
    }
    @FXML
    private void button1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Forces.fxml"));
        Scene financescene= new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(financescene);
        window.show();   
    }
    @FXML
        private void button3(ActionEvent event) throws IOException {
             Parent root3 = FXMLLoader.load(getClass().getResource("ClientFx.fxml"));
            Scene clientscene= new Scene(root3);
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(clientscene);
            window.show();
        }
        @FXML
        private void button4(ActionEvent event) throws IOException {
            Parent root4 = FXMLLoader.load(getClass().getResource("OrderFx.fxml"));
            Scene orderscene= new Scene(root4);
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(orderscene);
            window.show();
        } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
