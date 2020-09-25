package com.ensode.jpa;

import com.ensode.jpa.CustomerOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Integer> itemId;
    public static volatile SingularAttribute<Item, String> itemNumber;
    public static volatile CollectionAttribute<Item, CustomerOrder> customerOrderCollection;
    public static volatile SingularAttribute<Item, String> itemLongDesc;
    public static volatile SingularAttribute<Item, String> itemShortDesc;

}