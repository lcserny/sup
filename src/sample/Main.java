package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));

//        Group root = new Group();
//
//        Text text = new Text("Sup?");
//        text.setY(50);
//        text.setFont(new Font("Purisa", 80));
//
//        Label label = new Label("Name:");
//
//        TextField nameField = new TextField();
//
//        Button button = new Button();
//        button.setText("Say Sup!");
//        button.setOnAction(event -> System.out.printf("Sup %s!%n", nameField.getText()));
//
//        GridPane gridPane = new GridPane();
//        gridPane.add(label, 0, 0);
//        gridPane.add(nameField, 1, 0);
//        gridPane.add(button, 1, 1);
//        gridPane.setHgap(20);
//
//        VBox box = new VBox();
//
//        box.getChildren().addAll(text, gridPane);
//        root.getChildren().add(box);

        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
