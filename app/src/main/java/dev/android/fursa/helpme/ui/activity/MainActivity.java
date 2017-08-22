package dev.android.fursa.helpme.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

import dev.android.fursa.helpme.R;
import dev.android.fursa.helpme.app.CurrentUser;
import dev.android.fursa.helpme.app.MyApplication;
import dev.android.fursa.helpme.consts.ApiConst;
import dev.android.fursa.helpme.mvp.presenter.MainPresenter;
import dev.android.fursa.helpme.mvp.view.MainView;
import dev.android.fursa.helpme.ui.fragment.HospitalListFragment;

public class MainActivity extends BaseActivity implements MainView {

    private static final String TAG = MainActivity.class.getSimpleName();

    @InjectPresenter
    MainPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);

        presenter.checkAuth();
    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                // Пользователь успешно авторизовался
                presenter.checkAuth();
            }

            @Override
            public void onError(VKError error) {
                // Произошла ошибка авторизации (например, пользователь запретил авторизацию)
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void startSignIn() {
        VKSdk.login(this, ApiConst.DEFAULT_LOGIN_SCOPE);
    }

    @Override
    public void signedId() {
        Toast.makeText(this, "Current uid = " + CurrentUser.getId(), Toast.LENGTH_LONG).show();
        setContent(new HospitalListFragment());
    }
}
