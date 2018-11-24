package Model;

import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        DesktopPage desktop = new DesktopPage();
        desktop.showDesktopPage();


    }

    public static void main(String[] args) {
        launch(args);
    }
}