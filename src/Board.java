import codedraw.CodeDraw;
import java.util.ArrayList;

/**
 * Stores all things getting drawn.
 */
public class Board {
    private ArrayList<Body> comps;

    public Board(Body... comps){
        this.comps = new ArrayList<>();
        for(Body c : comps){
            this.comps.add(c);
        }
    }

    public void add(Body... comps){
        for(Body c : comps){
            this.comps.add(c);
        }
    }

    public void drawAll(CodeDraw cd){
        for(Body d : comps){
            d.draw(cd);
        }
        cd.show();
    }

    public void calculateAllForces(){
        for(Body d : comps){
            Vector movement = new Vector(0,0);
            for(Body m : comps){
                if(d.equals(m)){
                    continue;
                }
                movement.add(d.getForce(m));
            }
            d.move(movement);
        }
    }

    // Method for gravity interaction between objects



}
