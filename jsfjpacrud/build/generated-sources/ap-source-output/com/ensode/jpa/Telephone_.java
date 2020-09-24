package com.ensode.jpa;

import com.ensode.jpa.Customer;
import com.ensode.jpa.TelephoneType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(Telephone.class)
public class Telephone_ { 

    public static volatile SingularAttribute<Telephone, String> telephoneNumber;
    public static volatile SingularAttribute<Telephone, TelephoneType> telephoneType;
    public static volatile SingularAttribute<Telephone, Integer> telephoneId;
    public static volatile SingularAttribute<Telephone, Customer> customer;

}