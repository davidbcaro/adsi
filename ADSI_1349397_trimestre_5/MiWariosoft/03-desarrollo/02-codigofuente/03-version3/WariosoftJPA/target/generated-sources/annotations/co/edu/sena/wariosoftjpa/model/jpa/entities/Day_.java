package co.edu.sena.wariosoftjpa.model.jpa.entities;

import co.edu.sena.wariosoftjpa.model.jpa.entities.Availability;
import co.edu.sena.wariosoftjpa.model.jpa.entities.Schedule;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T07:37:01")
@StaticMetamodel(Day.class)
public class Day_ { 

    public static volatile CollectionAttribute<Day, Schedule> scheduleCollection;
    public static volatile SingularAttribute<Day, String> nameDay;
    public static volatile CollectionAttribute<Day, Availability> availabilityCollection;
    public static volatile SingularAttribute<Day, Boolean> state;

}