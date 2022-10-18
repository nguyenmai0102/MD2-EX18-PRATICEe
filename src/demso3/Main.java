package demso3;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
         while (count.getMyThread().isAlive()) {
             System.out.println(" chay cho den het so lan chay ");
             Thread.sleep(1500);
         }

        }
        catch (InterruptedException e){
            System.out.println(" chu de bi gian doan");
        }
        System.out.println("luong chay kt thuc");

    }


}
