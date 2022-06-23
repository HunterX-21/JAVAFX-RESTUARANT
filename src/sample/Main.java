package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.application.Platform;
import java.io.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scene10,scene11,scene12;

    Menu menu = new Menu();
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Gerald's Restaurant");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(8);
        grid.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(grid, 350, 250);
        Label welcome = new Label("WELCOME");
        grid.add(welcome,2,0);
        welcome.setTranslateY(-80);
        welcome.setTranslateX(-50);
        welcome.setStyle("-fx-font-weight: bold;");

        Label to = new Label("TO");
        grid.add(to,2,0);
        to.setTranslateY(-68);
        to.setTranslateX(-25);
        to.setStyle("-fx-font-weight: bold;");

        Label Geralds = new Label("GERALDS's");
        grid.add(Geralds,2,0);
        Geralds.setTranslateY(-56);
        Geralds.setTranslateX(-50);
        Geralds.setStyle("-fx-font-weight: bold;");

        Button bButton = new Button("Breakfast");
        grid.add(bButton, 0, 0);
        bButton.setStyle("-fx-background-color: #87CEFA; ");

        bButton.setOnAction(e -> window.setScene(scene1)  );

//LAYOUT 2 setting up next scene which shows menu and buttons to select

        GridPane layout2 = new  GridPane();
        Label label1 = new Label("Make a Choice");
        TextArea txt = new TextArea(menu.getAllBreakfast());
        grid.add(txt,0,0);
        txt.setEditable(false);
        Button b1Button = new Button("                   1                     ");
        grid.add(b1Button,0,4);
        b1Button.setTranslateX(130);

        b1Button.setOnAction(e -> window.setScene(scene4));

        Button b2Button = new Button("                   2                     ");
        grid.add(b2Button,0,5);
        b2Button.setTranslateX(130);
        b2Button.setOnAction(e -> window.setScene(scene5));

        Button b3Button = new Button("                   3                     ");
        grid.add(b3Button,0,6);
        b3Button.setTranslateX(130);
        b3Button.setOnAction(e -> window.setScene(scene6));

             //Go back to first scene to select the menu you want//////
        Button back = new Button("  ←  ");
        back.setTranslateX(354);
        back.setTranslateY(-75);
        back.setStyle("-fx-background-color: #FF6347; ");
        back.setOnAction(actionEvent -> window.setScene(myScene));

        layout2.getChildren().addAll(label1,txt,b1Button, b2Button, b3Button,back);
        scene1 = new Scene(layout2,400 ,400);

        Button lButton = new Button("lunch");
        grid.add(lButton, 1, 0);
        lButton.setStyle("-fx-background-color: #3CB371; ");

        lButton.setOnAction(e -> window.setScene(scene2)  );

        GridPane layout3 = new  GridPane();
        Label label2 = new Label("Make a Choice");
        TextArea txt2 = new TextArea(menu.getAllLunch());
        grid.add(txt2,0,0);
        txt2.setEditable(false);

        Button l1Button = new Button("                   1                     ");
        grid.add(l1Button,0,4);
        l1Button.setTranslateX(130);
        l1Button.setOnAction(e -> window.setScene(scene7));

        Button l2Button = new Button("                   2                     ");
        grid.add(l2Button,0,5);
        l2Button.setTranslateX(130);
        l2Button.setOnAction(e -> window.setScene(scene8));

        Button l3Button = new Button("                   3                     ");
        grid.add(l3Button,0,6);
        l3Button.setTranslateX(130);
        l3Button.setOnAction(e -> window.setScene(scene9));

        //Go back to first scene to select the menu you want//////
        Button back2 = new Button("  ←  ");
        back2.setTranslateX(354);
        back2.setTranslateY(-75);
        back2.setStyle("-fx-background-color: #FF6347; ");
        back2.setOnAction(actionEvent -> window.setScene(myScene));

        layout3.getChildren().addAll(label2,txt2,l1Button, l2Button, l3Button,back2);
        scene2 = new Scene(layout3,400 ,400);



        Button dButton = new Button("Dinner");
        grid.add(dButton, 2, 0);
        dButton.setStyle("-fx-background-color: #708090; ");
        dButton.setOnAction(e -> window.setScene(scene3)  );
