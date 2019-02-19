package com.majid.availableHotels.hotelservice.usecase;

import com.majid.availableHotels.hotelservice.bean.ProviderCaller;
import com.majid.availableHotels.hotelservice.bean.ProvidersResult;
import com.majid.availableHotels.hotelservice.bean.Usecase;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.ResponseHotel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class AvailableHotelsUsecase implements Usecase<RequestHotel, ResponseHotel> {

    List<ProviderCaller<RequestHotel, ProvidersResult>> list;

    public AvailableHotelsUsecase(List<ProviderCaller<RequestHotel, ProvidersResult>> list) {
        this.list = list;
    }

    public ResponseHotel process(RequestHotel requestHotel) {
        ResponseHotel responseHotel = new ResponseHotel();
        ArrayList<ProvidersResult> results = new ArrayList<>();
        list.forEach(requestHotelProvidersResultProviderCaller -> results.add(requestHotelProvidersResultProviderCaller.callProvider(requestHotel)));
        responseHotel.setResults(results);
        return responseHotel;
    }

}
