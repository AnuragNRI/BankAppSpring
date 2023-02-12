package org.antwalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String Name;
    private String Username;
    private String Password;
    
    @Autowired
    @Qualifier("saving")
    Account acc;
    public void display()
    {
    	System.out.println(" The account is "+acc.showAccont());
    }
}
