package com.majid.availableHotels.hotelservice.bean.response;

public class CrazyHotelsResponse implements Respone {

	private String hotelName;
	private String rate;
	private String hotelFare;
	private String amenities;
	private double price;
	private double discount;

	public CrazyHotelsResponse() {
	}

	public CrazyHotelsResponse(String hotelName, String rate, String hotelFare, String amenities, double price,
			double discount) {
		this.hotelName = hotelName;
		this.rate = rate;
		this.hotelFare = hotelFare;
		this.amenities = amenities;
		this.price = price;
		this.discount = discount;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
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
