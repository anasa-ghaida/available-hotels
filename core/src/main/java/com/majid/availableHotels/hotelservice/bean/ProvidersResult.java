package com.majid.availableHotels.hotelservice.bean;

public class ProvidersResult {

    private String provider;
    private String hotelName;
    private String fare;
    private String amenities;

    public ProvidersResult() {
    }

    public ProvidersResult(String provider, String hotelName, String fare, String amenities) {
        this.provider = provider;
        this.hotelName = hotelName;
        this.fare = fare;
        this.amenities = amenities;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "ResponseHotel [provider=" + provider + ", hotelName=" + hotelName + ", fare=" + fare + ", amenities="
                + amenities + "]";
    }

}