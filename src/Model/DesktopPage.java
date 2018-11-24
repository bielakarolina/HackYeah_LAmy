package Model;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DesktopPage {
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

    public DesktopPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        setStageProperty();
        setHBoxProperty();
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
    }

    public void showDesktopPage(){

        TextField loginText = new TextField();
        loginText.setMaxSize(140, TextField.USE_COMPUTED_SIZE);
        loginText.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)) {

                    // LibrariesPage login = new LibrariesPage();
                    // login.showLibrariesPage(libraries);
                }
            }
        });
        TextField passwordText = new TextField();
        passwordText.setMaxSize(140, TextField.USE_COMPUTED_SIZE);
        passwordText.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)) {
                    handleBttn(loginText.getText(), passwordText.getText());
                }
            }
        });
        Button loginBttn = new Button("Log In");
        loginBttn.setId("loginBttn");
        loginBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleBttn(loginText.getText(), passwordText.getText());
            }
        });

        Button endGame = new Button("QUIT");
        endGame.setId("end");
        endGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                owner.close();
            }
        });

        root.getChildren().addAll(loginText, passwordText, loginBttn, endGame);
        root.setAlignment(Pos.CENTER);
    }

    public void handleBttn(String login, String password){
//        if(login.equals(profil.getName()) && password.equals(profil.getPassword())){
//            MenuPage menu = new MenuPage();
//            menu.showMenuPage(profil);
            owner.close();
 //       }

    }
}
