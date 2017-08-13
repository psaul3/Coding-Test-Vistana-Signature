package com.project.web.helper;

import org.springframework.core.io.FileSystemResource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHelper {

    private static FileSystemResource fileName;

    /**
     * @param filePath
     * @return file contents as list for each line of text
     */
    public static List<String> getQuestions(String filePath) throws IOException {
        Class c = FileHelper.class;
        InputStream inputStream = c.getResourceAsStream(filePath);
        List<String> list = new ArrayList<>();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        return list;
    }

}
