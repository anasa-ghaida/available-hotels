package com.majid.availableHotels.hotelservice.bean.response;

import com.majid.availableHotels.hotelservice.bean.ProvidersResult;

import java.util.List;

public class ResponseHotel implements Respone {
    private List<ProvidersResult> results;

    public List<ProvidersResult> getResults() {
        return results;
    }

    public void setResults(List<ProvidersResult> results) {
        this.results = results;
    }
}
