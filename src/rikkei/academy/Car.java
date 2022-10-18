package rikkei.academy;

import com.sun.activation.registries.MailcapTokenizer;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import javafx.scene.effect.Light;
import ra.Main;

import java.util.Random;



public class Car implements Runnable {

    private String name;
    private int distance;


    public Car() {
    }

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    @Override
    public void run() {
        int runDistence = 0;
        long startTime = System.currentTimeMillis();
        while (runDistence<distance) {
            // khoi tao van toc cho tung xe
            String string = "|";
            int speed = (int)(Math.random()*20);
            if (runDistence+speed>=this.distance){
                for (int i = 0; i < this.distance; i++) {
                    string+="=";
                }
            }else {
                runDistence+=speed;
                int percent = (runDistence*100)/this.distance;
                for (int i = 0; i < this.distance; i++) {
                    if (i<percent) {
                        string+= "=";

                    }else if (i== percent){
                        string += "o";
                    }else {
                        string += " -";
                    }

                }
            }
            string+= "|";
            System.out.printf("%s : %s %dKM \n", this.name, string, runDistence);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.printf("%s was broken");
            }
        }
        long endTime = System.currentTimeMillis();
        int time = (int)((endTime -  startTime)/1000);
        System.out.printf("%s finish %d\n", this.name, time);
    }
}
