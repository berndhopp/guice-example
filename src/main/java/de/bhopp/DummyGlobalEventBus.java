package de.bhopp;

import org.vaadin.guice.bus.GlobalEventBus;

public class DummyGlobalEventBus implements GlobalEventBus {
    @Override
    public void register(Object o) {
        System.out.println("in register");
    }

    @Override
    public void unregister(Object o) {
        System.out.println("in unregister");
    }

    @Override
    public void post(Object o) {
        com.vaadin.ui.Notification.show("global event posted");
    }
}
