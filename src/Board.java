import codedraw.CodeDraw;
import java.util.Arrays;
import java.util.List;


public class Board {
    private List<Drawable> comps;

    public Board(Drawable... comps){
        this.comps = Arrays.asList(comps);
    }

    public void add(Drawable... comps){
        this.comps.addAll(Arrays.asList(comps));
    }

    public void drawAll(CodeDraw cd){
        for(Drawable d : comps){
            d.draw(cd);
        }
    }

    // Method for gravity interaction between objects



}
