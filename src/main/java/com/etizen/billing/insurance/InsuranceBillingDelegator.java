package com.etizen.billing.insurance;

import com.etizen.billing.insurance.dto.BillingDetails;
import com.etizen.billing.insurance.services.InsuranceBillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Janu on 2/19/2017.
 */
@Component
public class InsuranceBillingDelegator {

    @Autowired
    private InsuranceBillingService insuranceBillingService;

    public BillingDetails getCurrentBillingInfo() {
        return insuranceBillingService.getCurrentTermBillDetails();
    }

    public List<BillingDetails> getBillingHistory() {
        return insuranceBillingService.getBilligDetailsHistory();
    }

    public void setInsuranceBillingService(InsuranceBillingService insuranceBillingService) {
        this.insuranceBillingService = insuranceBillingService;
    }
}
