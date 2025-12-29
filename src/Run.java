import codedraw.CodeDraw;

// TODO: Mindestabstand, Velet-Integration, Refactoring

public class Run {
    static void main(){
        run();
    }

    public static void run(){
        int win_size = 800;
        CodeDraw cd = new CodeDraw(win_size, win_size);
        Board b = new Board();
        //Planet m1 = new Planet(new Vector(100, 100), new Vector(0, 0), 20);
        // Planet m2 = new Planet(new Vector(600, 300), new Vector(1, 0), 30);
        Planet m3 = new Planet(new Vector(50, 100), new Vector(0, 2), 200);
        Planet m4 = new Planet(new Vector(300, 300), new Vector(0, 0.1), 1800);
        b.add(m3, m4);

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
