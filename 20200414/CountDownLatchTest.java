import java.sql.Time;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author Luke
 */
public class CountDownLatchTest {
    static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        System.out.println("全班同学开始考试：一共两个学生,开始时间：" + System.currentTimeMillis()/1000);
        //启动一个线程
        new Thread(() -> {
            Long begin = System.currentTimeMillis();
            System.out.println("第一个学生交卷开始，countDownLatch减1");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println("第一个学生交卷结束:use time:" + (System.currentTimeMillis()/1000 ));
        }).start();
        //启动一个线程
        new Thread(() -> {
            Long begin = System.currentTimeMillis();
            System.out.println("第二个学生交卷开始，countDownLatch减1");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println("第二个学生交卷结束:use time:" + (System.currentTimeMillis()/1000));
        }).start();

        try {
           // 这个方法的意思是等待指定的时间，如果还有线程没执行完，那就接着执行。就好比考完试了，还有同学没交试卷，此时因为到时间了。不管三七二十一也不管剩下的同学是否提交，直接就走了。
            countDownLatch.await(4, TimeUnit.SECONDS);
            //没限制超时时间，等待上面所有线程执行完成
            //countDownLatch.await();
            System.out.println("countDownLatch.await 等待时间结束:" + System.currentTimeMillis()/1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("老师清点试卷，在此之前，只要一个学生没交，"
                + "countDownLatch不为0，不能离开考场");
    }
}