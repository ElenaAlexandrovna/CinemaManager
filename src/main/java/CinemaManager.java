public class CinemaManager {
    private Cinema[] movies = new Cinema[0];
    private int limit;

    public CinemaManager(int limit) {
        this.limit = limit;

    }

    public void addCinema(Cinema movie) {
        Cinema[] tmp = new Cinema[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public Cinema[] findAll() {
        return movies;

    }

    public Cinema[] findLast() {
        int qtyMovies;
        if (movies.length < limit) {
            qtyMovies = movies.length;
        } else {
            qtyMovies = limit;
        }

        Cinema[] tmp = new Cinema[qtyMovies];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;


    }
}
