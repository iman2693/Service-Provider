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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class FinanceFxController implements Initializable {
     @FXML
        private TextField companyfromtextfield = new TextField();
     @FXML
     private TextField companytotextfield = new TextField();
     @FXML
     private Label companyresult = new Label();
     @FXML
     private TextField clientnametextfield= new TextField();
     @FXML
     private TextField clientfromtextfield= new TextField();
     @FXML
     private TextField  clienttotextfield = new TextField();
     @FXML
     private Label resultclient = new Label();
     @FXML
     private TextField forcenametextfield= new TextField();
     @FXML
     private TextField forcefromtextfield= new TextField();
     @FXML
     private TextField  forcetotextfield = new TextField();
     @FXML
     private Label forceresult = new Label();
     @FXML
     private TextField craftnametextfield= new TextField();
     @FXML
     private TextField craftfromtextfield= new TextField();
     @FXML
     private TextField  crafttotextfield = new TextField();
     @FXML
     private Label craftresult = new Label();
    @FXML
    private void backbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene= new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();      
    }
    @FXML
    private void calculate1(ActionEvent event) {
        long from = Long.parseLong(companyfromtextfield.getText());
        long to = Long.parseLong(companytotextfield.getText());
        companyresult.setText(String.valueOf(Company.companyin(from, to)));
    }
    @FXML
    private void calculate2(ActionEvent event) {
        resultclient.setText(String.valueOf(Company.clientr(clientnametextfield.getText(), Long.parseLong(clientfromtextfield.getText()), Long.parseLong(clienttotextfield.getText()))));
    }
    @FXML
    private void calculate3(ActionEvent event) {
        forceresult.setText(String.valueOf(Company.forcef(forcenametextfield.getText(), Long.parseLong(forcefromtextfield.getText()), Long.parseLong(forcetotextfield.getText()))));
    }
    @FXML
    private void calculate4(ActionEvent event) {
       craftresult.setText(String.valueOf(Company.craftu(craftnametextfield.getText(), Long.parseLong(craftfromtextfield.getText()), Long.parseLong(crafttotextfield.getText()))));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
