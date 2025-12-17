import codedraw.CodeDraw;
import java.util.ArrayList;

/**
 * Stores all things getting drawn.
 */
public class Board {
    private ArrayList<Drawable> comps;

    public Board(Drawable... comps){
        this.comps = new ArrayList<>();
        for(Drawable c : comps){
            this.comps.add(c);
        }
    }

    public void add(Drawable... comps){
        for(Drawable c : comps){
            this.comps.add(c);
        }
    }

    public void drawAll(CodeDraw cd){
        for(Drawable d : comps){
            d.draw(cd);
        }
        cd.show();
    }

    // Method for gravity interaction between objects



}
