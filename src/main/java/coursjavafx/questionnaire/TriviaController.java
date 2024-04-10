package coursjavafx.questionnaire;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TriviaController implements Initializable {
    @FXML
    private Label question;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button next;
    String[][] listeQuestions = {{"2+2=?", "4", "2", "6", "3"}, {"5*6=?", "30", "26", "24", "32"}, {"6/3=?", "2", "3", "1", "6"}};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        double randNum = Math.floor(Math.random()*4);
        question.setText(listeQuestions[0][0]);
        button1.setText(listeQuestions[0][1]);
        button1.getStyleClass("Good");
        button2.setText(listeQuestions[0][2]);
        button3.setText(listeQuestions[0][3]);
        button4.setText(listeQuestions[0][4]);
        next.setText("Continue");
        }
    }

    @FXML
    protected void onClickCompareAnswer(ActionEvent event) {
        String answer = ((Button) event.getSource()).getText();
        String goodAnswer = 
        if ()
    }


}
