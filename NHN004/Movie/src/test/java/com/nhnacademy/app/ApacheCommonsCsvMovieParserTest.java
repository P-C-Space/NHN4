package com.nhnacademy.app;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ApacheCommonsCsvMovieParserTest {

    @Test
    @DisplayName("Apache CSVParser 생성 Test")
    void BasicCSVParserConstutorTest() throws IOException {
        ApacheCommonsCsvMovieParser apacheCommonsCsvMovieParser = new ApacheCommonsCsvMovieParser();
        List<Movie> movieList = apacheCommonsCsvMovieParser.parse("./movies.csv");
        Assertions.assertEquals(9742,movieList.size());
    }
    @Test
    @DisplayName("ApacheCsvParser 경로 테스트")
    void ApacheCsvParserTest(){
        ApacheCommonsCsvMovieParser apacheCommonsCsvMovieParser = new ApacheCommonsCsvMovieParser();
        Assertions.assertThrows(FileNotFoundException.class, () -> apacheCommonsCsvMovieParser.parse(""));
    }

    @Test
    @DisplayName("ApacheCsvParser 경로 테스트2")
    void ApacheCsvParserTest2(){
        ApacheCommonsCsvMovieParser apacheCommonsCsvMovieParser = new ApacheCommonsCsvMovieParser();
        Assertions.assertThrows(IOException.class, () -> apacheCommonsCsvMovieParser.parse("./Hello.csv"));
    }
}