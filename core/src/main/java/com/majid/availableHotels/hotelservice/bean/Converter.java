package com.majid.availableHotels.hotelservice.bean;

public interface Converter<T, R> {
    R convert( T t);
}
