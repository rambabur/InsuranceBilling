package com.etizen.billing.insurance.services;

import com.etizen.billing.insurance.dao.BillingDao;
import com.etizen.billing.insurance.dto.BillingDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by Janu on 2/19/2017.
 */
@Component
public class BillingService {


    static Logger logger = Logger.getLogger(BillingService.class);

    @Autowired
    private BillingDao billingDao;

    public BillingDetails getCurrentBillingInfo() {
        return billingDao.getCurrentTermBillDetails();
    }

    public List<BillingDetails> getBillingHistory() {
        return billingDao.getBilligDetailsHistory();
    }

    public void setInsuranceBillingService(BillingDao billingDao) {
        this.billingDao = billingDao;
    }

    public List<String> getBillingPeriods() {
        List<String> list = billingDao.getBillingPeriods();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            logger.info(iterator.next());
        }
        logger.info("Logged success");
        return list;

    }
}
