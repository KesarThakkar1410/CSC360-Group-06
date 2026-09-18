package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

import java.util.Optional;

public class MainController {

    @FXML
    private TextArea notesArea;

    @FXML
    private Label statusLabel;

    private String lastSavedText = "";

    @FXML
    public void initialize() {
        String savedNotes = AppData.loadNotes();
        notesArea.setText(savedNotes);
        lastSavedText = savedNotes;
    }

    @FXML
    private void handleSave() {
        AppData.saveNotes(notesArea.getText());
        lastSavedText = notesArea.getText();
        statusLabel.setText("Saved!");
    }

    public void handleCloseRequest(WindowEvent event) {
        String currentText = notesArea.getText();
        if (!currentText.equals(lastSavedText)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Unsaved Changes");
            alert.setHeaderText("You have unsaved changes.");
            alert.setContentText("Are you sure you want to close without saving?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                // allow close
            } else {
                event.consume(); // cancel close
            }
        }
    }
}