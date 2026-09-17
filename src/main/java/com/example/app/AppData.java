package com.example.app;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppData {

    private static final String TIME_FILE = "appdata.txt";
    private static final String NOTES_FILE = "notes.txt";

    public static String loadLastOpened() {
        try {
            if (Files.exists(Paths.get(TIME_FILE))) {
                return Files.readString(Paths.get(TIME_FILE));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "First time opening the app!";
    }

    public static void saveCurrentTime() {
        try {
            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a"));
            Files.writeString(Paths.get(TIME_FILE), now);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadNotes() {
        try {
            if (Files.exists(Paths.get(NOTES_FILE))) {
                return Files.readString(Paths.get(NOTES_FILE));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void saveNotes(String text) {
        try {
            Files.writeString(Paths.get(NOTES_FILE), text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}