package cw;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Mortage {

    public static void root() {

        Stage window = new Stage();
        window.setTitle("Mortgage Calculator");


        Label l1 = new Label("Home price:");
        l1.setLayoutY(100);
        l1.setLayoutX(50);
        TextField t1 = new TextField();
        t1.setLayoutX(175);
        t1.setLayoutY(100);

        Label l2 = new Label("Down payment:");
        l2.setLayoutY(150);
        l2.setLayoutX(50);
        TextField t2 = new TextField();
        t2.setLayoutX(175);
        t2.setLayoutY(150);

        Label l3 = new Label("Loan term:");
        l3.setLayoutY(200);
        l3.setLayoutX(50);
        TextField t3 = new TextField();
        t3.setLayoutX(175);
        t3.setLayoutY(200);

        Label l4 = new Label("Interest rate:");
        l4.setLayoutY(250);
        l4.setLayoutX(50);
        TextField t4 = new TextField();
        t4.setLayoutX(175);
        t4.setLayoutY(250);

        Label l5 = new Label();
        l5.setLayoutY(250);
        l5.setLayoutX(150);


        //Buttons
        Button bcalculate = new Button("Calculate");
        bcalculate.setLayoutX(100);
        bcalculate.setLayoutY(300);


        bcalculate.setOnAction(e -> {

            Integer num1 = Integer.parseInt(t1.getText());
            Integer num2 = Integer.parseInt(t2.getText());
            Integer res;
            res = num1 + num2;
            t3.setText(String.format("%d", res));
        });



        Pane root = new Pane();
        root.getChildren().addAll(l1,l2,l3,l4,l5,t1,t2,t3,t4,bcalculate);

        window.setScene(new Scene(root, 600, 500));
        window.show();
    }

}