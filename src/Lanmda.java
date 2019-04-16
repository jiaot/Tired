
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

public class Lanmda {


    int min = 0;

    private Lock lock = new ReentrantLock();



    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambada");
            }
        }).start();

        new Thread(()-> System.out.println("1232")).start();

       sysHello(str -> Integer.parseInt(str)+1);


    }


    private  static void  sysHello(Function<String , Integer> stringIntegerFunction){


        System.out.println(stringIntegerFunction.apply("29"));

        Function<String , String> f = t -> t;


    }

}
