public class Dodgems extends Attraction implements IReviewed{


    public Dodgems(String name, Double rating) {
        super(name, rating);
    }

    @Override
    public Double getRating() {
        return rating;
    }

    @Override
    public void setRating(Double rating) {

    }
}
