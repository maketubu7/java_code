package MultiThreadingDemo;

public class ThreadDemo3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new eat(),"八戒");
        Thread t2 = new Thread(new eat(),"陈妍希");

        t1.start();


        try {
            t2.start();
            t1.join();     //谁调用t1.join()方法，谁就等待这个线程终止
            //如果t2.start在join之前，陈妍希就可以抢包子，如果在之后只能吃剩下的，
            //因为主线程已经停了，陈妍希根本来不及抢包子
//            t2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("吃完了。。。。");


    }
}

class eat implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "要吃包子，吃了" + i + "个");
        }
    }
}
