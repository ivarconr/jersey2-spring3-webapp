package no.osthus.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import no.osthus.services.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Provider
public class GlobalExceptionMapper implements ExceptionMapper<Exception> {

    @Autowired
    private RandomService randomService;

    public GlobalExceptionMapper() {
//        this.randomService = randomService;
        System.out.println("GlobalExceptionMapper wired up");
    }

    @Override
    public Response toResponse(Exception e) {
        String random = randomService != null ? randomService.getRandomAlphabetic() : "empty";
        return Response.status(Response.Status.BAD_REQUEST).entity(random).build();
    }
}
