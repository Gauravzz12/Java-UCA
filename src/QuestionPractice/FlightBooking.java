package QuestionPractice;

import java.util.Scanner;

import Concepts.stringbuffer;

public class FlightBooking {
    private String flightNo;
    private String flightName;

    public FlightBooking(String flightNo, String flightName) {
        this.flightName = flightName;
        this.flightNo = flightNo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flightNumber=0;
        String flightName = null;
        try {
            System.out.println("Enter Flight Number  ");
            String flightNo = in.nextLine().trim();
            System.out.println("Enter Flight Name : ");
            if (flightNo.isEmpty() || flightName.isEmpty()) {
                throw new IllegalArgumentException("Flight number and name cannot be empty.");
            }
            flightName = in.nextLine().trim();
            flightNumber = Integer.parseInt(flightNo);
            String nameCheck="";
            
            
            for(int i=0;i<flightName.length();i++) {
            	nameCheck+=flightName.charAt(i);
            	int parsecheck=0;
            	try {
            		parsecheck=Integer.parseInt(nameCheck);
            		if(parsecheck>=0) {
               		 throw new IllegalAccessError("Flight Name cannot contain Integer");
               	 }
				} catch (Exception e) {
					continue;
				}
            	nameCheck="";
            }
           
           
				
			
            FlightBooking obj = new FlightBooking(flightNo, flightName);
            System.out.println("Flight Number : " + flightNumber + " Flight Name  : "+ flightName);
        
        } 
        catch (NumberFormatException e) {
            System.out.println("Flight number should be a Integer.");
        }catch(IllegalAccessError e) {
        	System.out.println("Flight Name cannot contain Integer");
        }
        catch (IllegalArgumentException e) {
            System.out.println("FlightNumber or FlightName cannot be Empty");
        }
         catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            in.close(); 
        }
        
    
    }
}
