
public class VehicleException extends Exception {
  
  public VehicleException () { //default constructor
    super("Error: Select a type of vehicle!!!");    
  }
  
  public VehicleException (String message) { //Overloaded Constructor
    super(message);    
  }  
  
}