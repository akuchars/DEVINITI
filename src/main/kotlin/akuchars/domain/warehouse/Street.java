package akuchars.domain.warehouse;

import akuchars.domain.AbstractJpaEntity;
import kotlin.jvm.internal.Intrinsics;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(schema = "warehouse", name = "streets")
public class Street extends AbstractJpaEntity {

    private String name;

    Street() {
    }

    public Street(String name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        this.name = name;
    }
}
