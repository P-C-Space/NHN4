package com.nhnacademy.app;

import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class Movie {
    private final long movieId;
    private final String title;
    private final Set<String> genres;

    public long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public Movie(long movieId, String title, Set<String> genres) {
        if(movieId <= 0){
            throw new IllegalArgumentException("0이하의 수는 Id가 될 수 없습니다.");
        }
        if(StringUtils.isEmpty(title)){
            throw new IllegalArgumentException("빈 문자열은 제목이 될 수 없습니다.");
        }
        if(genres.isEmpty()){
            throw new IllegalArgumentException("장르가 비어있습니다.");
        }
        this.movieId = movieId;
        this.title = title;
        this.genres = genres;
    }
}
