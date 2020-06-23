import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<IReviewed> places;
    private HashMap<String, Integer> reviews;

    public ThemePark() {
        this.places = new ArrayList<IReviewed>();
        this.reviews = new HashMap<String, Integer>();
    }

    public void add(IReviewed place){
        this.places.add(place);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return places;
    }

    public HashMap<String, Integer> getReviews(){
        for (IReviewed place:places
             ) {
            reviews.put(place.getName(),place.getRating());
        }
        return reviews;
    }

    public void visit(Visitor visitor, Attraction attraction){
        int visitCount = attraction.getVisitCount() + 1;
        attraction.setVisitCount(visitCount);
        visitor.addVisit(attraction);
    }
}
