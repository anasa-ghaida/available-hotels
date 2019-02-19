package com.majid.availableHotels.hotelservice.providercaller;

import com.majid.availableHotels.hotelservice.bean.ProviderCaller;
import com.majid.availableHotels.hotelservice.bean.ProvidersResult;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.CrazyHotelsResponse;
import com.majid.availableHotels.hotelservice.converter.crazyhotels.CrazyHotelResponseConverterImpl;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class CrazyHotelProviderCaller implements ProviderCaller<RequestHotel, ProvidersResult> {
    final String uri = "http://localhost:8081/Crazyhotel";

    @Override
    public ProvidersResult callProvider(RequestHotel request) {
        RestTemplate restTemplate = new RestTemplate();
        CrazyHotelsResponse forObject = restTemplate.getForObject(prepareUrl(request), CrazyHotelsResponse.class);
        return new CrazyHotelResponseConverterImpl().convert(forObject);
    }

    private String prepareUrl(RequestHotel request) {
        return uri + prepareParams(request);
    }

    private String prepareParams(RequestHotel request) {
        return String.format("fromDate=%s&toDate=%s&city=%s&numberOfAdults=%s", request.getFromDate(),
                request.getToDate(), request.getCity(), request.getNumberOfAdults());
    }
}
