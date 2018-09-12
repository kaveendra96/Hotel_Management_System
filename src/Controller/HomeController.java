/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author nipun
 */
public class HomeController implements Initializable {

    @FXML
    private AnchorPane pane2;
    @FXML
    private AnchorPane pane3;
    @FXML
    private AnchorPane pane4;
    @FXML
    private AnchorPane pane1;
    @FXML
    private ImageView image;
    @FXML
    private AnchorPane opPane;
    @FXML
    private AnchorPane drawerPane;
    
    int mouseCounter=0;
    @FXML
    private AnchorPane paneLoder;
    @FXML
    private JFXButton paymentBtn;
    @FXML
    private JFXButton employeeBtn;
    @FXML
    private JFXButton CustomerRegisterBtn;
    @FXML
    private JFXButton roomBtn;
    @FXML
    private JFXButton bookingBtn;
    @FXML
    private JFXButton homeBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        opPane.setVisible(false);

        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(0.5),opPane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5),drawerPane);
        translateTransition.setByX(-600);
        translateTransition.play();



        pane1.setStyle("-fx-background-image:url(\"/Img/1.jpg\"); -fx-background-size:cover;");     
        pane2.setStyle("-fx-background-image:url(\"/Img/2.jpg\"); -fx-background-size:cover;");     
        pane3.setStyle("-fx-background-image:url(\"/Img/3.jpg\"); -fx-background-size:cover;");     
        pane4.setStyle("-fx-background-image:url(\"/Img/4.jpg\"); -fx-background-size:cover;");

        Animation();
      
            
            image.setOnMouseClicked(event -> {
              if(mouseCounter<=0){
            mouseCounter++;
            opPane.setVisible(true);

            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.5),opPane);
            fadeTransition1.setFromValue(0);
            fadeTransition1.setToValue(0.15);
            fadeTransition1.play();

            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.5),drawerPane);
            translateTransition1.setByX(+600);
            translateTransition1.play();
              }
        });
      

        opPane.setOnMouseClicked(event -> {


            mouseCounter=0;
            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.5),opPane);
            fadeTransition1.setFromValue(0.15);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 -> {
                opPane.setVisible(false);
            });


            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.5),drawerPane);
            translateTransition1.setByX(-600);
            translateTransition1.play();
        });

        
        
        
    }  
    
     public  void  Animation(){


        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(3),pane4);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        fadeTransition.setOnFinished(event -> {
            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(3),pane3);
            fadeTransition1.setFromValue(1);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 -> {

                FadeTransition fadeTransition2=new FadeTransition(Duration.seconds(3),pane2);
                fadeTransition2.setFromValue(1);
                fadeTransition2.setToValue(0);
                fadeTransition2.play();

                fadeTransition2.setOnFinished(event2 -> {

                    FadeTransition fadeTransition00=new FadeTransition(Duration.seconds(3),pane2);
                    fadeTransition00.setFromValue(0);
                    fadeTransition00.setToValue(1);
                    fadeTransition00.play();


                    fadeTransition00.setOnFinished(event3 -> {
                        FadeTransition fadeTransition11=new FadeTransition(Duration.seconds(3),pane3);
                        fadeTransition11.setFromValue(0);
                        fadeTransition11.setToValue(1);
                        fadeTransition11.play();

                        fadeTransition11.setOnFinished(event4 -> {
                            FadeTransition fadeTransition22=new FadeTransition(Duration.seconds(3),pane4);
                            fadeTransition22.setFromValue(0);
                            fadeTransition22.setToValue(1);
                            fadeTransition22.play();

                            fadeTransition22.setOnFinished(event5 -> {
                                Animation();
                            });
                        });


                    });
                });

            });




        });



     }

    @FXML
    private void clickPayemnt(ActionEvent event) {
     
        
        
    }

    @FXML
    private void clickEmployee(ActionEvent event) {
    }

    @FXML
    private void clickCustomerRegistation(ActionEvent event) {
    }

    @FXML
    private void clickPayment(ActionEvent event) {
    }

    @FXML
    private void clickBooking(ActionEvent event) {
    }

    @FXML
    private void clickHome(ActionEvent event) {
    }

    
}
