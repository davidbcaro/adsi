package co.edu.sena.eon_jpa.model.jpa.entities;

import co.edu.sena.eon_jpa.model.jpa.entities.CurrentQuarter;
import co.edu.sena.eon_jpa.model.jpa.entities.Schedule;
import co.edu.sena.eon_jpa.model.jpa.entities.VersionPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-06T09:21:14")
@StaticMetamodel(Version.class)
public class Version_ { 

    public static volatile CollectionAttribute<Version, Schedule> scheduleCollection;
    public static volatile SingularAttribute<Version, VersionPK> versionPK;
    public static volatile SingularAttribute<Version, CurrentQuarter> currentQuarter;
    public static volatile SingularAttribute<Version, Boolean> active;

}