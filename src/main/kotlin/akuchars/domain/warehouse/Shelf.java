package akuchars.domain.warehouse;


import akuchars.domain.AbstractJpaEntity;
import kotlin.jvm.internal.Intrinsics;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(schema = "warehouse", name = "shelves")
public class Shelf extends AbstractJpaEntity {
    private String name;

    Shelf() {
    }

    public Shelf(String name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        this.name = name;
    }
}