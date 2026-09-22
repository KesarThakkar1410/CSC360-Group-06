package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class SplashController {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label lastOpenedLabel;

    @FXML
    private Label statusLabel;

    public void setProgress(double value) {
        progressBar.setProgress(value);
    }

    public void setLastOpenedText(String text) {
        lastOpenedLabel.setText(text);
    }

    public void setStatusText(String text) {
        statusLabel.setText(text);
    }

    @FXML
    private void handleSkip() {
        javafx.application.Platform.exit();
    }
}