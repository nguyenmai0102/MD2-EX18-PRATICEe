package demso3;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread =  new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }
    Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("in ra gia tri: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("bị gián đoạn");
        }
        System.out.println("ket thuc viec chay");
    }
}
