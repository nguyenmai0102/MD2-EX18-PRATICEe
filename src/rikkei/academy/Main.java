package rikkei.academy;

public class Main {
    public static int distance = 100;
    public  static int runDistence =2;
    public static void main(String[] args) {
        Car carA = new Car("carA", 100);
        Car carB = new Car("carB", 100);
        Car carC = new Car("carC", 100);

        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);
        threadC.start();
        threadB.start();
        threadA.start();




    }
}
