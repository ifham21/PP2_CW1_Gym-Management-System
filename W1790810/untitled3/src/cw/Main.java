package cw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Finance Calculators");

        Button b1 = new Button("Savings Calculator");
        b1.setLayoutX(100);
        b1.setLayoutY(20);
        b1.setPrefSize(200,100);
        b1.setStyle("-fx-background-radius:30px; -fx-background-color: skyblue; -fx-font-weight: bold;");
        b1.setOnAction(e -> { Savings.root(); });

        Button b2 = new Button("Mortgage Calculator");
        b2.setPrefSize(200,100);
        b2.setLayoutX(400);
        b2.setLayoutY(20);
        b2.setStyle("-fx-background-radius:30px; -fx-background-color: lightpink; -fx-font-weight: bold;");
        b2.setOnAction(e -> { Mortage.root(); });


        Button b3 = new Button("Loan Calculator");
        b3.setPrefSize(200,100);
        b3.setLayoutX(400);
        b3.setLayoutY(200);
        b3.setStyle("-fx-background-radius:30px; -fx-background-color: grey; -fx-font-weight: bold;");
        b3.setOnAction(e -> { Loan.root(); });

        Button b4 = new Button("Interest Calculator");
        b4.setPrefSize(200,100);
        b4.setLayoutX(100);
        b4.setLayoutY(200);
        b4.setStyle("-fx-background-radius:30px;  -fx-background-color: lightgreen; -fx-font-weight: bold;");
        b4.setOnAction(e -> { Interest.root(); });

        Button b5 = new Button("Help");
        b5.setMinSize(90,40);
        b5.setLayoutX(600);
        b5.setLayoutY(350);
        b5.setStyle("-fx-background-radius:20px; -fx-background-color:silver; -fx-font-weight: bold;");


        Pane root = new Pane();
        root.getChildren().addAll(b1,b2,b3,b4,b5);
        Scene scene = new Scene(root,750,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
