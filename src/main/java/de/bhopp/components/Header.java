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
    Header(@NavigableViewClasses Map<Class<? extends View>, String> navigableViewClasses) {

        for (String uriFragment : navigableViewClasses.values()) {
            Button navigationButton = new Button(
                    "navigate to '" + uriFragment + "'",
                    e -> getUI().getNavigator().navigateTo(uriFragment)
            );

            addComponent(navigationButton);
        }
    }
}
