package it.coopservice.paccessesmanagementapi.services;


import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RegisterRestClient(configKey = "kronotech-standard")
@ApplicationScoped
public interface RestClientKronotech {

    @POST
    @Consumes({"application/json; charset=utf-8"})
    @Produces({"application/json; charset=utf-8"})
    @GeneratedMethod("kronotechStandardInfoPost")
    public String kronotechStandardInfoPost(
            String stringBody
    );

}
