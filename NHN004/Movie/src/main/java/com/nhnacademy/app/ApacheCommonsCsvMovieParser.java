package com.nhnacademy.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

public class ApacheCommonsCsvMovieParser implements MovieParser {
    @Override
    public List<Movie> parse(String fileName) throws IOException{

        if (StringUtils.isEmpty(fileName)) {
            throw new FileNotFoundException("파일 경로가 존재하지 않습니다.");
        }


        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader("movieId","title","genres")
                .setSkipHeaderRecord(true)
                .build();

        //FileReader csvData = new FileReader(fileName);
        FileReader csvData = new FileReader(fileName, StandardCharsets.UTF_8);

        if(csvData.read() == -1){
            throw new IOException("잘못된 경로입니다.");
        }
        CSVParser parser = CSVParser.parse(csvData,csvFormat);

        List<Movie> movies = new ArrayList<>();


        // Iterable<CSVRecord> recodes = csvFormat.parse(csvData);

        for (CSVRecord csvRecord : parser) {
            String gernes = csvRecord.get(2);
            String[] gernesArray = gernes.split("\\|");
            Set<String> gernesSet = new HashSet<>(Arrays.asList(gernesArray));
            movies.add(new Movie(Long.valueOf(csvRecord.get(0)),csvRecord.get(1),gernesSet));
        }
        return movies;
    }


}
