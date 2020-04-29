package com.models.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public List<String> readFile(String filename) {
        String path = "C:\\Users\\oscarivan.diaz\\eclipse-workspace\\GlobantUniversity\\src\\com\\resources\\";
        List<String> lines = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path + "" + filename));
            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

}
