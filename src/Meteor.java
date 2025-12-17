import codedraw.CodeDraw;
/**
 * Movable mass.
 */
public class Meteor implements Drawable{
    private Vector pos;
    private Vector v;
    private double mass;

    public Meteor(Vector pos, Vector v, double mass){
        this.pos = pos;
        this.v = v;
        this.mass = mass;
    }

    @Override
    public Vector getPos() {
        return pos;
    }

    @Override
    public void draw(CodeDraw cd) {
        cd.drawCircle(pos.getX(), pos.getY(), mass);
    }
}
