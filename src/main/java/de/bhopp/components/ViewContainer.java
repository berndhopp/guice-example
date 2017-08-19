package de.bhopp.components;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Panel;

import org.vaadin.guice.bus.UIEventBus;

@UIScope
public class ViewContainer extends Panel{

    @Inject
    ViewContainer(UIEventBus uiEventBus){
        uiEventBus.register(this);
    }

}
