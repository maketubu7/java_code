package MultiThreadingDemo;

public class ThreadDemo5 {
    public static void main(String[] args) {
        money mey = new money();

        Thread t1 = new Thread(mey, "路宝");
        Thread t2 = new Thread(mey, "香吉士");
        Thread t3 = new Thread(mey, "不死鸟");

        t1.start();
        t2.start();
        t3.start();
    }
}

class money implements Runnable{
    private  static  int num = 30;
    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true){
            //同步锁的用法
            synchronized (this){
            if (num > 0){
                System.out.println(Thread.currentThread().getName() + "抢到了第" + (num--) + "个");
            }else{
                return;
            }
            }
        }
    }
}
