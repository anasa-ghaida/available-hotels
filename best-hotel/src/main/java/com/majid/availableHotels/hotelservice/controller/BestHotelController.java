package com.majid.availableHotels.hotelservice.controller;


import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.BestHotelsResponse;
import com.majid.availableHotels.hotelservice.usecase.BestHotelUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
public class BestHotelController {
    @Autowired
    private BestHotelUsecase bestHotelUsecase;

    @GetMapping(value = "/BestHotel")
    public ResponseEntity<BestHotelsResponse> getAvailableHotelsResponses(@RequestParam String fromDate,
                                                                          @RequestParam String toDate,
                                                                          @RequestParam String city,
                                                                          @RequestParam int numberOfAdults) {
        RequestHotel convert = convert(fromDate, toDate, city, numberOfAdults);
        BestHotelsResponse hotelsResponse = bestHotelUsecase.process(convert);
        return new ResponseEntity<>(hotelsResponse, HttpStatus.OK);
    }

    private RequestHotel convert(String fromDate, String toDate, String city, int numberOfAdults) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate fDate = LocalDate.parse(fromDate, formatter);
        LocalDate tDate = LocalDate.parse(toDate, formatter);
        return new RequestHotel(fDate, tDate, city, numberOfAdults);
    }

}
