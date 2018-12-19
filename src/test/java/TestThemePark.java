import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("BigLoop", 10.0);
        iceCreamStall = new IceCreamStall("mr.whippy", "Robin", "a", 9.0);


        visitor = new Visitor("Robin", 27, 100.00, 150);
    }

    @Test
    public void canBeLetOn(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetAllReviewsString(){
        themePark.review(rollerCoaster);
        themePark.review(iceCreamStall);

        assertEquals("BigLoop: 10.0, mr.whippy: 9.0, ", themePark.getAllReviewsString());
    }

    @Test
    public void canReview(){
        themePark.review(rollerCoaster);
        visitor.rate(rollerCoaster, 8.0);
        assertEquals(9.0, rollerCoaster.getRating(), 0.01);
    }

}
