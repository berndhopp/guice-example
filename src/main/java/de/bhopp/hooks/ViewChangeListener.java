package de.bhopp.hooks;

public class ViewChangeListener implements com.vaadin.navigator.ViewChangeListener {
    @Override
    public boolean beforeViewChange(ViewChangeEvent viewChangeEvent) {
        System.out.println("in beforeViewChange");
        return true;
    }
}
