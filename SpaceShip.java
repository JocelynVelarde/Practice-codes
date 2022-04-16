public class SpaceShip {
  private String shipName;
  private int passengerCount;
  private int maxPassengers;

  public SpaceShip(String shipName, int maxPassengers) {
    this.shipName = shipName;
    this.maxPassengers = (maxPassengers >= 0) ? maxPassengers : 100;
    /*
     * Code above is equal to:
     * if (maxPassengers >= 0)
     * this.maxPassengers = maxPassengers;
     * else
     * this.maxPassengers = 100;
     */

  }

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }

  public String getShipName() {
    return this.shipName;
  }

  public int getMaxPassengers() {
    return this.maxPassengers;
  }

  public void board(int boardingPassengers) {
    if (this.passengerCount + boardingPassengers <= maxPassengers) {
      this.passengerCount += boardingPassengers;
    }
  }

  public void leave(int leavingPassengers) {
    if (this.passengerCount - leavingPassengers >= 0) {
      this.passengerCount -= leavingPassengers;
    }
  }

  public int getPassengerCount() {
    return this.passengerCount;
  }

  public void transferTo(SpaceShip newShip) {
    if (newShip == null)
      return;

    if (this.getPassengerCount() + newShip.getPassengerCount() <= newShip.getMaxPassengers()) {
      newShip.board(this.getPassengerCount());
      this.leave(this.getPassengerCount());
    }
  }
  
  //Cambios
  public boolean equals(SpaceShip otherShip)
  {
    if(this.shipName == otherShip.shipName && this.maxPassengers == otherShip.maxPassengers) return true; //Compara el nombre y maxPassengers
    else return false;
  }

  public SpaceShip clone()
  {
    return this; //Regresa el mismo objeto
  }

  // Method toString() will automatically be called when the object is called
  // inside a System.out.println() instruction.
  public String toString() {
    String out = "Ship name: " + this.getShipName() + "\n" +
        "Passenger count: " + this.getPassengerCount() + "\n" +
        "Max passengers: " + this.getMaxPassengers();

    return out;
  }
}
