package de.bhopp.hooks;

import com.vaadin.server.BootstrapFragmentResponse;
import com.vaadin.server.BootstrapListener;
import com.vaadin.server.BootstrapPageResponse;

public class BootStrapListener implements BootstrapListener {
    @Override
    public void modifyBootstrapFragment(BootstrapFragmentResponse bootstrapFragmentResponse) {
        System.out.println("in modifyBootStrapFragment");
    }

    @Override
    public void modifyBootstrapPage(BootstrapPageResponse bootstrapPageResponse) {
        System.out.println("in modifyBootStrapPage");
    }
}
