package Controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public abstract class ApplicationController implements IApplicationController {
   
    public static Stage primaryStage;
    public Scene scene;

    public void changeScene( Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public GridPane getAbstractGrid(){
        return getAbstractGrid(Color.LIGHTGRAY);
    }

    public GridPane getAbstractGrid(Color backgroundColor){
        GridPane grid = new GridPane();
        grid.setBackground(new Background(new BackgroundFill(backgroundColor, CornerRadii.EMPTY, Insets.EMPTY)));
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setVgap(100);
        grid.setMinSize(primaryStage.getWidth(), primaryStage.getHeight());
        grid.setPadding(new Insets(25, 25, 25, 25));

        return grid;
    }

    public Button getButton(String text, int width, int height, final Runnable handler){
        Button button = new Button(text);
        button.setMinSize(width, height);
        button.setOnAction(event -> handler.run());

        return button;
    }

    public Text getText(String text, int size) {
        Text title = new Text(text);
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, size));
        return title;
    }

    public abstract void show();

    public abstract Scene createScene();
}
