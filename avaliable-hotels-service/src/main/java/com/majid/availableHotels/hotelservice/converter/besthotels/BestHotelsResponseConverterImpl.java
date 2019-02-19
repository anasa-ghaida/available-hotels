package com.majid.availableHotels.hotelservice.converter.besthotels;

import com.majid.availableHotels.hotelservice.bean.ProvidersResult;
import com.majid.availableHotels.hotelservice.bean.response.BestHotelsResponse;
import com.majid.availableHotels.hotelservice.bean.Converter;

public class BestHotelsResponseConverterImpl implements Converter<BestHotelsResponse, ProvidersResult> {

    public ProvidersResult convert(BestHotelsResponse bestHotelsResponse) {
        ProvidersResult result = new ProvidersResult();
        result.setProvider("BEST");
        result.setHotelName(bestHotelsResponse.getHotel());
        result.setFare(String.valueOf(bestHotelsResponse.getHotelFare()));
        result.setAmenities(bestHotelsResponse.getRoomAmenities());
        return result;
    }


}
