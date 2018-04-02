package com.example.android.androidmvpdagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Void inject(MainActivity target);

}
