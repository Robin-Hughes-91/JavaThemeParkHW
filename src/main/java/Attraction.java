public abstract class Attraction {

    public String name;
    public Double rating;

    public Attraction(String name, Double rating){
        this.name = name;
        this.rating = rating;
    }

    //GETTERS////////////////////////////////

    public String getName() {
        return name;
    }


    //METHODS/////////////////////////////////

}
