package de.bhopp.components;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

@UIScope
public class Content extends VerticalLayout {

    @Inject
    Content(Header header, ViewContainer viewContainer){
        addComponents(header, viewContainer);
        setSizeFull();
        setExpandRatio(viewContainer, 1);
    }
}
