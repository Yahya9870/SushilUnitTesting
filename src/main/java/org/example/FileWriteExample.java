package org.example;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new FileOutputStream("output.txt"));
        writer.println("Hello, World! the file has been generated");  // Writes to the file
        writer.close();  // Closes the file
    }
}

