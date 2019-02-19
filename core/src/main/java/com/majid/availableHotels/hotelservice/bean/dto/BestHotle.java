package com.majid.availableHotels.hotelservice.bean.dto;

import java.util.List;

public class BestHotle {
    private String name;
    private double fare;
    private double rate;
    private List<String> roomAmenities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public List<String> getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities(List<String> roomAmenities) {
        this.roomAmenities = roomAmenities;
    }
}