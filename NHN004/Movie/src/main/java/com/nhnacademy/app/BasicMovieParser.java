package com.nhnacademy.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class BasicMovieParser implements MovieParser {

    @Override
    public List<Movie> parse(String fileName) throws IOException {

        if (StringUtils.isEmpty(fileName)) {
            throw new FileNotFoundException("파일 경로가 존재하지 않습니다.");
        }


        BufferedReader br;
        File csv = new File(fileName);
        if(!csv.isFile()){
            throw new IOException("잘못된 경로입니다.");
        }

        String line = "";
        List<Movie> movies = new ArrayList<>();

        br = new BufferedReader(new FileReader(csv));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] lineArr = line.split(",");

            String[] genrs = lineArr[2].split("\\|");
            Set<String> genrsSet = new HashSet<>(Arrays.asList(genrs));

            movies.add(new Movie(Long.valueOf(lineArr[0]), lineArr[1], genrsSet));
        }
        br.close();

        return movies;
    }

}