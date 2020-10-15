package com.ensode.jpa;

import com.ensode.jpa.Customer;
import com.ensode.jpa.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T12:38:06")
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, String> orderNumber;
    public static volatile CollectionAttribute<CustomerOrder, Item> itemCollection;
    public static volatile SingularAttribute<CustomerOrder, Integer> customerOrderId;
    public static volatile SingularAttribute<CustomerOrder, String> orderDescription;
    public static volatile SingularAttribute<CustomerOrder, Customer> customer;

}