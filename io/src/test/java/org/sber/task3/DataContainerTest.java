package org.sber.task3;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class DataContainerTest {

    @Test
    void testWriteToFile() throws Exception {
        DataContainer dataContainer = new DataContainer(10, "Hello");

        dataContainer.createLogFolder();

        File logFolder = new File("log");
        assertTrue(logFolder.exists());

        File[] files = logFolder.listFiles();
        assertNotNull(files);
        assertTrue(files.length > 0);
    }
}