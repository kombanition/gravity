public interface Drawable {
    public Vector getPos();
    public void draw (codedraw.CodeDraw cd);
    public void move(Vector a);
    public double getMass();

    /**
     *
     * @param d
     * @return the force d exerts on this
     */
    public Vector getForce(Drawable d);
}
