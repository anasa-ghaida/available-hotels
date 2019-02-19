package com.majid.availableHotels.hotelservice.bean.dto;

import java.util.List;

public class CrazyHotel {
    private String name;
    private String rate;
    private String hotelFare;
    private List<String> amenities;
    private double price;
    private double discount;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getHotelFare() {
        return hotelFare;
    }

    public void setHotelFare(String hotelFare) {
        this.hotelFare = hotelFare;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
