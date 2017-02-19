package com.etizen.billing.insurance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Janu on 2/19/2017.
 */
public class App {

    public static void main(String args[]) {


        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-billing-config.xml"});

        InsuranceBillingDelegator delegator = (InsuranceBillingDelegator)context.getBean("insuranceBillingDelegator");
        //InsuranceBillingDelegator delegator = new InsuranceBillingDelegator();
        delegator.getCurrentBillingInfo();
        delegator.getBillingHistory();
        System.out.println("Successfully executed..");
    }


}
