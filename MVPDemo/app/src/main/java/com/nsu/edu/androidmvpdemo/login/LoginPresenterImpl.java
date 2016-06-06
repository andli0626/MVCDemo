package com.nsu.edu.androidmvpdemo.login;

/**
 * 逻辑处理：Presenter和View之间的交互
 *
 *    presenter里面还有个OnLoginFinishedListener，
 *    其在Presenter层实现，给Model层回调，更改View层的状态，
 *    确保 Model层不直接操作View层。如果没有这一接口在LoginPresenterImpl实现的话，
 *    LoginPresenterImpl只有View和Model的引用那么Model怎么把结果告诉View呢？
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {

    // View操作接口
    private LoginView   loginView;
    // 数据层
    private LoginModel  loginModel;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView  = loginView;
        this.loginModel = new LoginModelImpl();
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }
        // 进行登录数据的校验
        loginModel.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    /********************************* 登录回调接口 *********************************/

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        loginView.hideProgress();
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
