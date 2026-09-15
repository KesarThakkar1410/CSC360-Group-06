# CSC360-Group-06

JavaFX Custom Splash Screen

A simple and attractive JavaFX custom splash screen created using FXML. The splash screen displays a custom logo along with the application version and applicant details. A fade animation is added to the logo to make the splash screen more visually appealing.

Features
Custom splash screen using JavaFX
UI designed using FXML
Custom logo/image
Applicant name and applicant ID display
Application version display
Fade animation on the logo
Clean and simple user interface
Maven-based JavaFX project
Technologies Used
Java
JavaFX
FXML
Maven
IntelliJ IDEA
Project Structure
JavaFXSplashScreenProject
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.javafxsplashscreenproject
│       │       ├── HelloApplication.java
│       │       ├── HelloController.java
│       │       └── Launcher.java
│       │
│       └── resources
│           ├── Images
│           │   └── Logo.png
│           │
│           └── com.example.javafxsplashscreenproject
│               └── hello-view.fxml
│
├── pom.xml
└── README.md
How It Works
Launcher.java starts the JavaFX application.
HelloApplication.java loads the FXML file and creates the application window.
hello-view.fxml defines the layout of the splash screen.
HelloController.java loads the custom logo and applies a fade animation.
The splash screen displays:
Custom Logo
Version 1.0
Applicant Name
Applicant ID
Splash Screen

The splash screen provides a simple introduction before the application starts. The custom logo uses a fade-in and fade-out animation to give the screen a more attractive appearance.

How to Run
Using IntelliJ IDEA
Open the project in IntelliJ IDEA.
Make sure Maven dependencies are loaded.
Open Launcher.java.
Click the Run ▶ button.
The JavaFX splash screen will appear.
