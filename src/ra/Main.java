package ra;

public class Main {
    public static void main(String[] args) {
        System.out.println("run main");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread--HR-Database");
        runnableDemo2.start();

        RunnableDemo runnableDemo3 = new RunnableDemo("Thread-3-HR-Database");
        runnableDemo3.start();

        System.out.println("Main thread stopped!");



   }

}
