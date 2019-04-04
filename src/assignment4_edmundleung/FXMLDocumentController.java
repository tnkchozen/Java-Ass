package assignment4_edmundleung;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Label lb1;
    @FXML
    private Label lbNo;
    @FXML
    private TextField tfNo;
    @FXML
    private Button btnSearch;
    @FXML
    private Label lbName;
    @FXML
    private Label lbJob;
    @FXML
    private Label lbNotes;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfJob;
    @FXML
    private TextField tfNotes;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnShow;
    @FXML
    private Button btnSave;
    @FXML
    private ArrayList<Member> memberList;
    @FXML
    private boolean inEditing;
    @FXML
    private int indexOnEditing;
    @FXML
    private String fileName;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        memberList = new ArrayList<>();
        inEditing = false;
        indexOnEditing = 0;
        fileName = "example.txt";
        lb1.setText("We have " + memberList.size() + " members now.");
    }

    @FXML
    private void handleBtnSearch(ActionEvent event) {
        try {
            tfName.setText("");
            tfJob.setText("");
            tfNotes.setText("");
            int id = Integer.parseInt(tfNo.getText());
            if (memberList.isEmpty()) {
                lb1.setText("The list is empty.");
            } else if (id < 0 || id > memberList.size()) {
                lb1.setText("The number is out of range");
            } else if (id != (int)id) {
                lb1.setText("The number is invalid.");
            } 
            for (Member i : memberList) {
                if (id == (memberList.indexOf(i))) {  
                    tfName.setText(memberList.get(id).getName());
                    tfJob.setText(memberList.get(id).getJob());
                    tfNotes.setText(memberList.get(id).getNotes());
                    lb1.setText("Information for " + memberList.get(id).getName());
                    inEditing = true;
                    indexOnEditing = id;
                }
            }
        } catch (Exception e) {
            lb1.setText("Please enter a valid index number.");
        }
    }

    @FXML
    private void handleTfName(ActionEvent event) {
    }

    @FXML
    private void handleTfJob(ActionEvent event) {
    }

    @FXML
    private void handleTfNotes(ActionEvent event) {
    }

    @FXML
    private void handleBtnClear(ActionEvent event) {
        inEditing = false;
        tfNo.setText("");
        tfName.setText("");
        tfJob.setText("");
        tfNotes.setText("");
        lb1.setText("Add a new member to the crew.");
    }

    @FXML
    private void handleBtnAdd(ActionEvent event) {
        lb1.setText("We have " + memberList.size() + " members now.");
        if (tfName.getText().isEmpty() || tfJob.getText().isEmpty()
                || tfNotes.getText().isEmpty()) {
            lb1.setText("All the three fields are required.");
        } else {
            Member newMember = new Member(tfName.getText(), tfJob.getText(), tfNotes.getText());
            if (inEditing == true) {
                newMember = new Member(tfName.getText(), tfJob.getText(), tfNotes.getText()); 
                memberList.set(indexOnEditing, newMember);
            }
            else if (inEditing == false) {
                memberList.add(newMember);
            } 
            inEditing = false;
            tfNo.setText("");
            tfName.setText("");
            tfJob.setText("");
            tfNotes.setText("");
            lb1.setText("We have " + memberList.size() + " members now.");
        }
    }

    @FXML
    private void handleBtnShow(ActionEvent event) {
        inEditing = false;
        tfNo.setText("");
        tfName.setText("");
        tfJob.setText("");
        tfNotes.setText("");
        lb1.setText("Add a new member to the crew.");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Crew Members");
        alert.setHeaderText("This is the full list");
        StringBuilder builder = new StringBuilder();
        for (Member i : memberList) {
            builder.append(i + " ");
        }
        String text = builder.toString();
        alert.setContentText(text);  
        alert.showAndWait();
    }

    @FXML
    private void handleBtnSave(ActionEvent event) {
        
    }

}
