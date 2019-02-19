package com.majid.availableHotels.hotelservice.controller;


import com.google.gson.Gson;
import com.majid.availableHotels.hotelservice.bean.request.RequestHotel;
import com.majid.availableHotels.hotelservice.bean.response.ResponseHotel;
import com.majid.availableHotels.hotelservice.usecase.AvailableHotelsUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
public class AvailableHotelsController {
    @Autowired
    private AvailableHotelsUsecase availableHotelsUsecase;

    @GetMapping(value = "/hotels")
    public String getAvailableHotelsResponses(@RequestParam String fromDate,
                                              @RequestParam String toDate,
                                              @RequestParam String city,
                                              @RequestParam int numberOfAdults) {
        ResponseHotel responseHotel = availableHotelsUsecase.process(convert(fromDate, toDate, city, numberOfAdults));
        return toJson(responseHotel);
    }

    private String toJson(ResponseHotel responseHotel) {
        Gson gson = new Gson();
        return gson.toJson(responseHotel);
    }

    private RequestHotel convert(@RequestParam String fromDate, @RequestParam String toDate, @RequestParam String city, @RequestParam int numberOfAdults) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate fDate = LocalDate.parse(fromDate, formatter);
        LocalDate tDate = LocalDate.parse(toDate, formatter);
        return new RequestHotel(fDate, tDate, city, numberOfAdults);
    }
}
