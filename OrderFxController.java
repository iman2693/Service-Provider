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
public class OrderFxController implements Initializable {
    @FXML
    private TextField clientnametextfield = new TextField();
    @FXML
    private TextField craftnametextfield = new TextField();
    @FXML
    private TextField craftdatetextfield = new TextField();
    @FXML
    private Label resultlabel= new Label();
    @FXML
    private void backbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene= new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();    
    }
    @FXML
    private void orderbutton(ActionEvent event) {
        
        Company._takes_list.add(new Take(Company.FindClient(clientnametextfield.getText()) , Company.FindCraft(craftnametextfield.getText()),Long.parseLong(craftdatetextfield.getText())));
        resultlabel.setText(Company._takes_list.get(Company._takes_list.size()-1).GetForce().GetName());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
