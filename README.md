# CSC360 Group 6 (Splash Screen Project)

**Project Assigned:** Write a Java FX program with a custom splash screen using FXML.

*(A splash screen is a loading window that briefly appears when an application starts, before the main interface is shown.)*

**Group Members**: Eti Brihaspati Patel
                   Sonam Dwivedi
                   Hemangi Makwana
                   Kesar Thakkar

## Project overview

A JavaFX application demonstrating a splash screen built using FXML. The splash screen shows a logo, real time loading status, and the last time the app was opened, before switching to the main application window. The main screen lets users write and save notes, with unsaved changes protection on exit.

### Splash Screen Preview
<img width="396" height="376" alt="splashscreen" src="https://github.com/user-attachments/assets/bf168fa3-ed2a-4e09-9e78-de003dc6a156" />

### Main Screen Preview 
<img width="594" height="418" alt="mainscreen" src="https://github.com/user-attachments/assets/673aba1d-7dac-41ab-8a06-b4bffe9b2c7b" />

## Features
1. Splash screen made using FXML, separate from the app's logic
2. Shows the logo, app name, version, and greeting on the splash screen
3. Progress bar that shows loading messages like "Loading saved notes..."
4. Shows the last time the app was opened
5. Close button to exit the app while it's still loading
6. Main screen has a text box to write notes
7. Notes are saved and shown again next time you open the app
8. Warns you if you try to close the app without saving your notes
