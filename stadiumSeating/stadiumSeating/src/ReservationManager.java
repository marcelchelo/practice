import java.util.LinkedList;
import java.util.PriorityQueue;

public class ReservationManager {
    //heap to store the reserved seat values, 
    //this must be a min heap.
     public PriorityQueue<Integer> available = new PriorityQueue<>();
     private LinkedList<Integer> reserved = new LinkedList<>();


     //constructor
    public ReservationManager(Integer numberOfSeats){
       for(int i=numberOfSeats ; i>=1; i--){
            available.add(i);
       }


   }

 


   //reserve a Seat
   public void reserve(){

        //grab the lowest number available 
        Integer chair = available.poll();
        //add this chair to the reserved linkedList
        reserved.add(chair);

        System.out.println("Reserved seat: " + chair);

   }

   public void unReserve(Integer chairNumber){
        //look for chairNumber in arrayList
        if(reserved.contains(chairNumber) == false){
            System.out.println("This chair is not reserved");
        }else{
            reserved.remove(chairNumber);
            available.add(chairNumber);
        }

   }

   public LinkedList<Integer> getReserved(){
    return reserved;
}


}
