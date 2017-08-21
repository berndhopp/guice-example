package de.bhopp;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.guice.annotation.PackagesToScan;
import com.vaadin.guice.server.GuiceVaadinServlet;

import org.vaadin.guice.bus.EnableEventBus;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
@PackagesToScan("de.bhopp")
@EnableEventBus
public class MyUIServlet extends GuiceVaadinServlet {
}
