package com.nsu.edu.androidmvpdemo.login;

/**
 * 登陆的Presenter 的接口，实现类为LoginPresenterImpl
 */
public interface LoginPresenter {
    // 检验登录
    void validateCredentials(String username, String password);
    // 销毁当前View
    void onDestroy();
}

