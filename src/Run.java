import codedraw.CodeDraw;
import com.sun.jdi.request.MethodEntryRequest;

public class Run {
    static void main(){
        run();
    }

    public static void run(){
        int win_size = 500;
        CodeDraw cd = new CodeDraw(win_size, win_size);
        Board b = new Board();
        Meteor m1 = new Meteor(new Vector(200, 200), new Vector(0, 0), 20);
        b.add(m1);

        int fps = 30;
        long targetTime = 1000 / fps;
        int count = 0;

        while(true){
            count++;

            if(count == 50){
                m1.move(new Vector(0, 1));
            }
            if(count == 80){
                m1.move(new Vector(-2, -2));
            }
            if(count == 100){
                m1.move(new Vector(0, 2));
            }
            if(count == 200){
                m1.move(new Vector(1, -1));
            }
            if(count == 250){
                m1.move(new Vector(1, 1));
            }
            if(count == 300){
                m1.move(new Vector(-2, -2));
            }

            long start = System.currentTimeMillis();
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
