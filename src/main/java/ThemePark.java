import Attractions.Attraction;
import Interfaces.IReviewed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<Attraction>attractions;
    private ArrayList<Stall>stalls;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
         ArrayList<IReviewed>reviewedList= new ArrayList<>();

         for (Attraction attraction : attractions){
             if(attraction.getRating() != 0){
                 reviewedList.add((IReviewed) attraction);
             }
         }

        for (Stall stall : stalls){
            if(stall.getRating() != 0){
                reviewedList.add((IReviewed) stall);
            }
        }

        return reviewedList;
    }

    public String getName() {
        return this.name;
    }

    public void addAttraction(Attraction newAttraction){
        this.attractions.add(newAttraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

//    public void visit(Visitor, Attraction){
//
//    }
}
