import codedraw.CodeDraw;

/**
 * Immovable mass.
 */
public class Planet implements Drawable{
    private final Vector pos;
    private double mass;

    public Planet(Vector pos, double mass){
        this.pos = pos;
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

    @Override
    public void move(Vector a) {
        return;
    }

    public double getMass(){
        return mass;
    }

    @Override
    public Vector getForce(Drawable d) {
        return new Vector(0, 0);
    }
}
