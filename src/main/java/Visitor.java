public class Visitor {

    private final int height;
    private String name;
    private int age;
    private Double money;

    public Visitor(String name, int age, Double money, int height){
        this.name = name;
        this.age = age;
        this.money = money;
        this.height = height;

    }

    //GETTERS////////////////////////////////


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Double getMoney() {
        return money;
    }

    public int getHeight() {
        return height;
    }

    //METHODS/////////////////////////////////

    public void rate(IReviewed thing, Double rating){

        thing.setRating(rating);

    }


}
