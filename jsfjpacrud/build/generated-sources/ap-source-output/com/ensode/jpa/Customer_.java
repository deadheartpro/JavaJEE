package com.ensode.jpa;

import com.ensode.jpa.Address;
import com.ensode.jpa.CustomerOrder;
import com.ensode.jpa.Telephone;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile CollectionAttribute<Customer, Address> addressCollection;
    public static volatile CollectionAttribute<Customer, CustomerOrder> customerOrderCollection;
    public static volatile SingularAttribute<Customer, Integer> customerId;
    public static volatile SingularAttribute<Customer, String> middleName;
    public static volatile CollectionAttribute<Customer, Telephone> telephoneCollection;
    public static volatile SingularAttribute<Customer, String> email;

}