import codedraw.CodeDraw;
/**
 * Movable mass.
 */
public class Planet implements Body {
    private Vector pos;
    private Vector vel;
    private final double mass;

    public Planet(Vector pos, Vector vel, double mass){
        this.pos = pos;
        this.vel = vel;
        this.mass = mass;
    }

    @Override
    public Vector getPos() {
        return pos;
    }

    @Override
    public void draw(CodeDraw cd) {
        cd.drawCircle(pos.getX(), pos.getY(), Math.pow((3 * mass) / (4 * Math.PI), (double) 1 /3));
        step();
    }

    @Override
    public void move(Vector a) {vel.add(a.scale(1/mass));}

    @Override
    public double getMass(){
        return mass;
    }

    /**
     * calculate new position for next iteration cycle
     */
    private void step() {
        pos.add(vel);
    }

    /**
     * @param d != null
     * @return a vector with direction from this towards d
     */
    public Vector getDirection(Body d){
        return new Vector(d.getPos().getX() - pos.getX(), d.getPos().getY() - pos.getY());
    }

    /**
     * @param d != null
     * @return the force d exerts on this
     */
     public Vector getForce(Body d){
         Vector retVector = getDirection(d);
         double scalar;

         double minCalcDistance = 0.1; // testing
         if(retVector.getLength() <= minCalcDistance){
             scalar = (this.mass * d.getMass())/(Math.pow(minCalcDistance, 2));
         } else {
             scalar = (this.mass * d.getMass())/(Math.pow(retVector.getLength(), 2));
         }

         retVector = retVector.getUnitVector();
         retVector.scale(scalar);
         return retVector;
    }
}
