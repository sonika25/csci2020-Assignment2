package sample;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.SplitPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {

    Stage window;
    private BorderPane layout;
    ListView <String> sharedFolderLocal = new ListView<>();
    ListView <String> sharedFolderServer = new ListView<>();

    public static void main(String[] args) {
        // write your code here
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        window = primaryStage;
        window.setTitle("File Sharer v1.0");

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, 500, 580));

        //Downloads
        HBox topMenu = new HBox();
        Button buttonA = new Button("Download");

        Button buttonB = new Button("Upload");
        topMenu.getChildren().addAll(buttonA,buttonB);

        layout = new BorderPane();
        layout.setTop(topMenu);

        /* SplitPane */
        SplitPane splitPane = new SplitPane();

        splitPane.getItems().addAll(sharedFolderLocal, sharedFolderServer);
        splitPane.setPrefSize(500, 580);

        layout.setBottom(splitPane);

        Scene scene = new Scene(layout, 500,580);
        window.setScene(scene);
        window.show();
    }
}
