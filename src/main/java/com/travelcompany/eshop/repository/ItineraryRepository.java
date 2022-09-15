
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.domain.Itinerary;
//import java.math.BigDecimal;
import java.util.List;


public interface ItineraryRepository {
    boolean addItinerary(Itinerary itenerary);
    List<Itinerary> readItinerary();
    Itinerary readItinerary(long itineraryId);
    //boolean updateItinerary(long itineraryId, BigDecimal newPrice);
    boolean deleteItinerary(long itineraryId);
    
}
