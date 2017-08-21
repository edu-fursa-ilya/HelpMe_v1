package dev.android.fursa.helpme.app;


import android.app.Application;

import com.vk.sdk.VKSdk;

import dev.android.fursa.helpme.di.component.ApplicationComponent;
import dev.android.fursa.helpme.di.component.DaggerApplicationComponent;
import dev.android.fursa.helpme.di.module.ApplicationModule;

public class MyApplication extends Application {

    private static ApplicationComponent sApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
        VKSdk.initialize(this);
    }

    private void initComponent() {
        sApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return sApplicationComponent;
    }
}
