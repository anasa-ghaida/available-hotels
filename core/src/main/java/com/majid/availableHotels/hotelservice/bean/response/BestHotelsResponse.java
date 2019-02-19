package com.majid.availableHotels.hotelservice.bean.response;

public class BestHotelsResponse implements Respone {

	private String hotel;
	private String roomAmenities;
	private double hotelRate;
	private double hotelFare;

	public BestHotelsResponse() {
	}

	public BestHotelsResponse(String hotel, String roomAmenities, double hotelRate, double hotelFare) {
		this.hotel = hotel;
		this.roomAmenities = roomAmenities;
		this.hotelRate = hotelRate;
		this.hotelFare = hotelFare;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getRoomAmenities() {
		return roomAmenities;
	}

	public void setRoomAmenities(String roomAmenities) {
		this.roomAmenities = roomAmenities;
	}

	public double getHotelRate() {
		return hotelRate;
	}

	public void setHotelRate(double hotelRate) {
		this.hotelRate = hotelRate;
	}

	public double getHotelFare() {
		return hotelFare;
	}

	public void setHotelFare(double hotelFare) {
		this.hotelFare = hotelFare;
	}

	@Override
	public String toString() {
		return "BestHotelsResponse [hotel=" + hotel + ", roomAmenities=" + roomAmenities + ", hotelRate=" + hotelRate
				+ ", hotelFare=" + hotelFare + "]";
	}
}
