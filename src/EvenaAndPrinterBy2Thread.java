//in java 7
public class EvenaAndPrinterBy2Thread implements Runnable {
    static int count=1;
    Object object;

    public EvenaAndPrinterBy2Thread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while (count <= 100) {
            //for even
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value : " + count);
                    count++;
                    try {
                        object.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            //for odd
            if(count % 2 != 0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object) {
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value : " + count);
                    count++;
                    object.notify();


                }
            }


        }
    }

    public static void main(String[] args) {
        Object lock=new Object();
        Runnable r1=new EvenaAndPrinterBy2Thread(lock);
        Runnable r2=new EvenaAndPrinterBy2Thread(lock);
        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();
    }
}
