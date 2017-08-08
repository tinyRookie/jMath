import java.util.*;
import java.util.concurrent.*;

class A implements Runnable{
    private int count = 0;
    @Override
    public void run(){

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.count ++;
        System.out.println(count);
    }
}

public class Main {
    public static void main(String args[]){
        A a = new A();
        for(int i = 0; i < 10; i++){
            new Thread(a).start();
        }
    }
}
