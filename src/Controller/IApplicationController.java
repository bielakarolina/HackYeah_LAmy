package Controller;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public interface IApplicationController {

    public void changeScene(Scene scene);
    public GridPane getAbstractGrid();
    public GridPane getAbstractGrid(Color backgroundColor);
    public Button getButton(String text, int width, int height, final Runnable handler);
    public Text getText(String text, int size);
    public abstract void show();
    abstract Scene createScene();
}
