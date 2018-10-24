package MultiThreadingDemo;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadB(),"雷利");
        Thread t2 = new Thread(new ThreadB(),"白胡子");

        t1.setPriority(5);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}

class ThreadB implements Runnable{

    @Override
    public void run() {
        for (int i = 1;i<100;i++){
            System.out.println(Thread.currentThread().getName() + "抢到了" + i);
        }
    }
}