package main;

public class Movie {
    private int movieCode;
    private String movieTitle;
    private String movieTheme;
    private String runTime;
    private String poster;

    public int getMovieCode() {
        return movieCode;
    }

    public void setMovieCode(int movieCode) {
        this.movieCode = movieCode;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTheme() {
        return movieTheme;
    }

    public void setMovieTheme(String movieTheme) {
        this.movieTheme = movieTheme;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
    
}
