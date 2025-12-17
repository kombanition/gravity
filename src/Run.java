import codedraw.CodeDraw;

public class Run {
    static void main(){
        run();
    }

    public static void run(){
        int win_size = 500;
        CodeDraw cd = new CodeDraw(win_size, win_size);
        Board b = new Board();
        Planet p1 = new Planet(new Vector(100, 100), 50);
        Planet p2 = new Planet(new Vector(200, 100), 70);
        Planet p3 = new Planet(new Vector(100, 200), 40);
        Planet p4 = new Planet(new Vector(200, 400), 80);
        Planet p5 = new Planet(new Vector(300, 150), 20);
        b.add(p1, p2, p3, p4, p5);
        b.drawAll(cd);
    }
}
