package QuestionPractice;

import java.util.Scanner;

public class FlightBooking {
    private String flightNo;
    private String flightName;

    public FlightBooking(String flightNo, String flightName) {
        this.flightName = flightName;
        this.flightNo = flightNo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter Flight Number  ");
            String flightNo = in.nextLine().trim();
            System.out.println("Enter Flight Name : ");
            String flightName = in.nextLine().trim();
            int flightNumber = Integer.parseInt(flightNo); 
            if (flightNo.isEmpty() || flightName.isEmpty()) {
                throw new IllegalArgumentException("Flight number and name cannot be empty.");
            }
           
            FlightBooking obj = new FlightBooking(flightNo, flightName);
      
        }catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Flight number should be a Number.");
        }catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: FlightNumber or FlightName cannot be Empty");
        }  catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            in.close(); 
        }
    }
    
    
}
