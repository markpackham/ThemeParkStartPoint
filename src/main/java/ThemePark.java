import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> places;

    public ThemePark() {
        this.places = new ArrayList<IReviewed>();
    }

    public void add(IReviewed place){
        this.places.add(place);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return places;
    }

    public void visit(Visitor visitor, Attraction attraction){
        int visitCount = attraction.getVisitCount() + 1;
        attraction.setVisitCount(visitCount);
        visitor.addVisit(attraction);
    }
}
