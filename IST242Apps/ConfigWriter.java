package com.IST242Apps;

import java.io.*;

public class ConfigWriter {
    String newLine = System.getProperty("line.separator");
    public ConfigWriter () {
        //Writes configuration data to a file named Config.txt
        try {
            File file = new File("Config.txt");
            FileOutputStream fileStream = new FileOutputStream(file);
            write(fileStream, "username=Tyller");
            write(fileStream, "score=12550");
            write(fileStream, "level=5");
            fileStream.close();
        } catch (IOException ioe) {
            System.out.println("Could not write file");
        }
    }
    //This method used to write a string to a file. Making sure the format of the string is proper
    void write(FileOutputStream stream, String output) throws IOException {
        output = output + newLine;
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);
    } 
    public static void main(String[] args) {
        ConfigWriter cw = new ConfigWriter();
    }
}
