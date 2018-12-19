public class CandyFlossStall extends Stall implements IReviewed{


    public CandyFlossStall(String name, String owner, String parkingSpot, Double rating) {
        super(name, owner, parkingSpot, rating);
    }

    @Override
    public Double getRating() {
        return rating;
    }

    @Override
    public void setRating(Double rating) {

    }


}
