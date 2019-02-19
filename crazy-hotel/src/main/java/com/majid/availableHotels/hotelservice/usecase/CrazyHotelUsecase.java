package com.majid.availableHotels.hotelservice.usecase;


import com.majid.availableHotels.hotelservice.bean.ProviderCaller;
import com.majid.availableHotels.hotelservice.bean.Usecase;
import com.majid.availableHotels.hotelservice.bean.dto.CrazyHotel;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.CrazyHotelsResponse;
import com.majid.availableHotels.hotelservice.repository.CrazyHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CrazyHotelUsecase implements Usecase<RequestHotel, CrazyHotelsResponse> {

    @Autowired
    private CrazyHotelRepository crazyHotelRepository;

    public CrazyHotelsResponse process(RequestHotel requestHotel) {
       CrazyHotel crazyHotel= crazyHotelRepository.findCrazyHotelsByFromDateAndToDateAndCityAndnumberOfAdults
                (requestHotel.getFromDate(), requestHotel.getToDate(),
                requestHotel.getCity(), requestHotel.getNumberOfAdults());
        return prepareResponse(crazyHotel);
    }
    private CrazyHotelsResponse prepareResponse(CrazyHotel result) {
        CrazyHotelsResponse response = new CrazyHotelsResponse();
        response.setHotelName(result.getName());
        response.setHotelFare(result.getRate());
        response.setRate(result.getRate());
        response.setAmenities(result.getAmenities().toString());
        response.setDiscount(result.getDiscount());
        response.setPrice(result.getPrice());
        return response;
    }

}
