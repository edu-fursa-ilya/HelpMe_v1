package dev.android.fursa.helpme.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.android.fursa.helpme.rest.RestClient;
//rest interaction
@Module
public class RestModule {
    private RestClient mRestClient;

    public RestModule() {
        this.mRestClient = new RestClient();
    }

    @Provides
    @Singleton
    public RestClient provideRestClient() {
        return mRestClient;
    }
}
