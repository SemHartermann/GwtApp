package com.mycompany.mywebapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class HelloWorld implements EntryPoint {
    public void onModuleLoad() {

        RootPanel.get().add(new Label("Hello,world!"));

    }
}
