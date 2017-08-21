package dev.android.fursa.helpme.di.component;

import javax.inject.Singleton;

import dagger.Component;
import dev.android.fursa.helpme.di.module.ApplicationModule;
import dev.android.fursa.helpme.di.module.ManagerModule;
import dev.android.fursa.helpme.di.module.RestModule;
import dev.android.fursa.helpme.ui.activity.BaseActivity;
import dev.android.fursa.helpme.ui.activity.MainActivity;
import dev.android.fursa.helpme.ui.fragment.BaseFragment;

@Singleton
@Component(modules = {ApplicationModule.class, ManagerModule.class, RestModule.class})
public interface ApplicationComponent {
    //activities
    void inject(BaseActivity activity);
    void inject(MainActivity activity);

    //fragments
    void inject(BaseFragment fragment);
}
