package co.edu.sena.wariosoftjpa.model.jpa.entities;

import co.edu.sena.wariosoftjpa.model.jpa.entities.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T07:37:01")
@StaticMetamodel(Document.class)
public class Document_ { 

    public static volatile SingularAttribute<Document, String> idDocument;
    public static volatile SingularAttribute<Document, String> name;
    public static volatile CollectionAttribute<Document, Client> clientCollection;
    public static volatile SingularAttribute<Document, Boolean> state;

}