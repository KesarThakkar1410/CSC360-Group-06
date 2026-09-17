package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private TextArea notesArea;

    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {
        String savedNotes = AppData.loadNotes();
        notesArea.setText(savedNotes);
    }

    @FXML
    private void handleSave() {
        AppData.saveNotes(notesArea.getText());
        statusLabel.setText("Saved!");
    }
}