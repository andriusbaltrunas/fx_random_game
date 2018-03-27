package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private TextField inputNumber;

    @FXML
    private Label answerLabel;

    public void tryMe (ActionEvent event){
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10) + 1;
        int guessNumber = Integer.valueOf(inputNumber.getText());
        if (rndNumber == guessNumber) {
            System.out.println("Jus atspejote, tai buvo " + guessNumber);
        }else {
            System.out.println("Spekite dar karta");
        }
    }
}
