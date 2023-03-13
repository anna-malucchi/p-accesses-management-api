package it.coopservice.paccessesmanagementapi.utils;

import it.coopservice.omnia.apicontract.quarkus.serverstub.p_accesses_management_api.model.ResponseInfoLicense;

import javax.enterprise.context.ApplicationScoped;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Optional;

@ApplicationScoped
public class ConvertKronotechResponse {


    public ResponseInfoLicense convertKronotechInfo(ArrayList<String> responseKronotech){
        ResponseInfoLicense responseInfoLicense= new ResponseInfoLicense();

        responseInfoLicense.setResponse(Optional.of(responseKronotech.get(0)).orElse(""));
        responseInfoLicense.setDescriptionResponse(Optional.of(responseKronotech.get(1)).orElse(""));
        responseInfoLicense.setExecutionTime(Optional.of(responseKronotech.get(2)).map(tmp->Long.parseLong(tmp)).orElse(null));
        responseInfoLicense.setSystemDateTime(Optional.of(responseKronotech.get(3)).map(tmp->OffsetDateTime.parse(tmp)).orElse(null));
        responseInfoLicense.setNumberid(Optional.of(responseKronotech.get(4)).map(tmp->Integer.parseInt(tmp)).orElse(null));
        responseInfoLicense.setAdditionalInfoNumber(Optional.of(responseKronotech.get(4)).map(tmp->Integer.parseInt(tmp)).orElse(null));
        responseInfoLicense.setVersionWebService(Optional.of(responseKronotech.get(6)).orElse(""));
        responseInfoLicense.setFileTimeWebService(Optional.of(responseKronotech.get(7)).map(tmp->OffsetDateTime.parse(tmp)).orElse(null));
        responseInfoLicense.setLicenseCompany(Optional.of(responseKronotech.get(8)).orElse(""));
        responseInfoLicense.setExpirationLicense(Optional.of(responseKronotech.get(9)).map(tmp->LocalDate.parse(tmp)).orElse(null));
//        responseInfoLicense.setCheckModuleDoc();
//        responseInfoLicense.setCheckModulReception();
//        responseInfoLicense.setCheckModulPowershield();
//        responseInfoLicense.setCheckModulSmartdevice();
//        responseInfoLicense.setCheckModulDigitalgate();

        return responseInfoLicense;



    }
}
