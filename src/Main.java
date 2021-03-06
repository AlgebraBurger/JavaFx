import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Butchokoi on 1/17/2016.
 */

public class Main extends Application implements EventHandler<ActionEvent>{

    Button button;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        button = new Button();

        button.setText("Click Me");

        //button.setOnAction(this);

        /*
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("This is an Anonymous Class Baby");
            }
        });
        */

        button.setOnAction(e -> {
            System.out.println("This is using Lambda Expressions");
            System.out.println("Clean code Lambda Expressions");
        });




        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Test Button");
        }


    }
}
