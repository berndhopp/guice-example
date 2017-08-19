package de.bhopp.components;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.NavigableViewClasses;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

import java.util.Map;

@UIScope
class Header extends HorizontalLayout{

    @Inject
    Header(@NavigableViewClasses Map<String, Class<? extends View>> navigableViewClasses) {

        for (String uriFragment : navigableViewClasses.keySet()) {
            Button navigationButton = new Button(
                    "navigate to '" + uriFragment + "'",
                    e -> getUI().getNavigator().navigateTo(uriFragment)
            );

            addComponent(navigationButton);
        }
    }
}
