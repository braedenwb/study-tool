package studytool;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    private final int screenWidth = 900;
    private final int screenHeight = 600;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("studytool.fxml"));

        Scene scene = new Scene(root, screenWidth, screenHeight);

        primaryStage.setTitle("Study Tool");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}