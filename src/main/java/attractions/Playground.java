package attractions;

import behaviours.ISecurity;
import people.Visitor;

public final class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>15){
            return false;
        }else{
            return true;
        }
    }
}
