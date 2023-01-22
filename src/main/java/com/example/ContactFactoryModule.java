package com.example;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ContactFactoryModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ContactFactory.class).in(Singleton.class);
    }
}