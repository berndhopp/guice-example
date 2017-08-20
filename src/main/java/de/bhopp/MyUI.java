package de.bhopp;

import com.google.common.eventbus.Subscribe;

import com.vaadin.annotations.Theme;
import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import de.bhopp.bus.NavigationButtonClickedEvent;
import de.bhopp.components.Content;
import de.bhopp.components.ViewContainer;
import de.bhopp.views.ErrorView;

@Theme("mytheme")
@GuiceUI(content = Content.class, viewContainer = ViewContainer.class, errorView = ErrorView.class)
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    }

    @Subscribe
    public void onNavigationButtonClicked(NavigationButtonClickedEvent e){
        getNavigator().navigateTo(e.getUriFragment());
    }

}
