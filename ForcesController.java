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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
public class ForcesController implements Initializable {
    @FXML
    private TextField addnametextfield= new TextField();
    @FXML
    private TextField addphonetextfield= new TextField();
    @FXML
    private TextField addfirstcraft= new TextField();
    @FXML
    private TextField addsecondcraft= new TextField();
    @FXML
    private TextField addthirdcraft= new TextField();
    @FXML
    private TextField addforthcraft= new TextField();
    @FXML
    private TextField addfifthcraft= new TextField();
    @FXML
    private TextField addsixthcraft= new TextField();
    @FXML
    private Label addsuccess=new Label();
    @FXML
    private TextField removeforceforcename= new TextField();
    @FXML
    private TextField removecraftforcename= new TextField();
    @FXML
    private TextField removecraftcraftname= new TextField();
    @FXML
    private void backbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene= new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();    
    }
    @FXML
    private void addbutton(ActionEvent event) {
       int x = Company._forces_list.size();
        if(addnametextfield.getText() !="" & addphonetextfield.getText()!=""  & addfirstcraft.getText() != "" & addsecondcraft.getText()  == "" & addthirdcraft.getText()=="" & addforthcraft.getText()=="" & addfifthcraft.getText()==""  & addsixthcraft.getText()=="" ){
        Company.AddForces(new Force(addnametextfield.getText(),Company.FindCraft(addfirstcraft.getText()) , addphonetextfield.getText()));
        }
        else if(addnametextfield.getText() !="" & addphonetextfield.getText()!="" & addfirstcraft.getText() != "" & addsecondcraft.getText()  != "" & addthirdcraft.getText()=="" & addforthcraft.getText()=="" & addfifthcraft.getText()==""  & addsixthcraft.getText()=="" ){
        Company.AddForces(new Force(addnametextfield.getText(),Company.FindCraft(addsecondcraft.getText()),Company.FindCraft(addfirstcraft.getText()) , addphonetextfield.getText()));
        }
        else if(addnametextfield.getText() !="" & addphonetextfield.getText()!="" & addfirstcraft.getText() != "" & addsecondcraft.getText()  != "" & addthirdcraft.getText()!="" & addforthcraft.getText()=="" & addfifthcraft.getText()==""  & addsixthcraft.getText()=="" ){
        Company.AddForces(new Force(addnametextfield.getText(),Company.FindCraft(addthirdcraft.getText()),Company.FindCraft(addsecondcraft.getText()),Company.FindCraft(addfirstcraft.getText()) , addphonetextfield.getText()));
        }
        else if(addnametextfield.getText() !="" & addphonetextfield.getText()!="" & addfirstcraft.getText() != "" & addsecondcraft.getText()  != "" & addthirdcraft.getText()!="" & addforthcraft.getText()!="" & addfifthcraft.getText()==""  & addsixthcraft.getText()=="" ){
        Company.AddForces(new Force(addnametextfield.getText(),Company.FindCraft(addforthcraft.getText()),Company.FindCraft(addthirdcraft.getText()),Company.FindCraft(addsecondcraft.getText()),Company.FindCraft(addfirstcraft.getText()) , addphonetextfield.getText()));
        }
        else if(addnametextfield.getText() !="" & addphonetextfield.getText()!="" & addfirstcraft.getText() != "" & addsecondcraft.getText()  != "" & addthirdcraft.getText()!="" & addforthcraft.getText()!="" & addfifthcraft.getText()!=""  & addsixthcraft.getText()=="" ){
        Company.AddForces(new Force(addnametextfield.getText(),Company.FindCraft(addfifthcraft.getText()),Company.FindCraft(addforthcraft.getText()),Company.FindCraft(addthirdcraft.getText()),Company.FindCraft(addsecondcraft.getText()),Company.FindCraft(addfirstcraft.getText()) , addphonetextfield.getText()));
        }
        else if(addnametextfield.getText() !="" & addphonetextfield.getText()!="" & addfirstcraft.getText() != "" & addsecondcraft.getText()  != "" & addthirdcraft.getText()!="" & addforthcraft.getText()!="" & addfifthcraft.getText()!=""  & addsixthcraft.getText()!="" ){
        Company.AddForces(new Force(addnametextfield.getText(),Company.FindCraft(addsixthcraft.getText()),Company.FindCraft(addfifthcraft.getText()),Company.FindCraft(addforthcraft.getText()),Company.FindCraft(addthirdcraft.getText()),Company.FindCraft(addsecondcraft.getText()),Company.FindCraft(addfirstcraft.getText()) , addphonetextfield.getText()));
        }
        
        if(x == Company._forces_list.size()-1){
             addsuccess.setText("Successfully Added!!"); 
        }
        
        
    }
      @FXML
    private void removebutton1(ActionEvent event) {
        Company._forces_list.remove(Company.findforce(removeforceforcename.getText()));
    }
    @FXML
    private void removebutton2(ActionEvent event) {
        Company._forces_list.get(Company.findforce(removecraftforcename.getText())).FindCraft(removecraftcraftname.getText());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
