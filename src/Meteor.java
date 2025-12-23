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
        step();
    }

    @Override
    public void move(Vector a) {
        v = new Vector(v.getX() + a.getX(), v.getY()+ a.getY());
    }

    public void step() {
        pos = new Vector(pos.getX() + v.getX(), pos.getY() + v.getY());
    }

    public double getMass(){
        return mass;
    }

    /**
     *
     * @param d
     * @return a vector with direction towards d
     */
    public Vector getDirection(Drawable d){
        return new Vector(d.getPos().getX() - pos.getX(), d.getPos().getY() - pos.getY());
    }

    /**
     *
     * @param d
     * @return the force d exerts on this
     */
     public Vector getForce(Drawable d){
         Vector retVector = getDirection(d);
         Double scalar = (mass * d.getMass())/(Math.pow(retVector.getLength(), 2));
         retVector = retVector.getUnitVector();
         retVector.scale(scalar);
        return retVector;
    }
}
