package it.coopservice.paccessesmanagementapi.services;

import com.fasterxml.jackson.core.JsonParser;
import it.coopservice.omnia.apicontract.quarkus.serverstub.p_accesses_management_api.model.Action;
import it.coopservice.omnia.apicontract.quarkus.serverstub.p_accesses_management_api.model.ResponseInfoLicense;
import it.coopservice.paccessesmanagementapi.utils.ConvertKronotechResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@ApplicationScoped
public class PAccessesManagementService {

    @RestClient
    @Inject
    RestClientKronotech restClientKronotech;

    @Inject
    ConvertKronotechResponse convertKronotechResponse;

    public Response deviceInfoGet(Integer numberid) {
//        String requestKronotech = "{\n" +
//                "    \"CallFunction\": {\n" +
//                "        \"parms\": [\n" +
//                "            \"KRONOTECH\",\n" +
//                "            \"STANDARD\",\n" +
//                "            \"GetInfo\",\n" +
//                numberid + ",\n" +
//                "        ]\n" +
//                "    }\n" +
//                "}";

        String requestKronotech ="{\n" +
                "    \"CallFunction\": {\n" +
                "        \"parms\": [\n" +
                "            \"KRONOTECH\",\n" +
                "            \"STANDARD\",\n" +
                "            \"GetInfo\",\n" +
                "            \"123456\"\n" +
                "        ]\n" +
                "    }\n" +
                "}";

                String responseKronotech = restClientKronotech.kronotechStandardInfoPost(requestKronotech);

//        ResponseInfoLicense responseInfoLicense = convertKronotechResponse.convertKronotechInfo(responseKronotech);

//        return Response
//                .ok(responseInfoLicense)
//                .build();
        return Response.ok(responseKronotech).build();


    }


}
