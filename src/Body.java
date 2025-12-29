/**
 * A body of mass
 */
public interface Body {
    /**
     * draws this body on the given canvas cd
     * @param cd != null
     */
    public void draw (codedraw.CodeDraw cd);

    /**
     * Exerts the force a on the movement of this body
     * @param a != null
     */
    public void move(Vector a);

    /**
     * @return the position (Vector object) of this body
     */
    public Vector getPos();

    /**
     * @param d
     * @return the force d exerts on this
     */
    public Vector getForce(Body d);

    /**
     * @return the mass of this body
     */
    public double getMass();
}
