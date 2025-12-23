public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void rotate(){};

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

    public double getLength(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
    }

    public void add(Vector v){
        x += v.getX();
        y += v.getY();
    }

    public void scale(double s){
        x = x * s;
        y = y * s;
    }

    public Vector getUnitVector(){
        return new Vector(x/getLength(), y/getLength());
    }
}
