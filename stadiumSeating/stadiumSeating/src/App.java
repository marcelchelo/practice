//reserve Seat()
      //the reserve seat must always reserve the lowest seat number available 
//unreserveSeat(int seatNumber)



public class App {
    public static void main(String[] args) throws Exception {


        //initialize a manager with 50 seats. 
        ReservationManager manager = new ReservationManager(50);

        //reserve the 3 times(Always reserving the lowest chair number available)
      
        manager.reserve();
        manager.reserve();
        manager.reserve();

        //Show the reserved seats
        manager.getReserved().forEach(entry ->{
            System.out.println(entry);
        });


        //Unreserve a seat, i.e return a ticket?
        manager.unReserve(2);
        

        //show updated reserved seats
        System.out.println("Reserved seats");
        manager.getReserved().forEach(entry ->{
            System.out.println(entry + " ");
        });

        //Show the available seats, notice the order 2,5,4 printed out. After another reserve.   4 should be next. 
        System.out.println(manager.available + "------Notice 2,5,4 ordering ");

        manager.reserve();
        System.out.println(manager.available + "------The orderig changed beacuse of min Heap ");
      
        
    }
}
