package main;

public class Screening {
    private int screeningCode;
    private int movieCode;
    private String screeningDate;
    private String screeningTime;
    
    private String childCount;
    private String adultCount;
    private int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getChildCount() {
        return childCount;
    }

    public void setChildCount(String childCount) {
        this.childCount = childCount;
    }

    public String getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(String adultCount) {
        this.adultCount = adultCount;
    }

    public int getScreeningCode() {
        return screeningCode;
    }

    public void setScreeningCode(int screeningCode) {
        this.screeningCode = screeningCode;
    }

    public int getMovieCode() {
        return movieCode;
    }

    public void setMovieCode(int movieCode) {
        this.movieCode = movieCode;
    }

    public String getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(String screeningDate) {
        this.screeningDate = screeningDate;
    }

    public String getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(String screeningTime) {
        this.screeningTime = screeningTime;
    }
    
    
}
