package com.majid.availableHotels.hotelservice.usecase;

import com.majid.availableHotels.hotelservice.bean.ProviderCaller;
import com.majid.availableHotels.hotelservice.repository.BestHotelRepository;
import com.majid.availableHotels.hotelservice.bean.Usecase;
import com.majid.availableHotels.hotelservice.bean.dto.BestHotle;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.BestHotelsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BestHotelUsecase implements Usecase<RequestHotel, BestHotelsResponse> {
    @Autowired
    private BestHotelRepository bestHotelRepository;


    public BestHotelsResponse process(RequestHotel requestHotel) {
        BestHotle result = bestHotelRepository.findBestHotelsByFromDateAndToDateAndCityAndnumberOfAdults
                (requestHotel.getFromDate(), requestHotel.getToDate(),
                        requestHotel.getCity(), requestHotel.getNumberOfAdults());
        return prepareResponse(result);

    }

    private BestHotelsResponse prepareResponse(BestHotle result) {
        BestHotelsResponse response = new BestHotelsResponse();
        response.setHotel(result.getName());
        response.setHotelFare(result.getFare());
        response.setHotelRate(result.getRate());
        response.setRoomAmenities(result.getRoomAmenities().toString());
        return response;
    }


}
