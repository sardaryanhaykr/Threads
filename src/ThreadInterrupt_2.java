/**
 * Created by Hayk on 04.08.2021.
 */
public class ThreadInterrupt_2 extends Thread {
    public ThreadInterrupt_2() {
        this.setName("Thread-2");
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(this.getName() + " is running");
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread interrupted..." + e);

            }
        }
    }
}
