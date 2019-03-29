package com.github.daggerok;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static java.util.Collections.singletonMap;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("api")
@ApplicationScoped
@Produces(APPLICATION_JSON)
public class HelloResource {

  @GET
  @Path("hello")
  public Response get() {
    return Response.ok(singletonMap("hello", "world")).build();
  }
}
