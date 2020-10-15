package com.ensode.jpa;

import com.ensode.jpa.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T12:38:06")
@StaticMetamodel(AppUser.class)
public class AppUser_ { 

    public static volatile SingularAttribute<AppUser, String> password;
    public static volatile CollectionAttribute<AppUser, UserRole> userRoleCollection;
    public static volatile SingularAttribute<AppUser, Integer> appUserId;
    public static volatile SingularAttribute<AppUser, String> userName;

}