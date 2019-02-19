package com.majid.availableHotels.hotelservice.bean;

public interface Usecase<Rq,Rs> {
	 Rs process (Rq rq); 
}
