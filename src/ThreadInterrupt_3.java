/**
 * Created by Hayk on 05.08.2021.
 */
public class ThreadInterrupt_3 extends Thread {
    private boolean isInterrupted = false;

    public ThreadInterrupt_3() {
        this.setName("Thread3");
    }

    public void run() {
        while (true) {
            if (isInterrupted) {
                return;
            }
            try {
                Thread.sleep(1000);
                System.out.println(this.getName() + " is running");
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    public void interrupt() {
        this.isInterrupted = true;
    }
}
