package dev.android.fursa.helpme.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.android.fursa.helpme.common.manager.MyFragmentManager;
//manage
@Module
public class ManagerModule {

    @Singleton
    @Provides
    MyFragmentManager provideMyFragmentManager() {
        return new MyFragmentManager();
    }
}
