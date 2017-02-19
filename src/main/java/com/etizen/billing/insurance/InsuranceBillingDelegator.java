package com.etizen.billing.insurance;
import java.util.Iterator;
import com.etizen.billing.insurance.dto.BillingDetails;
import com.etizen.billing.insurance.services.InsuranceBillingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Janu on 2/19/2017.
 */
@Component
public class InsuranceBillingDelegator {

    static Logger logger = Logger.getLogger(InsuranceBillingDelegator.class);

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
    public List<String> getBillingPeriods() {
        List<String> list=insuranceBillingService.getBillingPeriods();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            logger.info(iterator.next());
        }
        return list;

    }
}
