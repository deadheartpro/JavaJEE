package com.ensode.jpa;

import com.ensode.jpa.UsState;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T12:38:06")
@StaticMetamodel(UsCity.class)
public class UsCity_ { 

    public static volatile SingularAttribute<UsCity, String> zip;
    public static volatile SingularAttribute<UsCity, String> usCityNm;
    public static volatile SingularAttribute<UsCity, Integer> usCityId;
    public static volatile SingularAttribute<UsCity, UsState> usState;

}