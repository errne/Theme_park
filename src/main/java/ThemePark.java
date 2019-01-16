import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Stalls.Stall;
import Visitor.Visitor;

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

    public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor){

        ArrayList<ITicketed>allAllowed = new ArrayList<>();
        ArrayList<ISecurity>checks = new ArrayList<>();
        for (Attraction attraction : attractions){
            if(attraction instanceof ISecurity && attraction instanceof ITicketed){
                checks.add((ISecurity) attraction);
            } else if (attraction instanceof ITicketed){
                allAllowed.add((ITicketed) attraction);
            }
        }

        for (Stall stall : stalls){
            if(stall instanceof ISecurity){
                checks.add((ISecurity) stall);
            } else if (stall instanceof ITicketed){
                allAllowed.add((ITicketed) stall);
            }
        }

        for (ISecurity check : checks){
            if(check.isAllowedTo(visitor)){
                allAllowed.add((ITicketed) check);
            }
        }
        return allAllowed;

    }

    public String getReviewsString(){
        String list = "";
       ArrayList<IReviewed> reviews = getAllReviewed();
       for (IReviewed review : reviews){
         //  list += review.toString();
           list += review.getName();
           list += ": ";
           list += review.getRating();
           list += ", ";
       }
        return list;
    }

//    public void visit(Visitor visitor, Attraction attraction){
//            if(attraction instanceof ISecurity){
//                if (((ISecurity) attraction).isAllowedTo(visitor)){
//                    visitor.spendMoney(Attraction attraction.);
//                }
//            }
//    }

}
