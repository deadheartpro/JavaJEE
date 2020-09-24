package com.ensode.jpa;

import com.ensode.jpa.AppUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-24T09:54:20")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Integer> roleId;
    public static volatile SingularAttribute<UserRole, String> roleName;
    public static volatile CollectionAttribute<UserRole, AppUser> appUserCollection;

}