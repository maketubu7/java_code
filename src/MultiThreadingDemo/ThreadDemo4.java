package MultiThreadingDemo;

/**
 * 守护线程
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new student(true),"阿紫");
        Thread t2 = new Thread(new student(false),"乔峰");
        //设置为守护线程，守护所有非守护线程,如果乔峰挂了，游坦之没挂，
        // 阿紫也不会殉情，会等到游坦之挂
        t1.setDaemon(true);    //true为守护进程

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("游坦之挂了。。。。");

    }
}

class student implements Runnable{
    private boolean flag;

    public student(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            for (int i = 100; i > 1; i--) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "还剩" + i + "年");
            }
        }
        else{
            for (int i = 10; i > 1; i--) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "还剩" + i + "年");
            }
        }
    }
}
