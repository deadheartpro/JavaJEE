package com.ensode.jpa;

import com.ensode.jpa.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(AddressType.class)
public class AddressType_ { 

    public static volatile CollectionAttribute<AddressType, Address> addressCollection;
    public static volatile SingularAttribute<AddressType, Character> addressTypeCode;
    public static volatile SingularAttribute<AddressType, Integer> addressTypeId;
    public static volatile SingularAttribute<AddressType, String> addressTypeText;

}