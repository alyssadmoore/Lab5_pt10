package com.AlyssaMoore;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Creating file in data directory (within project directory)
        File testFile = new File("C:/Users/Alyssa/IdeaProjects/Lab 5 pt 10/data/test.txt");

        // Writing string "Data" to file, then closing it
        try {BufferedWriter bufWriter = new BufferedWriter(new FileWriter (testFile));
        bufWriter.write("Data");
        bufWriter.close();}

        // Catching IOException
        catch (IOException ioe) {
            System.out.println("Sorry, there was an error with the file.");
        }
    }
}