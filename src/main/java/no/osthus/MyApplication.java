package no.osthus;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        System.out.println("MyApplication started!");
        packages("no.osthus.rest");
    }
}
