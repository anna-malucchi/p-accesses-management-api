package it.coopservice.paccessesmanagementapi;

import it.coopservice.omnia.apicontract.quarkus.serverstub.p_accesses_management_api.api.ProcessApi;
import it.coopservice.omnia.apicontract.quarkus.serverstub.p_accesses_management_api.model.Action;
import it.coopservice.omnia.apicontract.quarkus.serverstub.p_accesses_management_api.model.IdCmds;
import it.coopservice.paccessesmanagementapi.services.PAccessesManagementService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class PAccessesManagementController implements ProcessApi {

    @Inject
    PAccessesManagementService pAccessesManagementService;

    @Override
    public Response processKronotechStandardV1CmdsNumberidNumberidPost(Integer numberid, @Valid Action action) {
       return null;
    }

    @Override
    public Response processKronotechStandardV1DeviceinfoNumberidNumberidGet(Integer numberid, String idTerminal) {
        return null;
    }

    @Override
    public Response processKronotechStandardV1ExecutionstateNumberidNumberidPost(Integer numberid, @Valid IdCmds idCmds) {
        return null;
    }

    @Override
    public Response processKronotechStandardV1InfoNumberidNumberidGet(Integer numberid) {
        return pAccessesManagementService.deviceInfoGet(numberid);
    }
}