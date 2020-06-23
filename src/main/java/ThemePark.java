import behaviours.IReviewed;

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
}
