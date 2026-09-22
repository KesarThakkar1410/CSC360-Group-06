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

        String lastOpened = AppData.loadLastOpened();
        splashController.setLastOpenedText("Last opened: " + lastOpened);
        AppData.saveCurrentTime();

        Stage splashStage = new Stage(StageStyle.UNDECORATED);
        splashStage.setScene(new Scene(splashRoot));
        splashStage.show();

        Task<Void> loadingTask = new Task<>() {
    @Override
    protected Void call() throws Exception {
        String[] steps = {
            "Checking last session...",
            "Loading saved notes...",
            "Preparing interface...",
            "Almost done..."
        };

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(600);
            double progress = i / 10.0;

            String currentStatus;
            if (i <= 3) currentStatus = steps[0];
            else if (i <= 6) currentStatus = steps[1];
            else if (i <= 9) currentStatus = steps[2];
            else currentStatus = steps[3];

            Platform.runLater(() -> {
                splashController.setProgress(progress);
                splashController.setStatusText(currentStatus);
            });
        }
        return null;
    }
};

        loadingTask.setOnSucceeded(event -> {
            try {
                FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
                Parent mainRoot = mainLoader.load();
                MainController mainController = mainLoader.getController();
                primaryStage.setOnCloseRequest(mainController::handleCloseRequest);

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