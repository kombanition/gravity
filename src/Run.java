import codedraw.CodeDraw;
import com.sun.jdi.request.MethodEntryRequest;

public class Run {
    static void main(){
        run();
    }

    public static void run(){
        int win_size = 800;
        CodeDraw cd = new CodeDraw(win_size, win_size);
        Board b = new Board();
        Meteor m1 = new Meteor(new Vector(200, 200), new Vector(1, 0), 20);
        Meteor m2 = new Meteor(new Vector(400, 400), new Vector(-1, 0), 30);
        Meteor m3 = new Meteor(new Vector(300, 50), new Vector(0, 0), 10);

        b.add(m1, m2, m3);

        int fps = 60;
        long targetTime = 1000 / fps;

        while(true){
            long start = System.currentTimeMillis();
            b.calculateAllForces();
            b.drawAll(cd);
            cd.clear();

            // Drawing & FPS
            long elapsed = System.currentTimeMillis() - start;
            long wait = targetTime - elapsed;
            if (wait > 0) {
                try{
                    Thread.sleep(wait);
                } catch(InterruptedException e){
                    break;
                }

            }
            if(cd.isClosed()){
                System.exit(0);
            }
        }
    }
}
