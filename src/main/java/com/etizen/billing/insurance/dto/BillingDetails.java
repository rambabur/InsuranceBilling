package com.etizen.billing.insurance.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Janu on 2/19/2017.
 */
public class BillingDetails {

    private Date billStartDate;

    private Date billEndDate;

    private Date billDueDate;

    private BigDecimal totalDueAmt;

    private String billDesc;

    private String billingStatus;

    public Date getBillStartDate() {
        return billStartDate;
    }

    public void setBillStartDate(Date billStartDate) {
        this.billStartDate = billStartDate;
    }

    public Date getBillEndDate() {
        return billEndDate;
    }

    public void setBillEndDate(Date billEndDate) {
        this.billEndDate = billEndDate;
    }

    public Date getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(Date billDueDate) {
        this.billDueDate = billDueDate;
    }

    public BigDecimal getTotalDueAmt() {
        return totalDueAmt;
    }

    public void setTotalDueAmt(BigDecimal totalDueAmt) {
        this.totalDueAmt = totalDueAmt;
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }

    public String getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }
}
