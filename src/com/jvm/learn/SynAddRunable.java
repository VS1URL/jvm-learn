package com.jvm.learn;

/**
 * Created by zwchen on 17-3-23.
 */
public class SynAddRunable implements Runnable {
    int a, b;
    public SynAddRunable(int a, int b){
        this.a = a;
        this.b = b;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        synchronized (Integer.valueOf(a)){
            synchronized (Integer.valueOf(b)){
                System.out.print(a+b);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(300L);

        for (int i= 0;i<100;i++){
            Thread threadA = new Thread(new SynAddRunable(1, 2));
            Thread threadB = new Thread(new SynAddRunable(2, 1));

            threadA.start();
            threadB.start();
        }

    }
}
