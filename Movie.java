public class Movie {
    private int movieId;
    private String movieName;
    private double movieRating;

    // Parameterized constructor
    public Movie(int movieId, String movieName, double movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    // Getter and Setter for movieId
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    // Getter and Setter for movieName
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Getter and Setter for movieRating
    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }
}
