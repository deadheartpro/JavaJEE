package com.ensode.jpa;

import com.ensode.jpa.Telephone;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(TelephoneType.class)
public class TelephoneType_ { 

    public static volatile SingularAttribute<TelephoneType, Character> telephoneTypeCd;
    public static volatile CollectionAttribute<TelephoneType, Telephone> telephoneCollection;
    public static volatile SingularAttribute<TelephoneType, Integer> telephoneTypeId;
    public static volatile SingularAttribute<TelephoneType, String> telephoneTypeText;

}