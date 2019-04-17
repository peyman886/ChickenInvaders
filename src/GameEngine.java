import javax.swing.*;
import java.awt.*;

public class GameEngine extends JPanel implements Runnable {


    private Thread gameThread;
    private boolean running = false;
    private int repaints = 0;
    private Handler handler;
    private Status status;


    private double amountOfTicks = 30.0; //per second
    @Override
    public void run() {
        // game engine
        long lastTime = System.nanoTime();
        double ns_per_tick = 1000000000 / amountOfTicks; //results in almost: 16 millions
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns_per_tick;
            lastTime = now;
            while (delta >= 1){
                tick(); //must take less than 16 million nano seconds
                delta --;
                frames++;
            }
            if (running) {
//                render();
                repaint();
//                paintImmediately(0,0,GameEngine.getGameWidth(),GameEngine.getGameHeight());
            }

//            try {
//                Thread.sleep(frames>65 ? 30 : 0);
////                Thread.sleep((long) Math.max(System.nanoTime() - lastTime - ns_per_tick, 1));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (frames>60){
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

            //print status every second
            if (System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.format("FPS: %d repaints: %d%n", frames, repaints);
                frames = 0;
                repaints = 0;
            }
        }
        stop();
    }

    public void start(){
        //starting the simulation loop in a thread else than EDT(swing thread)
        System.out.println("START");
        gameThread = new Thread(this);
        gameThread.start();
        running = true;
        status = Status.PLAY;
    }

    public void stop(){
        try {
            //closes the thread if not busy
            gameThread.join();
            running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            // print eror
        }
    }

    public void pause(){
        running = false;
        System.out.println("PAUSED");
        status = Status.PAUSE;
    }

    private void tick(){
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        handler.draw(g);
        repaints++;
    }

    public boolean isRunning() {
        return running;
    }

    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }

    public double getAmountOfTicks() {
        return amountOfTicks;
    }

    public void setAmountOfTicks(double amountOfTicks) {
        this.amountOfTicks = amountOfTicks;
    }
}
