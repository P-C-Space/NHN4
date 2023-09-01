package com.nhnacademy.app;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasicMovieParserTest {

    @Test
    @DisplayName("Basic CSVParser 생성 Test")
    void BasicCSVParserConstutorTest() throws IOException {
        BasicMovieParser basicMovieParser = new BasicMovieParser();
        List<Movie> movieList = basicMovieParser.parse("./movies.csv");
        Assertions.assertEquals(9742,movieList.size());
    }

    @Test
    @DisplayName("Basic CSVParser 경로 테스트")
    void BasiceCsvParserTest(){
        BasicMovieParser basicMovieParser = new BasicMovieParser();

        Assertions.assertThrows(FileNotFoundException.class, () -> basicMovieParser.parse(""));
    }

    @Test
    @DisplayName("Basic CSVParser 경로 테스트2")
    void BasiceCsvParserTest2(){
        BasicMovieParser basicMovieParser = new BasicMovieParser();

        Assertions.assertThrows(IOException.class, () -> basicMovieParser.parse("./hello.csv"));
    }
}