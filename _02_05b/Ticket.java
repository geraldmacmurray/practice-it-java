package _02_05b;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isReturn() {
    return isReturn;
  }

  public void setReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }

  // Add three public methods to set the value of each field, called
  // setDestination, setPrice and setIsReturn.

  // Add three public methods to get the value of each field, called
  // getDestination, getPrice and getIsReturn.

}
