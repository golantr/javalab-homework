package lab.lab05.model;

import lab.lab05.CustomerBrokenException;
import lab.lab05.aop.AopLog;

public class ApuBar implements Bar {

    public Squishee sellSquishee(Customer customer) {
        if (customer.isBroke()) {
            throw new CustomerBrokenException();
        }
        AopLog.append("Here is your Squishee \n");
        return new Squishee("Usual Squishee");
    }
}