package com.etizen.billing.insurance;

import com.etizen.billing.insurance.services.BillingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Janu on 2/19/2017.
 */
public class App {

    public static void main(String args[]) {


        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-billing-config.xml"});
        BillingService service = (BillingService)context.getBean("billingService");
        service.getCurrentBillingInfo();
        service.getBillingHistory();
        System.out.println("Successfully executed..");

        service.getBillingPeriods();
    }


}