//Layout 3
        GridPane layout4 = new  GridPane();
        Label label3 = new Label("Make a Choice");
        TextArea txt3 = new TextArea(menu.getAllDinner());
        grid.add(txt3,0,0);
        txt3.setEditable(false);

        Button d1Button = new Button("                   1                     ");
        grid.add(d1Button,0,4);
        d1Button.setTranslateX(130);
        d1Button.setOnAction(e -> window.setScene(scene10));

        Button d2Button = new Button("                   2                     ");
        grid.add(d2Button,0,5);
        d2Button.setTranslateX(130);
        d2Button.setOnAction(e -> window.setScene(scene11));

        Button d3Button = new Button("                   3                     ");
        grid.add(d3Button,0,6);
        d3Button.setTranslateX(130);
        d3Button.setOnAction(e -> window.setScene(scene12));

        //Go back to first scene to select the menu you want//////
        Button back3 = new Button("  ←  ");
        back3.setTranslateX(354);
        back3.setTranslateY(-75);
        back3.setStyle("-fx-background-color: #FF6347; ");
        back3.setOnAction(actionEvent -> window.setScene(myScene));

        layout4.getChildren().addAll(label3,txt3,d1Button, d2Button, d3Button,back3);
        scene3 = new Scene(layout4,400 ,400);

////////////////////////////////////////----------------1ST DIV-------------/////////////////////////////////////////////////////////////
//Layout5 FIRST BREAKFAST SELECT
        GridPane layout5= new  GridPane();
        Label label4 = new Label("Price of Bread:$");
        label4.setTranslateX(50);
        Label label5 = new Label("Quantity");
        label5.setTranslateX(250);
        label5.setTranslateY(-20);
        TextField  Price = new TextField("10");
        Price.setEditable(false);
        grid.add(Price, 1, 0);
        Price.setTranslateX(-200);
        TextField Quantity = new TextField();
        grid.add(Quantity, 2, 0);
        TextField Payment = new TextField();
        grid.add(Payment, 2, 1);
        Payment.setTranslateY(-75);
        Payment.setTranslateX(-180);
        Label label6 = new Label("Enter Payment Amount:");
        label6.setTranslateY(25);
        label6.setTranslateX(50);

        Button Calc = new Button(" Done ");
        grid.add(Calc,2,2);
        Calc.setTranslateY(-70);
        Calc.setTranslateX(-180);
        Quantity.setTranslateX(-180);
        TextArea Outro = new TextArea();
        Outro.setEditable(false);
        Outro.setPrefWidth(400);
        Outro.setTranslateY(170);
        Outro.setTranslateX(50);
        Calc.setOnAction(actionEvent ->{
            Double value1 = Double.valueOf(Price.getText());
            Double value2 = Double.valueOf(Quantity.getText());
            double payment = Double.parseDouble(Payment.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro.setText("Not enough payment");}
            else{
            Outro.setText(" You Ordered "+Quantity.getText()+" Bread"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment.getText()
            +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for starting your day with us  "
            );}
        });
        Button back4 = new Button("    ←    ");
        back4.setTranslateX(400);
        back4.setTranslateY(-75);
        back4.setStyle("-fx-background-color: #FF6347; ");
        back4.setOnAction(actionEvent -> window.setScene(scene1));

