package cw;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Interest  {

    public static void root(){
        Stage window3 = new Stage();
        window3.setTitle("Compound Interest Calculator");

        Label l1 = new Label("Principal amount:");
        l1.setPrefSize(300,20);
        l1.setLayoutY(100);
        l1.setLayoutX(50);

        Label l2 = new Label("Interest rate:");
        l2.setLayoutY(150);
        l2.setLayoutX(50);

        Label l3 = new Label("Loan term:");
        l3.setLayoutY(200);
        l3.setLayoutX(50);

        Label l4 = new Label("Compount Interest:" );
        l4.setLayoutY(430);
        l4.setLayoutX(50);

        Label l5 = new Label("            ");
        l5.setLayoutX(250);
        l5.setLayoutY(430);





        TextField t1 = new TextField();
        t1.setLayoutX(175);
        t1.setLayoutY(100);
        t1.setPromptText("  ");

        TextField t2 = new TextField();
        t2.setLayoutX(175);
        t2.setLayoutY(150);

        TextField t3 = new TextField();
        t3.setLayoutX(175);
        t3.setLayoutY(200);




        Button bcal = new Button("Calculate");
        bcal.setPrefSize(130,50);
        bcal.setLayoutX(50);
        bcal.setLayoutY(300);
        bcal.setOnAction(e -> {
            try {
                double n = 12;
                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText()) / 100;
                double t = Double.parseDouble(t3.getText());

                double ans;
                double ans1;
                ans = p * (Math.pow((1 + r / n), n * t));
                ans1 = ans - p;
                l5.setText(String.format("%.2f", ans1));
            } catch (Exception text) {
                l5.setText("Please Enter the values in Integer" );
            }
        });



        Pane root = new Pane();
        root.getChildren().addAll(bcal,l1,l2,l3,l4,l5,t1,t2,t3);


        window3.setHeight(800);
        window3.setWidth(1000);
        window3.setScene(new Scene(root));
        window3.show();

    }
    public static void main(String[] args){
        launch(args);
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//
//
//    }


}
