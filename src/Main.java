public class Main {

    public static void main(String[] args) {
 //------------------------Testing ThreadInterrupt_1 class--------------------------------------------

        Thread t1=new ThreadInterrupt_1();
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
 //------------------------Testing ThreadInterrupt_1 class--------------------------------------------
        Thread t2=new ThreadInterrupt_2();
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try
        {
            t2.interrupt();
        }catch(Exception e){System.out.println("Exception handled "+e);}
    }




//        ThreadInterrupted threadInterrupted=new ThreadInterrupted();
//        String command = "kill -9 "+threadInterrupted.getId();
//
//Thread.sleep(3000);
//threadInterrupted.interrupt();
//        Process proc = Runtime.getRuntime().exec(command);
//
//        // Read the output
//
//        BufferedReader reader =
//                new BufferedReader(new InputStreamReader(proc.getInputStream()));
//
//        String line = "";
//        while((line = reader.readLine()) != null) {
//            System.out.print(line + "\n");
//        }
//
//        proc.waitFor();

}
