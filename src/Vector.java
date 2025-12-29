public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector(Vector v){
        this.x = v.getX();
        this.y = v.getY();
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    /**
     * @return the length of this vector in pixels
     */
    public double getLength(){return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));}

    public Vector add(Vector v){
        x += v.getX();
        y += v.getY();
        return this;
    }

    public Vector scale(double s){
        x = x * s;
        y = y * s;
        return this;
    }

    /**
     * @return the unit vector of this vector
     */
    public Vector getUnitVector(){
        return new Vector(x/getLength(), y/getLength());
    }
}
