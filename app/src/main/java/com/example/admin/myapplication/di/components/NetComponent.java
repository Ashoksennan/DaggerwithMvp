package com.example.admin.myapplication.di.components;

import com.example.admin.myapplication.di.modules.AppModule;
import com.example.admin.myapplication.di.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}