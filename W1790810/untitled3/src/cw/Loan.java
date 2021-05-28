package cw;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Loan {

    public static Pane root() {
        Stage window = new Stage();
        window.setTitle("Loan Calculator");


        Label l1 = new Label("Loan amount:");
        l1.setLayoutY(100);
        l1.setLayoutX(50);
        Label l2 = new Label("Loan Term:");
        l2.setLayoutY(150);
        l2.setLayoutX(50);
        Label l3 = new Label("Compound rate %:");
        l3.setLayoutY(200);
        l3.setLayoutX(50);
        Label l4 = new Label("Compound;");
        l4.setLayoutY(250);
        l4.setLayoutX(50);


        TextField t1 = new TextField();
        t1.setLayoutX(150);
        t1.setLayoutY(100);
        TextField t2 = new TextField();
        t2.setLayoutX(150);
        t2.setLayoutY(150);
        TextField t3 = new TextField();
        t3.setLayoutX(150);
        t3.setLayoutY(200);

        ComboBox startDate = new ComboBox();
        startDate.setLayoutX(150);
        startDate.setLayoutY(250);
        startDate.setValue("MONTHLY");
        startDate.setPrefWidth(220);
        startDate.getItems().addAll("ANNUALLY");

        Label l5 = new Label("Pay Back;");
        l5.setLayoutY(300);
        l5.setLayoutX(50);

        ComboBox SD = new ComboBox();
        SD.setLayoutX(150);
        SD.setLayoutY(300);
        SD.setValue("EVERY MONTHLY");
        SD.setPrefWidth(220);
        SD.getItems().addAll("EVERY YEAR");



        Button bcalculate = new Button("Calculate");
        bcalculate.setLayoutX(100);
        bcalculate.setLayoutY(400);
        bcalculate.setOnAction(e -> {
            Integer num1 = Integer.parseInt(t1.getText());
            Integer num2 = Integer.parseInt(t2.getText());
            Integer res;
            res = num1 + num2;
            t3.setText(String.format("%d", res));
        });
        bcalculate.setOnAction(e -> { });



        Pane root = new Pane();
        root.getChildren().addAll(l1,l2,l3,l4,l5,t1,t2,t3,bcalculate, SD, startDate);

        window.setScene(new Scene(root, 600, 500));
        window.show();

        return root;
    }

}