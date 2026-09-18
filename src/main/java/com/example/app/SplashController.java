package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class SplashController {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label lastOpenedLabel;

    private Runnable skipAction;

    public void setProgress(double value) {
        progressBar.setProgress(value);
    }

    public void setLastOpenedText(String text) {
        lastOpenedLabel.setText(text);
    }

    public void setSkipAction(Runnable action) {
        this.skipAction = action;
    }

    @FXML
    private void handleSkip() {
        if (skipAction != null) {
            skipAction.run();
        }
    }
}