package com.nhnacademy.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MovieTest {
    static Stream<Arguments> MovieValue() {
        return Stream.of(
                Arguments.of(1L, "오펜하이머", new HashSet<>(Arrays.asList("History", "Thriller", "drama", "Mystery"))),
                Arguments.of(2L, "아이언맨", new HashSet<>(Arrays.asList("Thriller", "drama"))),
                Arguments.of(3L, "아이언맨2", new HashSet<>(Arrays.asList("Thriller", "drama"))),
                Arguments.of(4L, "아이언맨3", new HashSet<>(Arrays.asList("Thriller", "drama"))),
                Arguments.of(5L, "어벤져스:엔드게임", new HashSet<>(Arrays.asList("Thriller", "drama", "Mystery")))

        );
    }

    @ParameterizedTest
    @MethodSource("MovieValue")
    @DisplayName("Movie 객체 생성 Test")
    void movieConstructorTest(long id, String title, Set<String> genres) {

        Movie movie = new Movie(id, title, genres);
        Assertions.assertEquals(id, movie.getMovieId());
        Assertions.assertEquals(title, movie.getTitle());
        Assertions.assertEquals(genres, movie.getGenres());
    }

    @Test
    @DisplayName("Movie 객체 생성 Id 음수 테스트")
    void movieMinusIdTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Movie(-1L, "오펜하이머", new HashSet<>(Arrays.asList("History", "Thriller", "drama", "Mystery")))
        );
    }

    @Test
    @DisplayName("Movie 객체 생성 Id 음수 테스트")
    void movieNullTitleTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Movie(1L, "", new HashSet<>(Arrays.asList("History", "Thriller", "drama", "Mystery")))
        );
    }

    @Test
    @DisplayName("Movie 객체 생성 Id 음수 테스트")
    void movieNullSetTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Movie(1L, "오펜하이머", new HashSet<>())
        );
    }


}