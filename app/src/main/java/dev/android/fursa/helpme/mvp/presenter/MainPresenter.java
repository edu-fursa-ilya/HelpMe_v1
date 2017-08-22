package dev.android.fursa.helpme.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import dev.android.fursa.helpme.app.CurrentUser;
import dev.android.fursa.helpme.mvp.view.MainView;
//presenter for MainActivity
@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void checkAuth() {
        if(!CurrentUser.isAuthorized()) {
            getViewState().startSignIn();
        } else {
            getViewState().signedId();
        }
    }
}
