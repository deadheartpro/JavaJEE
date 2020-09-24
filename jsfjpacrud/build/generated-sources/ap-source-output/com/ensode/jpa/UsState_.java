package com.ensode.jpa;

import com.ensode.jpa.Address;
import com.ensode.jpa.UsCity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(UsState.class)
public class UsState_ { 

    public static volatile SingularAttribute<UsState, String> usStateNm;
    public static volatile CollectionAttribute<UsState, Address> addressCollection;
    public static volatile CollectionAttribute<UsState, UsCity> usCityCollection;
    public static volatile SingularAttribute<UsState, String> usStateCd;
    public static volatile SingularAttribute<UsState, Integer> usStateId;

}