package io.yac.flight.pricer.web.resources;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.yac.flight.pricer.model.Solution;

import java.util.List;

@JsonRootName("round-trip-flight-search")
public class RoundTripFlightSearchResponse {
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;

    private List<Airline> airlines;

    private List<Solution> solutions;

    public List<Solution> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<Solution> solutions) {
        this.solutions = solutions;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getId() {
        return origin + "-" + destination + "-" + departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }
}
