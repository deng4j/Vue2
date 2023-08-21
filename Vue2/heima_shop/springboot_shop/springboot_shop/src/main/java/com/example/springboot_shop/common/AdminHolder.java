package com.example.springboot_shop.common;

/**
 * 通过ThreadLocal的形式，存储用户的数据
 */
public class AdminHolder {

    private static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    //向当前线程存储数据
    public static void set(User user) {
        userThreadLocal.set(user);
    }

    //从当前线程获取数据
    public static User getAdmin() {
        return userThreadLocal.get();
    }

    public static void remove() {
        userThreadLocal.remove();
    }

    //获取当前用户的id
    public static Long getId() {
        return userThreadLocal.get().getId();
    }
}