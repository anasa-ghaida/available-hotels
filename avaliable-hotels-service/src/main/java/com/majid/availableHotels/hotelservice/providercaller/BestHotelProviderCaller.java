package com.majid.availableHotels.hotelservice.providercaller;

import com.majid.availableHotels.hotelservice.bean.ProviderCaller;
import com.majid.availableHotels.hotelservice.bean.ProvidersResult;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.BestHotelsResponse;
import com.majid.availableHotels.hotelservice.converter.besthotels.BestHotelsResponseConverterImpl;
import org.springframework.web.client.RestTemplate;

public class BestHotelProviderCaller implements ProviderCaller<RequestHotel, ProvidersResult> {
    final String uri = "http://localhost:8082/BestHotel?";

    @Override
    public ProvidersResult callProvider(RequestHotel request) {
        RestTemplate restTemplate = new RestTemplate();
        BestHotelsResponse restResponse = restTemplate.getForObject(prepareUrl(request), BestHotelsResponse.class);
        BestHotelsResponseConverterImpl bestHotelsResponseConverter = new BestHotelsResponseConverterImpl();
        return bestHotelsResponseConverter.convert(restResponse);
    }

    private String prepareUrl(RequestHotel request) {
        return uri + prepareParams(request);
    }

    private String prepareParams(RequestHotel request) {
        return String.format("fromDate=%s&toDate=%s&city=%s&numberOfAdults=%s", request.getFromDate(),
                request.getToDate(), request.getCity(), request.getNumberOfAdults());
    }
}
