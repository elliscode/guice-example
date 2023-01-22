package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ContactFactory;
import com.example.ContactFactoryModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ContactTest {

    Injector injector;

    @BeforeEach
    public void setUp() {
        injector = Guice.createInjector(new ContactFactoryModule());
    }

    @Test
    public void testOne() {
        ContactFactory factory = injector.getInstance(ContactFactory.class);
        factory.create("Jenny", 8675309);
        factory.create("Ghost Busters", 5552368);
        assert (2 == factory.getList().size());
        assert ("Jenny".equals(factory.getList().get(0).getContactName()));
        assert ("Ghost Busters".equals(factory.getList().get(1).getContactName()));
    }

    @Test
    public void testTwo() {
        ContactFactory factory = injector.getInstance(ContactFactory.class);
        factory.create("Turk Turkleton", 22558875);
        factory.create("Sir Mix-a-lot", 6492568);
        factory.create("Alicia Keys", 4894608);
        assert (3 == factory.getList().size());
        assert ("Turk Turkleton".equals(factory.getList().get(0).getContactName()));
        assert ("Sir Mix-a-lot".equals(factory.getList().get(1).getContactName()));
        assert ("Alicia Keys".equals(factory.getList().get(2).getContactName()));
    }
}
