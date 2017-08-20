package de.bhopp.components;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.NavigableViewClasses;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

import de.bhopp.bus.NavigationButtonClickedEvent;

import org.vaadin.guice.bus.GlobalEventBus;
import org.vaadin.guice.bus.UIEventBus;

import java.util.Map;

@UIScope
class Header extends HorizontalLayout{

    @Inject
    Header(@NavigableViewClasses Map<String, Class<? extends View>> navigableViewClasses, UIEventBus uiEventBus, GlobalEventBus globalEventBus) {

        for (String uriFragment : navigableViewClasses.keySet()) {
            Button navigationButton = new Button(
                    "navigate to '" + uriFragment + "'",
                    e -> uiEventBus.post(new NavigationButtonClickedEvent(uriFragment))
            );

            addComponent(navigationButton);
        }

        addComponent(new Button(
            "fire global event",
            e -> globalEventBus.post(new GlobalEvent()))
        );
    }
}
