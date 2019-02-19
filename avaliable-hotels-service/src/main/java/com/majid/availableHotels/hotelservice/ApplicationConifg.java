package com.majid.availableHotels.hotelservice;

import com.majid.availableHotels.hotelservice.bean.ProviderCaller;
import com.majid.availableHotels.hotelservice.bean.ProvidersResult;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.providercaller.BestHotelProviderCaller;
import com.majid.availableHotels.hotelservice.providercaller.CrazyHotelProviderCaller;
import com.majid.availableHotels.hotelservice.usecase.AvailableHotelsUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConifg {
    @Bean
    public AvailableHotelsUsecase availableHotelsUsecase() {
        ArrayList<ProviderCaller<RequestHotel, ProvidersResult>> list = new ArrayList<>();
        list.add(new BestHotelProviderCaller());
        list.add(new CrazyHotelProviderCaller());
        return new AvailableHotelsUsecase(list);
    }
}
