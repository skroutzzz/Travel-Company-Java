
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.domain.Airports;
import com.travelcompany.eshop.domain.Itinerary;
//import java.math.BigDecimal;
import java.util.List;


public interface ItineraryRepository {
    boolean addItinerary(Itinerary itinerary);
    List<Itinerary> readItinerary();
    Itinerary readItinerary(long itineraryId);
    List<Itinerary> readItineraryDeparture(Airports departureAirportCode);
    List<Itinerary> readItineraryDestination(Airports destinationAirportCode);
    //boolean updateItinerary(long itineraryId, BigDecimal newPrice);
    boolean deleteItinerary(long itineraryId);
    
    
}
