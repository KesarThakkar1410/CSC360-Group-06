package com.example.app;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppData {

    private static final String FILE_PATH = "appdata.txt";

    public static String loadLastOpened() {
        try {
            if (Files.exists(Paths.get(FILE_PATH))) {
                return Files.readString(Paths.get(FILE_PATH));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "First time opening the app!";
    }

    public static void saveCurrentTime() {
        try {
            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a"));
            Files.writeString(Paths.get(FILE_PATH), now);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}