package Model;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NumbersPage {
    private Stage owner;
    private int widthScene=650;
    private int heightScene=600;
    private int widthStage=650;
    private int heightStage=600;
    private String title = "Numbers";
    private Scene scene;
    private VBox root;
    private int topMarg = 15;
    private int rightMarg = 12;
    private int bottomMarg = 15;
    private int leftMarg = 12;
    private int rootSpacing = 10;
    public HBox hbox;
    public NumberControler number;

    public NumbersPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        hbox = new HBox();
        setStageProperty();
        setHBoxProperty();
        number = new NumberControler();
    }

    public void setStageProperty(){
        owner.setScene(scene);
        owner.setTitle(title);
        owner.setWidth(widthStage);
        owner.setHeight(heightStage);
        owner.toBack();
        owner.show();
    }

    public void setHBoxProperty() {
        root.setPadding(new Insets(topMarg, rightMarg, bottomMarg, leftMarg));
        root.setSpacing(rootSpacing);
        hbox.setPadding(new Insets(topMarg, rightMarg, bottomMarg, leftMarg));
        hbox.setSpacing(rootSpacing);
    }

    public void showNumbersPage(){
        int chosen = number.generatorOneNumber();


        Button prevBttn = new Button("<-");
        prevBttn.setId("loginBttn");
        prevBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button nextBttn = new Button("->");
        nextBttn.setId("loginBttn");
        nextBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button backBttn = new Button("BACK");
        backBttn.setId("go");
        backBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                DesktopPage menu = new DesktopPage();
                menu.showDesktopPage();
                owner.close();
            }
        });

        hbox.getChildren().addAll(prevBttn, imageView, nextBttn);

        root.getChildren().addAll(hbox, backBttn);
        root.setAlignment(Pos.CENTER);
    }

    public void handleArrow(){
        VBox newRoot = new VBox();
        Scene newScene = new Scene(newRoot, widthScene, heightScene);
        owner.setScene(newScene);
        showNumbersPage();
    }

    public Image getImage(int chosen){
        Image image;
        switch(chosen) {
            case 0: {
                image =
            }
            case 1: {
                image =
            }
            case 3: {
                image =
            }
            case 4: {
                image =
            }
            case 5: {
                image =
            }
            case 6: {
                image =
            }
            case 7: {
                image =
            }
            case 8: {
                image =
            }
            case 9: {
                image =
            }
              






        }

        ImageView imageView = new ImageView(image);
    }

}
