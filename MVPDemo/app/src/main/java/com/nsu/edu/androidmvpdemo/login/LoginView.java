package com.nsu.edu.androidmvpdemo.login;

/**
 * 登陆View的接口，实现类也就是登陆的activity
 */
public interface LoginView {

    // 显示进度条
    void showProgress();
    // 关闭进度条
    void hideProgress();
    // 提示用户名错误
    void setUsernameError();
    // 提示密码错误
    void setPasswordError();
    // 跳转到主界面
    void navigateToHome();
}
