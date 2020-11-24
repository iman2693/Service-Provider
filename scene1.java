/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class scene1 extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Image Icon = new Image("img/icon.png");
        Scene scene = new Scene(root1);
        stage.setScene(scene);
        stage.setTitle("SPMS");
        stage.getIcons().add(Icon);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company SPMS = new Company("city", "sadegh", "09305162263", "rasht");
        Client cl1 = new Client ("iman", "0930336259", "rasht");
        Client cl2 = new Client ("Arman" , "090000000" , "Esfehan");
        Client cl3= new Client("Mehrad" , "09002211" , "Tehran");
        Client cl4 = new Client ("saber", "0911036259", "rasht");
        Client cl5 = new Client ("ahmad", "094526259", "mashhad");
        Client cl6 = new Client ("mahmud", "09116000699", "mazandaran");
        Craft c1 = new Craft("fixing",3,25000, 50000);
        Craft c2 = new Craft("fixing c",3,30000, 50000);
        Craft c3 = new Craft("programming" , 3 , 32000 , 60000 );
        Force f1 = new Force("kianian" , c1, "09116581854");
        Force f2 = new Force("safari",c2, "09116000699");
        Force f3 = new Force ("dehghan" , c3 , "0922222222");
        SPMS.AddClients(cl1);
        SPMS.AddClients(cl2);
        SPMS.AddClients(cl3);
        SPMS.AddClients(cl4);
        SPMS.AddClients(cl5);
        SPMS.AddClients(cl6);
        SPMS.AddForces(f1);
        SPMS.AddForces(f2);
        SPMS.AddForces(f3);
        SPMS.AddCraft(c1);
        SPMS.AddCraft(c2);
        SPMS.AddCraft(c3);
        //SPMS.RemoveForces("safari");
        Take t1 = new Take(cl1, c1, 970406);
        Take t2 = new Take (cl2 , c1 , 970406);
        Take t3 = new Take (cl1 , c3 , 970407);
        Take t4 = new Take ( cl3 , c2 , 970408);
        Take t5 = new Take ( cl3 , c2 , 970409);
        Take t6 = new Take ( cl3 , c1 , 970410);
        Take t7 = new Take ( cl1 , c3 , 970411);
        Take t8 = new Take ( cl2 , c3 , 970412);
        SPMS.AddTake(t1);
        SPMS.AddTake(t2);
        SPMS.AddTake(t3);
        SPMS.AddTake(t4);
        SPMS.AddTake(t5);
        SPMS.AddTake(t6);
        SPMS.AddTake(t7);
        SPMS.AddTake(t8);
        System.out.println(Company._forces_list.size());
        launch(args);
    }
    
}
