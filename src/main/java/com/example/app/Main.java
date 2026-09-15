package com.example.app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader splashLoader = new FXMLLoader(getClass().getResource("Splash.fxml"));
        Parent splashRoot = splashLoader.load();
        SplashController splashController = splashLoader.getController();

        Stage splashStage = new Stage(StageStyle.UNDECORATED);
        splashStage.setScene(new Scene(splashRoot));
        splashStage.show();

        Task<Void> loadingTask = new Task<>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 1; i <= 10; i++) {
                    Thread.sleep(600);
                    double progress = i / 10.0;
                    Platform.runLater(() -> splashController.setProgress(progress));
                }
                return null;
            }
        };

        loadingTask.setOnSucceeded(event -> {
            try {
                FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
                Parent mainRoot = mainLoader.load();

                primaryStage.setScene(new Scene(mainRoot));
                primaryStage.setTitle("My Application");
                primaryStage.show();

                splashStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        new Thread(loadingTask).start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}