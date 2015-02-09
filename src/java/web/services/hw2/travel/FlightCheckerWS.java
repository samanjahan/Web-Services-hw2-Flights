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
import web.services.hw2.travel.model.Flight;
import web.services.hw2.travel.model.Flights;
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
    public List<String> checkFlight(@WebParam(name = "departure") String departure,@WebParam(name = "destination") String destination)  {
        List<Trip> trips = new ArrayList<Trip>();
        List<String> stringlist = new ArrayList<String>();
        Flights fl = new Flights();
        trips = fl.findFligts(departure, destination);
        for(int  i = 0 ; i < trips.size(); ++i){
            String test = trips.get(i).toString();
            System.out.println(" " + trips.toString());
            stringlist.add(test);
        }
        
       // System.out.println("teeest " + trips.get(0).toString());
        return stringlist;
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