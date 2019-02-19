package com.majid.availableHotels.hotelservice.repository;

import com.majid.availableHotels.hotelservice.bean.dto.BestHotle;
import com.majid.availableHotels.hotelservice.bean.dto.CrazyHotel;
import com.majid.availableHotels.hotelservice.bean.response.CrazyHotelsResponse;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class CrazyHotelRepository {
    public CrazyHotel findCrazyHotelsByFromDateAndToDateAndCityAndnumberOfAdults
            (LocalDate fromDate, LocalDate toDate, String city, int numberOfAdults) {
        CrazyHotel crazyHotel =new CrazyHotel();
        crazyHotel.setName("Amman Hotel");
        crazyHotel.setRate("Excellent");
        crazyHotel.setHotelFare("100$");
        crazyHotel.setAmenities(new ArrayList<String>(
                Arrays.asList("12", "13", "14")));
        crazyHotel.setDiscount(0.2);
        crazyHotel.setPrice(100);
        return crazyHotel;
    }
}
