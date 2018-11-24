package Model;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StarterPage {
    private Stage owner;
    private int widthScene=650;
    private int heightScene=600;
    private int widthStage=650;
    private int heightStage=600;
    private String title = "Login";
    private Scene scene;
    private VBox root;
    private int topMarg = 15;
    private int rightMarg = 12;
    private int bottomMarg = 15;
    private int leftMarg = 12;
    private int rootSpacing = 10;
    private HBox hbox;
    public int years;

    public StarterPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        setStageProperty();
        this.years = 0;
        this.hbox = new HBox();
        setBoxProperty();
    }

    public void setStageProperty(){
        owner.setScene(scene);
        owner.setTitle(title);
        owner.setWidth(widthStage);
        owner.setHeight(heightStage);
        owner.toBack();
        owner.show();
    }

    public void setBoxProperty() {
        root.setPadding(new Insets(topMarg, rightMarg, bottomMarg, leftMarg));
        root.setSpacing(rootSpacing);
        hbox.setPadding(new Insets(topMarg, rightMarg, bottomMarg, leftMarg));
        hbox.setSpacing(rootSpacing);
    }

    public void showStarterPage(){

        ToggleButton firstBttn = new ToggleButton("Log In");
        firstBttn.setId("loginBttn");
        firstBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(firstBttn);
            }
        });

        ToggleButton secondBttn = new ToggleButton("Log In");
        secondBttn.setId("loginBttn");
        secondBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(secondBttn);
            }
        });

        ToggleButton thirdBttn = new ToggleButton("Log In");
        thirdBttn.setId("loginBttn");
        thirdBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(thirdBttn);
            }
        });

        ToggleButton fourthBttn = new ToggleButton("Log In");
        fourthBttn.setId("loginBttn");
        fourthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(fourthBttn);
            }
        });

        ToggleButton fifthBttn = new ToggleButton("Log In");
        fifthBttn.setId("loginBttn");
        fifthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(fifthBttn);
            }
        });

        ToggleButton sixthBttn = new ToggleButton("Log In");
        sixthBttn.setId("loginBttn");
        sixthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(sixthBttn);
            }
        });

        ToggleButton seventhBttn = new ToggleButton("Log In");
        seventhBttn.setId("loginBttn");
        seventhBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(seventhBttn);
            }
        });

        ToggleButton eightBttn = new ToggleButton("Log In");
        eightBttn.setId("loginBttn");
        eightBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(eightBttn);
            }
        });

        ToggleButton ninthBttn = new ToggleButton("Log In");
        ninthBttn.setId("loginBttn");
        ninthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(ninthBttn);
            }
        });

        ToggleButton tenthBttn = new ToggleButton("Log In");
        tenthBttn.setId("loginBttn");
        tenthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handlePressed(tenthBttn);
            }
        });

        Button goBttn = new Button("Go");
        goBttn.setId("go");
        goBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                DesktopPage menu = new DesktopPage();
                menu.showDesktopPage();
                owner.close();
            }
        });

        hbox.getChildren().addAll(firstBttn, secondBttn, thirdBttn, fourthBttn, fifthBttn, sixthBttn, seventhBttn,
                eightBttn, ninthBttn, tenthBttn);

        root.getChildren().addAll(hbox, goBttn);
        root.setAlignment(Pos.CENTER);
    }

    public void handlePressed(ToggleButton button){
        if(button.isSelected()){
            this.years++;
        }
        else{
            this.years--;
        }
    }
    
}

