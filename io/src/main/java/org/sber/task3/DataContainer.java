package org.sber.task3;

import lombok.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataContainer {
    private int intValue;
    private String stringValue;

    public void writeToFile(String filePath) {
        // Task1
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(this.toString());
        } catch (IOException E) {
            E.printStackTrace();
        }
    }

    public void createLogFolder() {
        // Task2
        File logFolder = new File("log");
        if (!logFolder.exists()) {
            logFolder.mkdir();
        }

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fileName = dateTime.format(formatter) + ".txt";
        File logFile = new File(logFolder, fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
            // Task3
            writer.write("Method One execution:\n");
            writer.write("int value: " + intValue + "\n");
            writer.write("string value: " + stringValue + "\n");

            // Task4
            File[] files = logFolder.listFiles();
            if (files != null && files.length > 2) {
                for (int i = 2; i < files.length; i++) {
                    files[i].delete();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
