package com.ensode.jpa;

import com.ensode.jpa.AddressType;
import com.ensode.jpa.Customer;
import com.ensode.jpa.UsState;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T12:38:06")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> zip;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> addrLine2;
    public static volatile SingularAttribute<Address, AddressType> addressType;
    public static volatile SingularAttribute<Address, String> addrLine1;
    public static volatile SingularAttribute<Address, UsState> usState;
    public static volatile SingularAttribute<Address, Integer> addressId;
    public static volatile SingularAttribute<Address, Customer> customer;

}