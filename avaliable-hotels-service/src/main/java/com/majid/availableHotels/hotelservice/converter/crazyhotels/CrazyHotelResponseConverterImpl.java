package com.majid.availableHotels.hotelservice.converter.crazyhotels;

import com.majid.availableHotels.hotelservice.bean.ProvidersResult;
import com.majid.availableHotels.hotelservice.bean.response.CrazyHotelsResponse;
import com.majid.availableHotels.hotelservice.bean.Converter;

public class CrazyHotelResponseConverterImpl implements Converter<CrazyHotelsResponse, ProvidersResult> {

    public ProvidersResult convert(CrazyHotelsResponse crazyHotelsResponse) {
        ProvidersResult response = new ProvidersResult();
        response.setAmenities(crazyHotelsResponse.getAmenities());
        response.setFare(crazyHotelsResponse.getHotelFare());
        response.setHotelName(crazyHotelsResponse.getHotelName());
        response.setProvider("CRAZY");
        return response;
    }
}
