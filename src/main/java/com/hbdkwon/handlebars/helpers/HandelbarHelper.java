package com.hbdkwon.handlebars.helpers;

import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

@HandlebarsHelper
public class HandelbarHelper {

    public String sayHello(String name) {
        return String.format("Hello %s!", name);
    }

    public String sayGlad(String name) {
        return String.format("Glad to meet to %s!", name);
    }

    public String sayLook(String name) {
        return String.format("Look so great~~ %s!", name);
    }
}
