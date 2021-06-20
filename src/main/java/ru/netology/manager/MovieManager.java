package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numberOfMovies = 10;

    public MovieManager(){

    }

    public MovieManager (int numberOfMovies){
        this.numberOfMovies = numberOfMovies;
    }

    public void add(Movie movie){
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[length - 1] = movie;
        movies = tmp;
    }

    public Movie[] getPoster (){
        int posterLength;
        if (movies.length >= numberOfMovies){
            posterLength = numberOfMovies;
        }else {
            posterLength = movies.length;
        }
        Movie[] poster = new Movie[posterLength];
        for (int i = 0; i < posterLength; i++){
            poster[i] = movies[movies.length - 1 - i];
        }
        return poster;
    }

}
