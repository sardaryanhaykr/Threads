/**
 * Created by Hayk on 04.08.2021.
 */
public class ThreadInterrupt_1 extends Thread {
    public ThreadInterrupt_1() {
        this.setName("Thread-1");
    }

    public void run() {
        while (!this.isInterrupted()) {
            System.out.println(this.getName() + " is running");
        }
    }
}
