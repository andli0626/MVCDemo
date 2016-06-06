package com.nsu.edu.androidmvpdemo.login;

/**
 * 登录完成后，回调接口
 */
public interface OnLoginFinishedListener {
    // 用户名错误
    void onUsernameError();
    // 密码错误
    void onPasswordError();
    // 登陆成功
    void onSuccess();
}
