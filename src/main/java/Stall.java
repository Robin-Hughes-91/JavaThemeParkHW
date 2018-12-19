public abstract class Stall{

    public String name;
    public String owner;
    public String parkingSpot;
    public Double rating;

    public Stall(String name, String owner, String parkingSpot, Double rating){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }


    //GETTERS////////////////////////////////

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }
    //METHODS/////////////////////////////////

}
