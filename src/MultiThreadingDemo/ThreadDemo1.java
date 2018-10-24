package MultiThreadingDemo;

public class ThreadDemo1 {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        //获取当前线程
        Thread.currentThread().setName("路飞");
        //对线程设置名称
        t1.setName("鹰眼");
        t2.setName("红发");
        //设置线程优先级  最小1  最大10   值越大优先级越高
        t1.setPriority(1);
        t2.setPriority(8);
        t1.start();
        t2.start();
        //获取当前线程，并得到名字
        System.out.println(Thread.currentThread().getName() + "main run...");
    }
}
class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++) {
            try {
                //对线程进行阻塞，时间到就进入就绪状态
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "running....." + i);
        }
    }
}
