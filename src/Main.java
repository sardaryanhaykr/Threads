public class Main {

    public static void main(String[] args) {
        //------------------------Testing ThreadInterrupt_1 class--------------------------------------------

        Thread t1 = new ThreadInterrupt_1();
        System.out.println(t1.getState());
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        //------------------------Testing ThreadInterrupt_2 class--------------------------------------------
//        Thread t2=new ThreadInterrupt_2();
//        System.out.println(t2.getState());
//        t2.start();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try
//        {
//            t2.interrupt();
//        }catch(Exception e){System.out.println("Exception handled "+e);}
//        System.out.println(t1.getState());

        //------------------------Testing ThreadInterrupt_3 class--------------------------------------------
        Thread t3 = new ThreadInterrupt_3();
        System.out.println(t3.getState());
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.interrupt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t3.getState());
    }
}
