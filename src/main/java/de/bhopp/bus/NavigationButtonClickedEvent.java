package de.bhopp.bus;

public class NavigationButtonClickedEvent {
    private final String uriFragment;

    public NavigationButtonClickedEvent(String uriFragment) {
        this.uriFragment = uriFragment;
    }

    public String getUriFragment() {
        return uriFragment;
    }
}
