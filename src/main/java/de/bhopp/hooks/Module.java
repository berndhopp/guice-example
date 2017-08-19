package de.bhopp.hooks;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        System.out.println("in configure()");
    }
}
