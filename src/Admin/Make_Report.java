/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import login.Login;
import Admin.Admin;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import login.Login;

/**
 *
 * @author user
 */
public class Make_Report extends Application {
            Stage S1;
        TableView table=new TableView();
    @Override
    public void start(Stage stage) {
               GridPane all = new GridPane();
        all.setHgap(10);
        
// side btn section
        
        VBox section1 = new VBox();       
        section1.setPrefSize(170, 500);

        
        Button Add_Officer = new Button("Add Officer");
        Button Officers_list = new Button("Officers list");
        Button Make_report = new Button("Make a report");
        Button Logout = new Button("Logout");
        
        
        Add_Officer.setMinSize(170, 175);
        Add_Officer.setFont(Font.font("tahoma", FontWeight.BOLD, 15));
        
        Officers_list.setMinSize(170, 175);
        Officers_list.setFont(Font.font("tahoma", FontWeight.BOLD, 15));
         Officers_list.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent even) {
                Admin_OfficerList c2=new Admin_OfficerList();
                S1.close();
                c2.start(new Stage());
            }
        });

        
        Make_report.setMinSize(170, 175);
        Make_report.setFont(Font.font("tahoma", FontWeight.BOLD, 15));

        
        Logout.setMinSize(170, 175);
        Logout.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.web("#bf1f21"), CornerRadii.EMPTY, Insets.EMPTY)));
        Logout.setBorder(new Border(new BorderStroke((javafx.scene.paint.Color.web("#79b5d9")), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        Logout.setFont(Font.font("tahoma", FontWeight.BOLD, 15));
       Logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent even) {
                Login c2=new Login();
                S1.close();
                c2.start(new Stage());
            }
        });

        
        section1.getChildren().addAll(Add_Officer,Officers_list,Make_report,Logout);
        
        //second section

        VBox section2 = new VBox(5);
        section2.setPrefSize(530, 500);
        Label H=new Label("Office List");
        H.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 22));
        H.setPadding(new Insets(5, 0, 0, 200));
        table.setEditable(true);
        TableColumn FristName =new TableColumn("ID");
        TableColumn SecondName =new TableColumn("Name");
        SecondName.setPrefWidth(500);
        table.getColumns().addAll(FristName,SecondName);
        table.setMinHeight(200);
        /////searching on//////
        Label Searching=new Label("searching on");
        Searching.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        ComboBox Search=new ComboBox();
        Search.setPrefWidth(100);
        /////////////Select an option to display////////////////
        Label display=new Label("Select an option to display");
        display.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        ComboBox Select_display=new ComboBox();
        Select_display.setPrefWidth(100);
        /////Select an option to sort on/////////////
        Label option=new Label("Select an option to sort on");
        display.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        ComboBox Select_option=new ComboBox();
        Select_option.setPrefWidth(100);
        ////////////////////////
        section2.getChildren().addAll(H,Searching,Search,display,Select_display,option,Select_option,table);
        all.add(section1, 0, 0);
        all.add(section2, 1, 0);
        all.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.web("#a5cee5"), CornerRadii.EMPTY, Insets.EMPTY)));

        
        Scene scene = new Scene(all,700,700);           
        stage.setScene(scene);;
        stage.setTitle("Admin Screen");
        stage.setResizable(false);
        
        stage.show();
        S1=stage;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
