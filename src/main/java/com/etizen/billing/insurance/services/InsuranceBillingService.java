package com.etizen.billing.insurance.services;

import com.etizen.billing.insurance.dto.BillingDetails;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Janu on 2/19/2017.
 */
@Component
public class InsuranceBillingService {

    static Logger logger = Logger.getLogger(InsuranceBillingService.class);

    public BillingDetails getCurrentTermBillDetails() {
        return getCurrentBillingPeriodDetails();
    }

    public List<BillingDetails> getBilligDetailsHistory() {
        return populateBillingHistory();
    }

    private List<BillingDetails> populateBillingHistory() {

        logger.info("Start getting Billing history...");
        List<BillingDetails> bills = new ArrayList<BillingDetails>();

        try {
            BillingDetails billingDetails1 = getCurrentBillingPeriodDetails();
            bills.add(billingDetails1);

            BillingDetails billingDetails2 = new BillingDetails();
            billingDetails2.setBillStartDate(getDateInMMDDYYYY(2016, 7, 1));
            billingDetails2.setBillEndDate(getDateInMMDDYYYY(2016, 12, 31));
            billingDetails2.setBillDueDate(getDateInMMDDYYYY(2016, 7, 15));
            billingDetails2.setBillDesc("Billing for July to December 2016");
            billingDetails2.setBillingStatus("Paid");
            billingDetails2.setTotalDueAmt(new BigDecimal("602.00"));
            bills.add(billingDetails2);

            logger.info("Total Bills Generated. " + bills.size());
        } catch (Exception ex) {
            logger.error("Exceptiopn has occured...");
        }

        logger.info("Successfully retrieved billing history...");
        return bills;
    }

    private BillingDetails getCurrentBillingPeriodDetails() {
        logger.info("Start getCurrentBillingPeriodDetails..");
        BillingDetails billingDetails1 = new BillingDetails();
        billingDetails1.setBillStartDate(getDateInMMDDYYYY(2017, 1, 1));
        billingDetails1.setBillEndDate(getDateInMMDDYYYY(2017, 6, 30));
        billingDetails1.setBillDueDate(getDateInMMDDYYYY(2017, 1, 15));
        billingDetails1.setBillDesc("Billing for Jan to June 2017");
        billingDetails1.setBillingStatus("Paid");
        billingDetails1.setTotalDueAmt(new BigDecimal("660.00"));
        logger.info("Successfully retrieved getCurrentBillingPeriodDetails ...");
        return billingDetails1;
    }

    private Date getDateInMMDDYYYY(int year, int month, int day) {

        // DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }

    public List<String> getBillingPeriods() {
        List<String> list = new ArrayList<String>();
        list.add("01/1/2016 to 06/01/2016");
        list.add("07/1/2016 to 12/01/2016");
        list.add("01/01/2017 to 06/01/2017");
        return list;
    }
}
