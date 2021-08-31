package cn.itcast.jvm.t3.candy;

/**
 * description TODO .
 *
 * @author chengxuewen
 * @createTime 2021年08月16日 21:55:00
 */
public class Candy11 {
    public static void main(String[] args) {
        test(1);
    }
    public static void test(final int x) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok:" + x);
            }
        };
    }
}
