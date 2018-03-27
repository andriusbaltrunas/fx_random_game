package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.InputMismatchException;
import java.util.Random;

public class Controller {
    @FXML
    private TextField inputNumber;

    @FXML
    private Label answerLabel;

    public void tryMe(ActionEvent event) {
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10) + 1;
        try {


            int guessNumber = Integer.valueOf(inputNumber.getText());
            inputNumber.setText("");
            if (rndNumber == guessNumber) {
                answerLabel.setText("Jusu spejimas buvo teisingas, generuotas skaicius:" + rndNumber + " Jusu spejimas buvo: " + guessNumber);


            } else {
                answerLabel.setText("Neatspejote, generuotas skaicius: " + rndNumber + " Jusu skaicius: " + guessNumber);

            }
        } catch (InputMismatchException e) {
        }
    }
}
