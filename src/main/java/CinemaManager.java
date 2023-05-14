public class CinemaManager {
    private String[] movies = new String[0];
    private int limit;

    public CinemaManager() {
        this.limit = limit;

    }

    public void addCinema(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int qtyMovies;
        if (movies.length < limit) {
            qtyMovies = movies.length;
        } else {
            qtyMovies = limit;
        }
        String[] tmp = new String[qtyMovies];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;


    }
}
