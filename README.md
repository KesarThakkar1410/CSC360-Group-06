## CSC360 Group 6

## Write a Java FX program with a custom splash screen using FXML.

## Project overview

Overview

This project demonstrates how to implement a splash screen in a JavaFX application using FXML. A splash screen is the loading window that appears briefly when an application starts, before the main interface becomes visible. It is commonly used to improve user experience by showing progress or branding while the application loads necessary resources in the background.

In this project, the splash screen's visual layout is defined using FXML, which allows the interface design to be kept separate from the application's logic. This follows good coding practice by separating the UI (what the user sees) from the controller (how the app behaves). The FXML file defines elements such as images, text, or progress indicators shown on the splash screen, while a corresponding controller class manages the behavior, such as how long the splash screen is displayed and when the transition to the main application window occurs.

Once the splash screen finishes displaying, the application automatically switches to the main window, allowing the user to begin using the app. This structure makes it easy to customize the splash screen's design or duration without changing the core application logic.

This project can serve as a helpful reference or starting template for developers who want to add a splash screen feature to their own JavaFX applications, especially those learning how to combine FXML based UI design with JavaFX's application lifecycle.
