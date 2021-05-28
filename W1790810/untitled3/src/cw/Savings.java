package cw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Savings extends Application {

    public static void root() {
        Stage window2 = new Stage();
        window2.setTitle("Financial Calculator");


        //FV
        Label l1 = new Label("Number of Periods:");
        l1.setLayoutY(100);
        l1.setLayoutX(50);
        Label l2 = new Label("Interst Rate:");
        l2.setLayoutY(150);
        l2.setLayoutX(50);
        Label l3 = new Label("Stat Principal:");
        l3.setLayoutY(200);
        l3.setLayoutX(50);
        Label l4 = new Label("Annuity Payment:");
        l4.setLayoutY(250);
        l4.setLayoutX(50);

        TextField t1 = new TextField();
        t1.setLayoutX(200);
        t1.setLayoutY(100);
        TextField t2 = new TextField();
        t2.setLayoutX(200);
        t2.setLayoutY(150);
        t2.setPromptText("%");
        TextField t3 = new TextField();
        t3.setLayoutX(200);
        t3.setLayoutY(200);
        TextField t4 = new TextField();
        t4.setLayoutX(200);
        t4.setLayoutY(250);

        Label lo1 = new Label("                 ");
        lo1.setLayoutY(430);
        lo1.setLayoutX(200);


        Button clear = new Button("Clear");
        clear.setLayoutX(332);
        clear.setLayoutY(290);
        clear.setOnAction(event -> {
            t1.clear();
            t2.clear();
            t3.clear();
            t4.clear();
            lo1.setText("");
        });

        Button bcal1 = new Button("Calculate");
        bcal1.setPrefSize(130, 50);
        bcal1.setLayoutX(50);
        bcal1.setLayoutY(350);
        bcal1.setOnAction(e -> {
            try {
                double n = 12;
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText()) / 100;
                double num3 = Double.parseDouble(t3.getText());
                double num4 = Double.parseDouble(t4.getText());
                double res;
                res = (num4 * (((pow((1 + (num2 / n)), (n * num1)) - 1)) / (num2 / n)) + (num3 * (pow((1 + (num2 / n)), (n * num1)))));
                lo1.setText(String.format("%.2f", res));
            } catch (Exception text) {
                lo1.setText("Enter the Values in Integer ");
            }
        });

        Label lout = new Label("Future Value: ");
        lout.setLayoutY(430);
        lout.setLayoutX(50);




        //PMT

        Label l5 = new Label("Number of Periods:");
        l5.setLayoutY(100);
        l5.setLayoutX(50);
        Label l6 = new Label("Future value:");
        l6.setLayoutY(150);
        l6.setLayoutX(50);
        Label l7 = new Label("Start Principal:");
        l7.setLayoutY(200);
        l7.setLayoutX(50);
        Label l8 = new Label("Interest rate:");
        l8.setLayoutY(250);
        l8.setLayoutX(50);


        TextField t5 = new TextField();
        t5.setLayoutX(200);
        t5.setLayoutY(100);
        TextField t6 = new TextField();
        t6.setLayoutX(200);
        t6.setLayoutY(150);
        TextField t7 = new TextField();
        t7.setLayoutX(200);
        t7.setLayoutY(200);
        TextField t8 = new TextField();
        t8.setLayoutX(200);
        t8.setLayoutY(250);
        t8.setPromptText("%");



        Button bcal2 = new Button("Calculate");
        bcal2.setPrefSize(130, 50);
        bcal2.setLayoutX(50);
        bcal2.setLayoutY(350);

        Label lin = new Label("                 ");
        lin.setLayoutY(430);
        lin.setLayoutX(200);

        Button clear1 = new Button("Clear");
        clear1.setLayoutX(332);
        clear1.setLayoutY(290);
        clear1.setOnAction(event -> {
            t5.clear();
            t6.clear();
            t7.clear();
            t8.clear();
            lin.setText("");
        });


        bcal2.setOnAction(e -> {
            try {
                double n = 12;
                double num5 = Double.parseDouble(t5.getText());
                double num6 = Double.parseDouble(t6.getText());
                double num7 = Double.parseDouble(t7.getText());
                double num8 = Double.parseDouble(t8.getText()) / 100;
                double res1;
                res1 = (num6 - (num7 * pow((1 + (num8 / n)), (n * num5)))) / ((pow((1 + (num8 / n)), (n * num5)) - 1) / (num8 / n));
                lin.setText(String.format("%.2f", res1));
            } catch (Exception text) {
                lin.setText("Enter the values in Integers");
            }
        });


        Label lout1 = new Label("Periodic Payment: ");
        lout1.setLayoutY(430);
        lout1.setLayoutX(50);
        lout1.setStyle(" -fx-font-weight: bold;");


        //INTEREST RATE
        Label lbl9 = new Label("Number of Periods:");
        lbl9.setLayoutY(100);
        lbl9.setLayoutX(50);
        Label lbl10 = new Label("Future value:");
        lbl10.setLayoutY(150);
        lbl10.setLayoutX(50);
        Label lbl11 = new Label("Start Principal:");
        lbl11.setLayoutY(200);
        lbl11.setLayoutX(50);
        Label lbl12 = new Label("Annuity Payment:");
        lbl12.setLayoutY(250);
        lbl12.setLayoutX(50);

        TextField txt9 = new TextField();
        txt9.setLayoutX(200);
        txt9.setLayoutY(100);
        TextField txt10 = new TextField();
        txt10.setLayoutX(200);
        txt10.setLayoutY(150);
        TextField txt11 = new TextField();
        txt11.setLayoutX(200);
        txt11.setLayoutY(200);
        TextField txt12 = new TextField();
        txt12.setLayoutX(200);
        txt12.setLayoutY(250);


        Button bcal3 = new Button("Calculate");
        bcal3.setPrefSize(130,50);
        bcal3.setLayoutX(50);
        bcal3.setLayoutY(350);


        Label lr = new Label("Interest Rate(%): " );
        lr.setLayoutY(430);
        lr.setLayoutX(50);

        Label lor = new Label("                 " );
        lor.setLayoutY(430);
        lor.setLayoutX(200);

        Button clear2 = new Button("Clear");
        clear2.setLayoutX(332);
        clear2.setLayoutY(290);
        clear2.setOnAction(event -> {
            txt9.clear();
            txt10.clear();
            txt11.clear();
            txt12.clear();
            lor.setText("");

        });
        bcal3.setOnAction(e -> {
            try {
                double n = 12;
                double num9 = Double.parseDouble(txt9.getText());
                double num10 = Double.parseDouble(txt10.getText());
                double num11 = Double.parseDouble(txt11.getText());
                double num12 = Double.parseDouble(txt12.getText());

                double res2;
                res2 = n * (pow((num10 / num11), (1 / (n * num9))) - 1);
                lor.setText(String.format("%.2f", res2));
            }catch (Exception text){
                lor.setText("Error, Enter Integers only");
            }
        });


        //Number of Periods
        Label lbl13 = new Label("Interest Rate:");
        lbl13.setLayoutY(100);
        lbl13.setLayoutX(50);
        Label lbl14 = new Label("Future value:");
        lbl14.setLayoutY(150);
        lbl14.setLayoutX(50);
        Label lbl15 = new Label("Start Principal:");
        lbl15.setLayoutY(200);
        lbl15.setLayoutX(50);
        Label lbl16 = new Label("Annuity Payment:");
        lbl16.setLayoutY(250);
        lbl16.setLayoutX(50);

        TextField txt13 = new TextField();
        txt13.setLayoutX(200);
        txt13.setLayoutY(100);
        txt13.setPromptText("%");

        TextField txt14 = new TextField();
        txt14.setLayoutX(200);
        txt14.setLayoutY(150);

        TextField txt15 = new TextField();
        txt15.setLayoutX(200);
        txt15.setLayoutY(200);

        TextField txt16 = new TextField();
        txt16.setLayoutX(200);
        txt16.setLayoutY(250);


        Button bcal4 = new Button("Calculate");
        bcal4.setPrefSize(130,50);
        bcal4.setLayoutX(50);
        Label lbl20 = new Label("Number of Periods (Years):" );
        lbl20.setLayoutY(430);
        lbl20.setLayoutX(50);

        Label lbl21 = new Label("                 " );
        lbl21.setLayoutY(430);
        lbl21.setLayoutX(200);

        Button clear3 = new Button("Clear");
        clear3.setLayoutX(332);
        clear3.setLayoutY(290);
        clear3.setOnAction(event -> {
            txt13.clear();
            txt14.clear();
            txt15.clear();
            txt16.clear();
            lbl20.setText("");

        });

        bcal4.setOnAction(e -> {
            try {
                double n = 12;
                double num13 = Double.parseDouble(txt13.getText()) / 100;
                double num14 = Double.parseDouble(txt14.getText());
                double num15 = Double.parseDouble(txt15.getText());
                double num16 = Double.parseDouble(txt16.getText());

                double res3;
                res3 = log((num14 + (num16 * 12 / num13)) / (num15 + (num16 * 12 / num13))) / (log(1 + (num13 / 12)) * 12);
                lbl21.setText(String.format("%.0f", res3));
            }catch (Exception text){
                lbl21.setText("Error!");
            }
        });

        //Start Principal
        Label lbl17 = new Label("Interest Rate:");
        lbl17.setLayoutY(100);
        lbl17.setLayoutX(50);

        Label lbl18 = new Label("Future value:");
        lbl18.setLayoutY(150);
        lbl18.setLayoutX(50);

        Label lbl19 = new Label("Number of Periods:");
        lbl19.setLayoutY(200);
        lbl19.setLayoutX(50);

        Label lbl25 = new Label("Annuity Payment:");
        lbl25.setLayoutY(250);
        lbl25.setLayoutX(50);

        TextField txt17 = new TextField();
        txt17.setLayoutX(200);
        txt17.setLayoutY(100);
        txt17.setPromptText("%");

        TextField txt18 = new TextField();
        txt18.setLayoutX(200);
        txt18.setLayoutY(150);

        TextField txt19 = new TextField();
        txt19.setLayoutX(200);
        txt19.setLayoutY(200);

        TextField txt20 = new TextField();
        txt20.setLayoutX(200);
        txt20.setLayoutY(250);

        Button bcal5 = new Button("Calculate");
        bcal5.setPrefSize(130,50);
        bcal5.setLayoutX(50);
        bcal5.setLayoutY(350);


        Label lbl29 = new Label("Start Principal: " );
        lbl29.setLayoutY(430);
        lbl29.setLayoutX(50);

        Label lbl30 = new Label("                 " );
        lbl30.setLayoutY(430);
        lbl30.setLayoutX(200);

        Button clear4 = new Button("Clear");
        clear4.setLayoutX(332);
        clear4.setLayoutY(290);
        clear4.setOnAction(event -> {
            txt17.clear();
            txt18.clear();
            txt19.clear();
            txt20.clear();
            lbl30.setText("");
        });

        bcal5.setOnAction(e -> {
            try {
                double n = 12;
                double num17 = Double.parseDouble(txt17.getText()) / 100;
                double num18 = Double.parseDouble(txt18.getText());
                double num19 = Double.parseDouble(txt19.getText());
                double num20 = Double.parseDouble(txt20.getText());

                double res4;
                res4 = (num18-(num20*((pow((1+(num17/n)),(n*num19))-1)/(num17/n))))/(pow((1+(num17/n)),(n*num19)));
                lbl30.setText(String.format("%.2f", res4));

            }
            catch (Exception text){
                lbl30.setText("Error! Please enter Integer Values:");

            }
        });



        //Tabe Pane
        TabPane tb =new TabPane() ;
        Tab tb1= new Tab("FV (Future Value)");
        Tab tb2= new Tab("PMT (Annuity Payment)");
        Tab tb3= new Tab("I/Y (Interest Rate)");
        Tab tb4= new Tab("N (Number of Periods)");
        Tab tb5= new Tab("Start Principal");
        tb.getTabs().add(tb1);
        tb.getTabs().add(tb2);
        tb.getTabs().add(tb3);
        tb.getTabs().add(tb4);
        tb.getTabs().add(tb5);
        tb.setTabMinWidth(100);
        tb.setTabMinHeight(40);
        VBox vb=new VBox(tb);
        Scene sc =new Scene(vb);


        Pane layout1 = new Pane();
        layout1.getChildren().addAll(l1,l2,l3,l4,t1,t2,t3,t4,bcal1,lout,lo1,clear);
        tb1.setContent(layout1);

        Pane layout2 = new Pane();
        layout2.getChildren().addAll(l5,l6,l7,l8,t5,t6,t7,t8,bcal2,lin,lout,clear1);
        tb2.setContent(layout2);

        Pane layout3 = new Pane();
        layout3.getChildren().addAll(lbl9,lbl10,lbl11,lbl12,txt9,txt10,txt11,txt12,bcal3,lor,lr,clear2);
        tb3.setContent(layout3);

        Pane layout4 = new Pane();
        layout4.getChildren().addAll(lbl13,lbl14,lbl15,lbl16,txt13,txt14,txt15,txt16,bcal4,lbl20,lbl21,clear3);
        tb4.setContent(layout4);

        Pane layout5= new Pane();
        layout5.getChildren().addAll(lbl17,lbl18,lbl19,lbl20,txt17,txt18,txt19,txt20,bcal5,lbl29,lbl30,clear4);
        tb5.setContent(layout5);

        window2.setScene(sc);
        window2.show();
        window2.setHeight(800);
        window2.setWidth(1000);
    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
