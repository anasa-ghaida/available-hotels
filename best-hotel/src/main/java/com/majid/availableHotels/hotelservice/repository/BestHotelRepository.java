package com.majid.availableHotels.hotelservice.repository;

import com.majid.availableHotels.hotelservice.bean.dto.BestHotle;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class BestHotelRepository {

    public BestHotle findBestHotelsByFromDateAndToDateAndCityAndnumberOfAdults(
            LocalDate fromDate, LocalDate toDate, String city, int numberOfAdults) {
        BestHotle bestHotle =new BestHotle();
        bestHotle.setName("Amman Hotel");
        bestHotle.setRate(5);
        bestHotle.setFare(100);
        bestHotle.setRoomAmenities(new ArrayList<String>(
                Arrays.asList("12", "13", "14")));
        return bestHotle;
    }
}
