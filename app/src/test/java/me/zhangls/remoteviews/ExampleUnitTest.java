package me.zhangls.remoteviews;

import com.google.gson.Gson;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    public   int count = 0;

    @Test
    public void addition_isCorrect() throws Exception {
//        Parent parent = new Child();
//        assertTrue(parent.i == 10);

        Object object = new Object();
        System.out.println(object);

        String ss = "a";
        ss.hashCode();
        hashCode(ss);

        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");

        Gson gson = new Gson();
        Parent parent1 = gson.fromJson("{\"name\":\"zhangls\",\"age\":27}", Parent.class);

        map.remove("4");

        //同时启动1000个线程，去进行i++计算，看看实际结果

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    inc();
                }
            }).start();
        }





        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + count);

    }

    public synchronized   void inc() {

        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }

        count++;
    }

    public int hashCode(String ss) {
        int h = 0;
        int count = ss.length();
        if (h == 0 && count > 0) {
            for (int i = 0; i < count; i++) {
                h = 31 * h + ss.charAt(i);
            }
        }
        return h;
    }


}