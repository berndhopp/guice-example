package de.bhopp.hooks;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinResponse;
import com.vaadin.server.VaadinSession;

import java.io.IOException;

class RequestHandler implements com.vaadin.server.RequestHandler{
    @Override
    public boolean handleRequest(VaadinSession session, VaadinRequest request, VaadinResponse response) throws IOException {
        System.out.println("in handleRequest");
        return false;
    }
}
