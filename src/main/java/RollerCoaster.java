public class RollerCoaster extends Attraction implements ISecurity, IReviewed{


    public RollerCoaster(String name, Double rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {

        if (visitor.getAge() >=12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Double getRating() {
       return rating;
    }

    @Override
    public void setRating(Double newRating) {
        rating = ((rating += newRating) *0.5);
    }


}
