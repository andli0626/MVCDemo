package com.nsu.edu.androidmvpdemo.login;

/**
 * 模拟登陆的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
 */
public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}
