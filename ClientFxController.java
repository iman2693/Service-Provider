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
public class ClientFxController implements Initializable {
    @FXML
    private TextField subfield = new TextField();
    @FXML
    private Label namelabel = new Label();
    @FXML
    private Label phonelabel=new Label();
    @FXML
    private Label addresslabel = new Label();
    
    @FXML
    private void backbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene= new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();     
    }
    @FXML
    private void searchbutton(ActionEvent event) {
       int Sub = Integer.parseInt(subfield.getText());
       //namelabel.setText(Company.findSub(Sub).GetName());
       namelabel.setText(Company.findSub(Sub).GetName());
        phonelabel.setText(Company.findSub(Sub).GetPhone());
       addresslabel.setText(Company.findSub(Sub).GetAddress());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
