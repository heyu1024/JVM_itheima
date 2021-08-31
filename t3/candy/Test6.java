package cn.itcast.jvm.t3.candy;

/**
 * description TODO .
 *
 * @author chengxuewen
 * @createTime 2021年08月16日 21:38:00
 */
public class Test6 {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyResource implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("close 异常");
    }
}
