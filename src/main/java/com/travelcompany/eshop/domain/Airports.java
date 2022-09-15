
package com.travelcompany.eshop.domain;


public enum Airports {
    ATH("Athens Airport"),
    PAR("Paris Airport"),
    LON("London Airport"),
    AMS("Amsterdam Airport"),
    DUB("Dublin Airport"),
    FRA("Frankfurt Airport"),
    MEX("Mexico Airport");
    
    private final String airportName;
    
    private Airports(String airportName){
        this.airportName = airportName;
    }
    
    @Override
    public String toString(){
        return airportName;
    }
    
}
