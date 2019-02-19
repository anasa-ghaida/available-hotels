package com.majid.availableHotels.hotelservice.bean.request;

import java.time.LocalDate;

public class RequestHotel implements Request {
    private String city;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int numberOfAdults;

    public RequestHotel() {
    }

    public RequestHotel(LocalDate fromDate, LocalDate toDate, String city, int numberOfAdults) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.city = city;
        this.numberOfAdults = numberOfAdults;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    @Override
    public String toString() {
        return "RequestHotel [fromDate=" + fromDate + ", toDate=" + toDate + ", city=" + city + ", numberOfAdults="
                + numberOfAdults + "]";
    }

}