////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout = new Button("Get Receipt");
        Checkout.setTranslateY(280);
        Checkout.setTranslateX(180);
        Checkout.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Breakfast "+date +".txt");
                myWriter.write(""+Outro.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout5.getChildren().addAll(label4,Price,label5,Quantity,label6,Payment,Calc,Outro,back4,Checkout);
        scene4 = new Scene(layout5,500 ,400);

//Layout5 SECOND BREAKFAST SELECT
        GridPane layout6= new  GridPane();
        Label b2 = new Label("Price of Eggs:$");
        b2.setTranslateX(50);
        Label b22 = new Label("Quantity");
        b22.setTranslateX(250);
        b22.setTranslateY(-20);
        TextField Price2 = new TextField("12");
        Price2.setEditable(false);
        grid.add(Price2, 1, 0);
        Price2.setTranslateX(-200);
        TextField Quantity2 = new TextField();
        grid.add(Quantity2, 2, 0);
        TextField Payment2 = new TextField();
        grid.add(Payment2, 2, 1);
        Payment2.setTranslateY(-75);
        Payment2.setTranslateX(-180);
        Label b222 = new Label("Enter Payment Amount:");
        b222.setTranslateY(25);
        b222.setTranslateX(50);

        Button Calc2 = new Button(" Done ");
        grid.add(Calc2,2,2);
        Calc2.setTranslateY(-70);
        Calc2.setTranslateX(-180);
        Quantity2.setTranslateX(-180);
        TextArea Outro2 = new TextArea();
        Outro2.setEditable(false);
        Outro2.setPrefWidth(400);
        Outro2.setTranslateY(170);
        Outro2.setTranslateX(50);
        Calc2.setOnAction(e ->{
            Double value1 = Double.valueOf(Price2.getText());
            Double value2 = Double.valueOf(Quantity2.getText());
            double payment = Double.parseDouble(Payment2.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro2.setText("Not enough payment");}
            else{
            Outro2.setText(" You Ordered "+Quantity2.getText()+" Eggs"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment2.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for starting your day with us  "
            );}
        });
        Button back5 = new Button("    ←    ");
        back5.setTranslateX(400);
        back5.setTranslateY(-75);
        back5.setStyle("-fx-background-color: #FF6347; ");
        back5.setOnAction(actionEvent -> window.setScene(scene1));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout2 = new Button("Get Receipt");
        Checkout2.setTranslateY(280);
        Checkout2.setTranslateX(180);
        Checkout2.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Breakfast "+date +".txt");
                myWriter.write(""+Outro2.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout6.getChildren().addAll(b2,b22,b222,Price2,Quantity2,Payment2,Calc2,Outro2,back5,Checkout2);
        scene5 = new Scene(layout6,500 ,400);

//Layout5 Third BREAKFAST SELECT
        GridPane layout7= new  GridPane();
        Label b3 = new Label("Price of Oat Meal:$");
        b3.setTranslateX(50);
        Label b33 = new Label("Quantity");
        b33.setTranslateX(250);
        b33.setTranslateY(-20);
        TextField Price3 = new TextField("15");
        Price3.setEditable(false);
        grid.add(Price3, 1, 0);
        Price3.setTranslateX(-200);
        TextField Quantity3 = new TextField();
        grid.add(Quantity3, 2, 0);
        TextField Payment3 = new TextField();
        grid.add(Payment3, 2, 1);
        Payment3.setTranslateY(-75);
        Payment3.setTranslateX(-180);
        Label b333 = new Label("Enter Payment Amount:");
        b333.setTranslateY(25);
        b333.setTranslateX(50);

        Button Calc3 = new Button(" Done ");
        grid.add(Calc3,2,2);
        Calc3.setTranslateY(-70);
        Calc3.setTranslateX(-180);
        Quantity3.setTranslateX(-180);
        TextArea Outro3 = new TextArea();
        Outro3.setEditable(false);
        Outro3.setPrefWidth(400);
        Outro3.setTranslateY(170);
        Outro3.setTranslateX(50);
        Calc3.setOnAction(e ->{
            Double value1 = Double.valueOf(Price3.getText());
            Double value2 = Double.valueOf(Quantity3.getText());
            double payment = Double.parseDouble(Payment3.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro3.setText("Not enough payment");}
            else{
            Outro3.setText(" You Ordered "+Quantity3.getText()+" Oat Meals"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment3.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for starting your day with us  "
            );}
        });
        Button back6 = new Button("    ←    ");
        back6.setTranslateX(400);
        back6.setTranslateY(-75);
        back6.setStyle("-fx-background-color: #FF6347; ");
        back6.setOnAction(actionEvent -> window.setScene(scene1));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout3 = new Button("Get Receipt");
        Checkout3.setTranslateY(280);
        Checkout3.setTranslateX(180);
        Checkout3.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Breakfast "+date +".txt");
                myWriter.write(""+Outro3.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout7.getChildren().addAll(b3,b33,b333,Price3,Quantity3,Payment3,Calc3,Outro3,back6,Checkout3);
        scene6 = new Scene(layout7,500 ,400);

      ///////////  //NOW I'M GETTING ITEMS OF LUNCH MENU//////////////////////////////////////////////////////////////////////////////
        GridPane layout8= new  GridPane();
        Label l1 = new Label("Price of Rice:$");
        l1.setTranslateX(50);
        Label l11 = new Label("Quantity");
        l11.setTranslateX(250);
        l11.setTranslateY(-20);
        TextField Price4 = new TextField("25");
        Price4.setEditable(false);
        grid.add(Price4, 1, 0);
        Price4.setTranslateX(-200);
        TextField Quantity4 = new TextField();
        grid.add(Quantity4, 2, 0);
        TextField Payment4 = new TextField();
        grid.add(Payment4, 2, 1);
        Payment4.setTranslateY(-75);
        Payment4.setTranslateX(-180);
        Label l111 = new Label("Enter Payment Amount:");
        l111.setTranslateY(25);
        l111.setTranslateX(50);

        Button Calc4 = new Button(" Done ");
        grid.add(Calc4,2,2);
        Calc4.setTranslateY(-70);
        Calc4.setTranslateX(-180);
        Quantity4.setTranslateX(-180);
        TextArea Outro4 = new TextArea();
        Outro4.setEditable(false);
        Outro4.setPrefWidth(400);
        Outro4.setTranslateY(170);
        Outro4.setTranslateX(50);
        Calc4.setOnAction(e ->{
            Double value1 = Double.valueOf(Price4.getText());
            Double value2 = Double.valueOf(Quantity4.getText());
            double payment = Double.parseDouble(Payment4.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro4.setText("Not enough payment");}
            else{
            Outro4.setText(" You Ordered "+Quantity4.getText()+" Rice"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment4.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for having lunch with us  "
            );}
        });
        Button back7 = new Button("    ←    ");
        back7.setTranslateX(400);
        back7.setTranslateY(-75);
        back7.setStyle("-fx-background-color: #FF6347; ");
        back7.setOnAction(actionEvent -> window.setScene(scene2));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout4 = new Button("Get Receipt");
        Checkout4.setTranslateY(280);
        Checkout4.setTranslateX(180);
        Checkout4.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Lunch "+date +".txt");
                myWriter.write(""+Outro4.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout8.getChildren().addAll(l1,l11,l111,Price4,Quantity4,Payment4,Calc4,Outro4,back7,Checkout4);
        scene7 = new Scene(layout8,500 ,400);

        //lunch option2
        GridPane layout9= new  GridPane();
        Label l2 = new Label("Price of Fries:$");
        l2.setTranslateX(50);
        Label l22 = new Label("Quantity");
        l22.setTranslateX(250);
        l22.setTranslateY(-20);
        TextField Price5 = new TextField("30");
        Price5.setEditable(false);
        grid.add(Price5, 1, 0);
        Price5.setTranslateX(-200);
        TextField Quantity5 = new TextField();
        grid.add(Quantity5, 2, 0);
        TextField Payment5 = new TextField();
        grid.add(Payment5, 2, 1);
        Payment5.setTranslateY(-75);
        Payment5.setTranslateX(-180);
        Label l222 = new Label("Enter Payment Amount:");
        l222.setTranslateY(25);
        l222.setTranslateX(50);

        Button Calc5 = new Button(" Done ");
        grid.add(Calc5,2,2);
        Calc5.setTranslateY(-70);
        Calc5.setTranslateX(-180);
        Quantity5.setTranslateX(-180);
        TextArea Outro5 = new TextArea();
        Outro5.setEditable(false);
        Outro5.setPrefWidth(400);
        Outro5.setTranslateY(170);
        Outro5.setTranslateX(50);
        Calc5.setOnAction(e ->{
            Double value1 = Double.valueOf(Price5.getText());
            Double value2 = Double.valueOf(Quantity5.getText());
            double payment = Double.parseDouble(Payment5.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro5.setText("Not enough payment");}
            else{
            Outro5.setText(" You Ordered "+Quantity5.getText()+" French Fries"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment5.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for having lunch with us  "
            );}
        });
        Button back8 = new Button("    ←    ");
        back8.setTranslateX(400);
        back8.setTranslateY(-75);
        back8.setStyle("-fx-background-color: #FF6347; ");
        back8.setOnAction(actionEvent -> window.setScene(scene2));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout5 = new Button("Get Receipt");
        Checkout5.setTranslateY(280);
        Checkout5.setTranslateX(180);
        Checkout5.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Lunch "+date +".txt");
                myWriter.write(""+Outro5.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout9.getChildren().addAll(l2,l22,l222,Price5,Quantity5,Payment5,Calc5,Outro5,back8,Checkout5);
        scene8 = new Scene(layout9,500 ,400);

///LUNCH OPTION 3
        GridPane layout10 = new  GridPane();
        Label l3 = new Label("Price of FUFU:$");
        l3.setTranslateX(50);
        Label l33 = new Label("Quantity");
        l33.setTranslateX(250);
        l33.setTranslateY(-20);
        TextField Price6 = new TextField("20");
        Price6.setEditable(false);
        grid.add(Price6, 1, 0);
        Price6.setTranslateX(-200);
        TextField Quantity6 = new TextField();
        grid.add(Quantity6, 2, 0);
        TextField Payment6 = new TextField();
        grid.add(Payment6, 2, 1);
        Payment6.setTranslateY(-75);
        Payment6.setTranslateX(-180);
        Label l333 = new Label("Enter Payment Amount:");
        l333.setTranslateY(25);
        l333.setTranslateX(50);

        Button Calc6 = new Button(" Done ");
        grid.add(Calc6,2,2);
        Calc6.setTranslateY(-70);
        Calc6.setTranslateX(-180);
        Quantity6.setTranslateX(-180);
        TextArea Outro6 = new TextArea();
        Outro6.setEditable(false);
        Outro6.setPrefWidth(400);
        Outro6.setTranslateY(170);
        Outro6.setTranslateX(50);
        Calc6.setOnAction(e ->{
            Double value1 = Double.valueOf(Price6.getText());
            Double value2 = Double.valueOf(Quantity6.getText());
            double payment = Double.parseDouble(Payment6.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro6.setText("Not enough payment");}
            else{
            Outro6.setText(" You Ordered "+Quantity6.getText()+" FUFU"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment6.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for having lunch with us  "
            );}
        });
        Button back9 = new Button("    ←    ");
        back9.setTranslateX(400);
        back9.setTranslateY(-75);
        back9.setStyle("-fx-background-color: #FF6347; ");
        back9.setOnAction(actionEvent -> window.setScene(scene2));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout6 = new Button("Get Receipt");
        Checkout6.setTranslateY(280);
        Checkout6.setTranslateX(180);
        Checkout6.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Lunch "+date +".txt");
                myWriter.write(""+Outro6.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout10.getChildren().addAll(l3,l33,l333,Price6,Quantity6,Payment6,Calc6,Outro6,back9,Checkout6);
        scene9 = new Scene(layout10,500 ,400);

        ///////////////////Dinner Menu now/////////////////////////////////////////////////////////////////

        GridPane layout11 = new  GridPane();
        Label d1 = new Label("Price of Tea: $");
        d1.setTranslateX(50);
        Label d11 = new Label("Quantity");
        d11.setTranslateX(250);
        d11.setTranslateY(-20);
        TextField Price7 = new TextField("5");
        Price7.setEditable(false);
        grid.add(Price7, 1, 0);
        Price7.setTranslateX(-200);
        TextField Quantity7 = new TextField();
        grid.add(Quantity7, 2, 0);
        TextField Payment7 = new TextField();
        grid.add(Payment7, 2, 1);
        Payment7.setTranslateY(-75);
        Payment7.setTranslateX(-180);
        Label d111 = new Label("Enter Payment Amount:");
        d111.setTranslateY(25);
        d111.setTranslateX(50);

        Button Calc7 = new Button(" Done ");
        grid.add(Calc7,2,2);
        Calc7.setTranslateY(-70);
        Calc7.setTranslateX(-180);
        Quantity7.setTranslateX(-180);
        TextArea Outro7 = new TextArea();
        Outro7.setEditable(false);
        Outro7.setPrefWidth(400);
        Outro7.setTranslateY(170);
        Outro7.setTranslateX(50);
        Calc7.setOnAction(e ->{
            Double value1 = Double.valueOf(Price7.getText());
            Double value2 = Double.valueOf(Quantity7.getText());
            double payment = Double.parseDouble(Payment7.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro7.setText("Not enough payment");}
            else{
            Outro7.setText(" You Ordered "+Quantity7.getText()+" Tea"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment7.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for dining with us  "
            );}
        });
        Button back10 = new Button("    ←    ");
        back10.setTranslateX(400);
        back10.setTranslateY(-75);
        back10.setStyle("-fx-background-color: #FF6347; ");
        back10.setOnAction(actionEvent -> window.setScene(scene3));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout7 = new Button("Get Receipt");
        Checkout7.setTranslateY(280);
        Checkout7.setTranslateX(180);
        Checkout7.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Dinner "+date +".txt");
                myWriter.write(""+Outro7.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout11.getChildren().addAll(d1,d11,d111,Price7,Quantity7,Payment7,Calc7,Outro7,back10,Checkout7);
        scene10 = new Scene(layout11,500 ,400);

        ////////////Dinner OPTION 2//////////////////////////////////////

        GridPane layout12 = new  GridPane();
        Label d2 = new Label("Price of Pizza: $");
        d2.setTranslateX(50);
        Label d22 = new Label("Quantity");
        d22.setTranslateX(250);
        d22.setTranslateY(-20);
        TextField Price8 = new TextField("10");
        Price8.setEditable(false);
        grid.add(Price8, 1, 0);
        Price8.setTranslateX(-200);
        TextField Quantity8 = new TextField();
        grid.add(Quantity8, 2, 0);
        TextField Payment8 = new TextField();
        grid.add(Payment8, 2, 1);
        Payment8.setTranslateY(-75);
        Payment8.setTranslateX(-180);
        Label d222 = new Label("Enter Payment Amount:");
        d222.setTranslateY(25);
        d222.setTranslateX(50);

        Button Calc8 = new Button(" Done ");
        grid.add(Calc8,2,2);
        Calc8.setTranslateY(-70);
        Calc8.setTranslateX(-180);
        Quantity8.setTranslateX(-180);
        TextArea Outro8 = new TextArea();
        Outro8.setEditable(false);
        Outro8.setPrefWidth(400);
        Outro8.setTranslateY(170);
        Outro8.setTranslateX(50);
        Calc8.setOnAction(e ->{
            Double value1 = Double.valueOf(Price8.getText());
            Double value2 = Double.valueOf(Quantity8.getText());
            double payment = Double.parseDouble(Payment8.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro8.setText("Not enough payment");}
            else{
            Outro8.setText(" You Ordered "+Quantity8.getText()+" Pizza"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment8.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for dining with us  "
            );}
        });
        Button back11 = new Button("    ←    ");
        back11.setTranslateX(400);
        back11.setTranslateY(-75);
        back11.setStyle("-fx-background-color: #FF6347; ");
        back11.setOnAction(actionEvent -> window.setScene(scene3));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout8 = new Button("Get Receipt");
        Checkout8.setTranslateY(280);
        Checkout8.setTranslateX(180);
        Checkout8.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Dinner "+date +".txt");
                myWriter.write(""+Outro8.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout12.getChildren().addAll(d2,d22,d222,Price8,Quantity8,Payment8,Calc8,Outro8,back11,Checkout8);
        scene11 = new Scene(layout12,500 ,400);

        //////////////////////////////////Dinner Option 3///////////////////////////////////
        GridPane layout13 = new  GridPane();
        Label d3 = new Label("Price of Chinese:$");
        d3.setTranslateX(49);
        Label d33 = new Label("Quantity");
        d33.setTranslateX(250);
        d33.setTranslateY(-20);
        TextField Price9 = new TextField("16");
        Price9.setEditable(false);
        grid.add(Price9, 1, 0);
        Price9.setTranslateX(-200);
        TextField Quantity9 = new TextField();
        grid.add(Quantity9, 2, 0);
        TextField Payment9 = new TextField();
        grid.add(Payment9, 2, 1);
        Payment9.setTranslateY(-75);
        Payment9.setTranslateX(-180);
        Label d333 = new Label("Enter Payment Amount:");
        d333.setTranslateY(25);
        d333.setTranslateX(50);

        Button Calc9 = new Button(" Done ");
        grid.add(Calc9,2,2);
        Calc9.setTranslateY(-70);
        Calc9.setTranslateX(-180);
        Quantity9.setTranslateX(-180);
        TextArea Outro9 = new TextArea();
        Outro9.setEditable(false);
        Outro9.setPrefWidth(400);
        Outro9.setTranslateY(170);
        Outro9.setTranslateX(50);
        Calc9.setOnAction(e ->{
            Double value1 = Double.valueOf(Price9.getText());
            Double value2 = Double.valueOf(Quantity9.getText());
            double payment = Double.parseDouble(Payment9.getText());
            double Total = value1 * value2;
            double balance = payment - Total;
            if (payment < Total) { Outro9.setText("Not enough payment");}
            else{
            Outro9.setText(" You Ordered "+Quantity9.getText()+" Chinese"+"\n"+" Your Total is  $ "+ Total +"\n" +" You paid  $ "+Payment9.getText()
                    +"\n"+" Your Balance is  $ "+balance+"\n\n"+" Thank you for dining with us  "
            );}
        });
        Button back12 = new Button("    ←    ");
        back12.setTranslateX(400);
        back12.setTranslateY(-75);
        back12.setStyle("-fx-background-color: #FF6347; ");
        back12.setOnAction(actionEvent -> window.setScene(scene3));

        ////////////////////////////////////////Save Receipt//////////////////////////////////
        Button Checkout9 = new Button("Get Receipt");
        Checkout9.setTranslateY(280);
        Checkout9.setTranslateX(180);
        Checkout9.setOnAction(actionEvent ->{
            try {
                String date = new SimpleDateFormat("yyyMMddHHmmssSS").format(new Date());
                FileWriter myWriter = new FileWriter("Receipts\\Dinner "+date +".txt");
                myWriter.write(""+Outro9.getText());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        layout13.getChildren().addAll(d3,d33,d333,Price9,Quantity9,Payment9,Calc9,Outro9,back12,Checkout9);
        scene12 = new Scene(layout13,500 ,400);

        Button eButton = new Button(" Exit ");
        grid.add(eButton, 3, 0);
        eButton.setStyle("-fx-background-color: #FF6347; ");

        eButton.setOnAction(actionEvent -> Platform.exit());


        window.setScene(myScene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}