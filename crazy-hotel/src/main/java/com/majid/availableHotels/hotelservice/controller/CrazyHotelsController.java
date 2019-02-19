package com.majid.availableHotels.hotelservice.controller;


import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.CrazyHotelsResponse;
import com.majid.availableHotels.hotelservice.usecase.CrazyHotelUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
public class CrazyHotelsController {
    @Autowired
    private CrazyHotelUsecase crazyHotelUsecase;

    @GetMapping(value = "/Crazyhotel")
    public ResponseEntity<CrazyHotelsResponse> getAvailableHotelsResponses(@RequestParam String fromDate,
                                                                           @RequestParam String toDate, @RequestParam String city, @RequestParam int numberOfAdults) {
        CrazyHotelsResponse hotelsResponse = crazyHotelUsecase.process(convert(fromDate, toDate, city, numberOfAdults));
        return new ResponseEntity<>(hotelsResponse, HttpStatus.OK);
    }


    private RequestHotel convert(@RequestParam String fromDate, @RequestParam String toDate, @RequestParam String city, @RequestParam int numberOfAdults) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate fDate = LocalDate.parse(fromDate, formatter);
        LocalDate tDate = LocalDate.parse(toDate, formatter);
        return new RequestHotel(fDate, tDate, city, numberOfAdults);
    }
}
