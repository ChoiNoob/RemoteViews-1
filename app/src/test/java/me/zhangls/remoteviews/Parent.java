package me.zhangls.remoteviews;

import com.google.gson.annotations.Expose;

/**
 * Created by zhangls on 09/03/2017.
 */

public class Parent {

    @Expose(deserialize = false, serialize = false)
    public String name;
    public int age;

}
