package com.project.web.helper;

import org.junit.Test;
import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class FileHelperTest {
    @Test
    public void getQuestions() throws Exception {
        List<String> list = FileHelper.getQuestions("/questions.txt");

        assertNotNull(list);
    }

}