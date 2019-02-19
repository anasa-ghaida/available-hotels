package com.majid.availableHotels.hotelservice.bean;

import com.majid.availableHotels.hotelservice.bean.request.Request;

public interface ProviderCaller<Rq extends Request, Result> {
    Result callProvider(Rq request);
}
