package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private int numOfMoviesToShow = 10;
    private Movie[] movies = new Movie[0];

    public MovieManager() {
    }

    public MovieManager(int numOfMoviesToShow) {
        this.numOfMoviesToShow = numOfMoviesToShow;
    }

    public void add(Movie item) {
        // создаём новый массив размером на единицу больше
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;

    }

    public Movie[] getAll() {
        Movie[] result = new Movie[movies.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Movie[] getMovies() {
        int numToShow = Math.min(movies.length, numOfMoviesToShow);
        Movie[] result = new Movie[numToShow];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = numToShow - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}
