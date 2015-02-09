/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.services.hw2.travel;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import web.services.hw2.travel.model.Trip;

/**
 *
 * @author Alex
 */
@WebService(serviceName = "FlightCheckerWS")
@Stateless()
public class FlightCheckerWS {


    /**
     * Web service operation
     *
     * @param destination
     * @param departure
     * @return
     */
    @WebMethod(operationName = "checkFlight")
    public List<Trip> checkFlight(@WebParam(name = "destination") String destination, @WebParam(name = "departure") String departure) {
        List<Trip> trips = new ArrayList<>();

        return trips;
    }

    /**
     *
     * @param trip
     * @return
     */
    @WebMethod(operationName = "reserve")
    public boolean reserve(@WebParam(name = "trip") Trip trip) {
        return true;
    }
}
