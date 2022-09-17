
package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.domain.Airports;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.repository.ItineraryRepository;
import java.util.ArrayList;
import java.util.List;


public class ItineraryRepositoryImpl implements ItineraryRepository {
    
     private final List<Itinerary> itineraries;
     private final List<Itinerary> departureItineraries;
     private final List<Itinerary> destinationItineraries;

    public ItineraryRepositoryImpl() {
         itineraries = new ArrayList<>();
         departureItineraries = new ArrayList<>();
         destinationItineraries = new ArrayList<>();
    }
    
   

    @Override
    public boolean addItinerary(Itinerary itinerary) {
        for (int index = 0; index < itineraries.size(); index++){
            if (itineraries.get(index).getItineraryId()== itinerary.getItineraryId() )
                return false;
        }
        itineraries.add(itinerary);
        return true;
    }

    @Override
    public List<Itinerary> readItinerary() {
        return itineraries;
    }

    @Override
    public Itinerary readItinerary(long itineraryId) {
        for (Itinerary itinerary:itineraries){
            if (itinerary.getItineraryId() == itineraryId){
                   return itinerary;
            }
        }
        return null; 
    }
    
    @Override
    public List<Itinerary> readItineraryDeparture(Airports departureAirportCode) {
        for (Itinerary itinerary:itineraries){
            if (itinerary.getDepartureAirportCode() == departureAirportCode){
                   departureItineraries.add(itinerary);
                   
            }
        }
        return departureItineraries;
    }
    
    
    

    @Override
    public boolean deleteItinerary(long itineraryId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Itinerary> readItineraryDestination(Airports destinationAirportCode) {
         for (Itinerary itinerary:itineraries){
            if (itinerary.getDestinationAirportCode() == destinationAirportCode){
                   destinationItineraries.add(itinerary);
                   
            }
        }
        return destinationItineraries;
    }
    
}
