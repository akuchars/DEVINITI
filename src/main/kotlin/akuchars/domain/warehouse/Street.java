package akuchars.domain.warehouse;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import akuchars.domain.common.AbstractJpaEntity;
import kotlin.jvm.internal.Intrinsics;

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
