public class IceCreamStall extends Stall implements IReviewed{


    public IceCreamStall(String name, String owner, String parkingSpot, Double rating) {
        super(name, owner, parkingSpot, rating);
    }

    @Override
    public Double getRating() {
        return rating;
    }

    @Override
    public void setRating(Double rating) {

    }

    public void setRating(int visitorRating){
        rating += visitorRating;

    }


}
