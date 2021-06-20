package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private Movie movie1 = new Movie(1, "Movie1", "111", false);
    private Movie movie2 = new Movie(2, "Movie2", "222", false);
    private Movie movie3 = new Movie(3, "Movie3", "333", false);
    private Movie movie4 = new Movie(4, "Movie4", "444", false);
    private Movie movie5 = new Movie(5, "Movie5", "555", false);
    private Movie movie6 = new Movie(6, "Movie6", "666", false);
    private Movie movie7 = new Movie(6, "Movie7", "777", false);
    private Movie movie8 = new Movie(7, "Movie8", "888", false);
    private Movie movie9 = new Movie(9, "Movie9", "999", false);
    private Movie movie10 = new Movie(10, "Movie10", "100", false);
    private Movie movie11 = new Movie(11, "Movie11", "110", false);
    private Movie movie12 = new Movie(12, "Movie12", "120", false);

    @Test
    public void shouldAddWhenEmpty(){
        MovieManager manager = new MovieManager();

        manager.add(movie1);

        Movie[] expected = { movie1 };
        Movie[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetPosterWhenEmpty(){
        MovieManager manager = new MovieManager();

        Movie[] expected = new Movie[0];
        Movie[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSecondMovieWhenOneInside(){
        MovieManager manager = new MovieManager();
        manager.add(movie1);

        manager.add(movie2);

        Movie[] expected = { movie2, movie1 };
        Movie[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWhenMoreThenOneInside(){
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);

        manager.add(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = manager.getPoster();
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldGetTenWhenMoreInside(){
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Movie[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFiveWhenMoreInside(){
        MovieManager manager = new MovieManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7};
        Movie[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

}