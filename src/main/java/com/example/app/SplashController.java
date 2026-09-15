package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;

public class SplashController {

    @FXML
    private ProgressBar progressBar;

    public void setProgress(double value) {
        progressBar.setProgress(value);
    }
}