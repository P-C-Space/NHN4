package com.nhnacademy.libraryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LibraryTest {

    @Test
    @DisplayName("preCondition Test")
    void preConditionTest() {
        // Junit을 쓰기 전 코드
//        try{
//            new Library(-1);
//        }catch(IllegalArgumentException exception){
//            System.out.println(exception.getMessage());
//        }

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Library(-1));
    }

    @ParameterizedTest
    @DisplayName("Library constructor Test")
    @ValueSource(ints = {1, 10, 1000})
    void libraryTest(int size) {
        Library library = new Library((size));

        Assertions.assertEquals(size, library.getSize());
    }

    @Test
    @DisplayName("Library add() Test")
    void addTest() {
        Library library = new Library(1);
        library.add("book 1");

        Assertions.assertEquals(1, library.getBookCount());
    }

    @Test
    @DisplayName("Library 꽉 찬 경우 테스트")
    void fulllibraryTest() {
        Library library = new Library(1);
        library.add("Book 1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book 2"));
    }

    @Test
    @DisplayName("Library 중복 된 경우 테스트")
    void dupLibrary() {
        Library library = new Library(2);
        library.add("Book 1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("Book 1"));
    }

    @Test
    @DisplayName("Library empty 테스트")
    void emptyLibrary() {
        Library library = new Library(1);
        library.add("Book 1");
        library.delete("Book 1");

        Assertions.assertEquals(0, library.getBookCount());
    }

    @Test
    @DisplayName("Library delete Test1")
    void deleteLibrary() {
        Library library = new Library(2);
        library.add("Book 1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.delete("Book 2"));
    }

    @Test
    @DisplayName("Library delete Test2")
    void deleteLibrary2() {
        Library library = new Library(1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.delete("Book 1"));
    }
}
