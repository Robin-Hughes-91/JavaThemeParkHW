import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviews = new ArrayList<IReviewed>();
    }

    //GETTERS////////////////////////////////////////////////////////////


    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getReviews() {
        return reviews;
    }

    //SETTERS////////////////////////////////////////////////////////////


    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }


    //METHODS////////////////////////////////////////////////////////////


    public void visit(Visitor visitor, Attraction attraction){

    }

    public void review(IReviewed review) {
        reviews.add(review);
    }

    public String getAllReviewsString() {
        String string = new String();

        for (IReviewed reviewed : reviews){
            string += reviewed.getName() + ": " + reviewed.getRating() + ", ";
        }
        return string;
    }

}
