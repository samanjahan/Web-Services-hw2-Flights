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
 * @author Alex
 */
public class Trip {
    private List<String> trip = new ArrayList<String>();
     
    public Trip() {
    }
     
    public Trip(Flight newFlight) {
         
       String price = Double.toString(newFlight.getPrice());
        trip.add(newFlight.getDeparture() + ":" + newFlight.getDestination() + ":"+ newFlight.getDate()+ ":" + price);
    }
     
    public void addFlight(Flight newFlight) {
        String price = Double.toString(newFlight.getPrice());
        trip.add(newFlight.getDeparture() + ":" + newFlight.getDestination() + ":"+ newFlight.getDate()+ ":" + price);
    }
     
    public void removeFlight(Flight flight){
         
        if(trip.contains(flight)) {
            trip.remove(flight);
        }
         
         
    }
 
     
     
  @Override
   public String toString(){
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < trip.size(); ++i){
         //  String price = Double.toString(trip.get(i).getPrice());
           sb.append(trip.get(i) + "_");
        }
       return sb.toString();
   }
}