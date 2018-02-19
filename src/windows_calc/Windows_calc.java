/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows_calc;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.control.ScrollPane;
//import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//import javafx.stage.StageStyle;

/**
 *
 * @author User
 */
public class Windows_calc extends Application {
    public double num1,num2,result;
    public int countNum=0;
    String check="",lastCommand="";
    
    //ScrollPane scroll = new ScrollPane();
        
    @Override
    public void start(Stage stage) {
        
        Button AC = new Button();
        
        Label labMain = new Label("");
        Label lab = new Label("");
        
        Button one = new Button();
        Button two = new Button();
        Button three = new Button();
        Button four = new Button();
        Button five = new Button();
        Button six = new Button();
        Button seven = new Button();
        Button eight = new Button();
        Button nine = new Button();
        Button zero = new Button();
        Button div = new Button();
        Button mult = new Button();
        Button minus = new Button();
        Button plus = new Button();
        Button eq = new Button();
        
        AC.setText("AC");
        AC.setId("AC");
        
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        zero.setText("0");
        
        div.setText("÷");
        div.setId("div");
        mult.setText("*");
        mult.setId("mult");
        minus.setText("-");
        minus.setId("minus");
        plus.setText("+");
        plus.setId("plus");
        eq.setText("=");
        eq.setId("eq");
        
        labMain.setLayoutX(10);
        labMain.setLayoutY(50);
        labMain.setPrefWidth(370);
        labMain.setPrefHeight(35);
        labMain.setId("labMain");
        
        lab.setLayoutX(10);
        lab.setLayoutY(15);
        lab.setPrefWidth(370);
        lab.setPrefHeight(35);
        lab.setId("lab");
        
        labMain.setAlignment(Pos.BASELINE_RIGHT);
        lab.setAlignment(Pos.BASELINE_RIGHT);
                
        seven.setLayoutX(10);
        seven.setLayoutY(95);
        seven.setPrefWidth(85);
        seven.setPrefHeight(85);
        
        eight.setLayoutX(105);
        eight.setLayoutY(95);
        eight.setPrefWidth(85);
        eight.setPrefHeight(85);
        
        nine.setLayoutX(200);
        nine.setLayoutY(95);
        nine.setPrefWidth(85);
        nine.setPrefHeight(85);
        
        div.setLayoutX(295);
        div.setLayoutY(95);
        div.setPrefWidth(85);
        div.setPrefHeight(85);
        
        four.setLayoutX(10);
        four.setLayoutY(190);
        four.setPrefWidth(85);
        four.setPrefHeight(85);
        
        five.setLayoutX(105);
        five.setLayoutY(190);
        five.setPrefWidth(85);
        five.setPrefHeight(85);
 
        six.setLayoutX(200);
        six.setLayoutY(190);
        six.setPrefWidth(85);
        six.setPrefHeight(85);
 
        mult.setLayoutX(295);
        mult.setLayoutY(190);
        mult.setPrefWidth(85);
        mult.setPrefHeight(85);
        
        one.setLayoutX(10);
        one.setLayoutY(285);
        one.setPrefWidth(85);
        one.setPrefHeight(85);
        
        two.setLayoutX(105);
        two.setLayoutY(285);
        two.setPrefWidth(85);
        two.setPrefHeight(85);
 
        three.setLayoutX(200);
        three.setLayoutY(285);
        three.setPrefWidth(85);
        three.setPrefHeight(85);
 
        minus.setLayoutX(295);
        minus.setLayoutY(285);
        minus.setPrefWidth(85);
        minus.setPrefHeight(85);
        
        zero.setLayoutX(10); 
        zero.setLayoutY(380);
        zero.setPrefWidth(85);
        zero.setPrefHeight(85);
        
        AC.setLayoutX(105); 
        AC.setLayoutY(380);
        AC.setPrefWidth(85);
        AC.setPrefHeight(85);
        
        eq.setLayoutX(200);
        eq.setLayoutY(380);
        eq.setPrefWidth(85);
        eq.setPrefHeight(85);
        
        plus.setLayoutX(295);
        plus.setLayoutY(380);
        plus.setPrefWidth(85);
        plus.setPrefHeight(85);
        
        
        one.setOnAction((e) -> {
            lab.setText(lab.getText() +"1");
            labMain.setText(labMain.getText() +"1");
        });
        two.setOnAction((e) -> {
            lab.setText(lab.getText()+"2");
            labMain.setText(labMain.getText() +"2");
        });
        three.setOnAction((e) -> {
            lab.setText(lab.getText()+"3");
            labMain.setText(labMain.getText() +"3");
        });
        four.setOnAction((e) -> {
            lab.setText(lab.getText()+"4");
            labMain.setText(labMain.getText() +"4");
        });
        five.setOnAction((e) -> {
            lab.setText(lab.getText()+"5");
            labMain.setText(labMain.getText() +"5");
        });
        six.setOnAction((e) -> {
            lab.setText(lab.getText()+"6");
            labMain.setText(labMain.getText() +"6");
        });
        seven.setOnAction((e) -> {
            lab.setText(lab.getText()+"7");
            labMain.setText(labMain.getText() +"7");
        });
        eight.setOnAction((e) -> {
            lab.setText(lab.getText()+"8");
            labMain.setText(labMain.getText() +"8");
        });
        nine.setOnAction((e) -> {
            lab.setText(lab.getText()+"9");
            labMain.setText(labMain.getText() +"9");
        });
        zero.setOnAction((e) -> {
            lab.setText(lab.getText()+"0");
            labMain.setText(labMain.getText() +"0");
        });
        
        oper op=new oper();
        //operation
        plus.setOnAction((e) -> {
            lab.setText(lab.getText()+"+");
            num1=Integer.parseInt(labMain.getText());
            labMain.setText("");
            check="plus";
        });
        minus.setOnAction((e) -> {
            lab.setText(lab.getText()+"-");
             num1=Integer.parseInt(labMain.getText());
             labMain.setText("");
             check="minus";
        });
        div.setOnAction((e) -> {
            lab.setText(lab.getText()+"/");
             num1=Integer.parseInt(labMain.getText());
             labMain.setText("");
            check="div";
        });
        mult.setOnAction((e) -> {
            lab.setText(lab.getText()+"*");
             num1=Integer.parseInt(labMain.getText());
             labMain.setText("");
             check="mult";
        });
        eq.setOnAction((e) -> {
            //countOper+=1;
            lab.setText(lab.getText()+"=");
            num2=Integer.parseInt(labMain.getText());
            labMain.setText("");
             
            if(check.equals("plus")){
                result=op.plus(num1, num2);
                lab.setText(lab.getText()+result);
                labMain.setText(result+"");
            }else if(check.equals("minus")){
                result=op.minus(num1, num2);
                lab.setText(lab.getText()+result);
                labMain.setText(result+"");
            }else if(check.equals("mult")){
                result=op.mult(num1, num2);
                lab.setText(lab.getText()+result);
                labMain.setText(result+"");
            }else if(check.equals("div")){
                result=op.div(num1, num2);
                lab.setText(lab.getText()+result);
                labMain.setText(result+"");
            }
            //scroll.setContent(lab);
        });
        AC.setOnAction((e) -> {
            num1=0;
            num2=0;
            result=0;
            lab.setText("");
            labMain.setText("");
        });
        
        Pane root = new Pane();
        
        root.getChildren().addAll(lab,labMain,one,two,three,four,five,six,seven,eight,nine,zero,mult,div,plus,minus,eq,AC);        
        Scene scene = new Scene(root, 380, 475);
        
//      scroll.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        scene.getStylesheets().add("style/style.css");
//      stage.getIcons().add(new Image("file:res/3.png"));
        stage.setResizable(false);
        stage.setTitle("Calculater");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
