/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.services.hw2.travel.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author syst3m
 */
public class Flights {
   private static List <Flight> flightList = new ArrayList<Flight>(); 
 

   public Flights(){
       Flight flight = new Flight();
       Flight flight2 = new Flight();
       Flight flight3 = new Flight();
       Flight flight4 = new Flight();
       Flight flight5 = new Flight();
       
       flight.setDeparture("stockholm");
       flight.setDestination("göteborg");
       flight.setPrice(400);
       flight.setFlightNr("MN14G");
       flight.setDate("2015-02-02");
       flightList.add(flight);
       
       flight2.setDeparture("stockholm");
       flight2.setDestination("göteborg");
       flight2.setFlightNr("IX124");
       flight2.setPrice(300);
       flight2.setDate("2015-02-12");
       flightList.add(flight2);
       
        
       flight3.setDeparture("stockholm");
       flight3.setDestination("göteborg");
       flight3.setFlightNr("LK19F");
       flight3.setPrice(300);
       flight3.setDate("2015-02-15");
       flightList.add(flight3);
       
       
       flight4.setDeparture("danmark");
       flight4.setDestination("bremen");
       flight4.setFlightNr("KA193");
       flight4.setPrice(1300);
       flight4.setDate("2015-02-17");
       flightList.add(flight4);
       
       flight5.setDeparture("danmark");
       flight5.setDestination("bremen");
       flight5.setFlightNr("PO19F");
       flight5.setPrice(1300);
       flight5.setDate("2015-02-17");
       flightList.add(flight5);
   }
   
   public List findTicket(String departure, String destination){
       List ticket =  new ArrayList<Flight>();      
       for(int i = 0; i < flightList.size(); ++i){           
           if(flightList.get(i).getDeparture().equals(departure) && flightList.get(i).getDestination().equals(destination)){            
               ticket.add(flightList.get(i));
           }
       }
       return ticket;
   }
}
