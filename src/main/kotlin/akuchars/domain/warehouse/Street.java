package akuchars.domain.warehouse;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import akuchars.domain.common.AbstractJpaEntity;
import akuchars.kernel.ApplicationProperties;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Access(AccessType.FIELD)
@Table(schema = ApplicationProperties.WAREHOUSE_SCHEMA_NAME, name = "streets")
public class Street extends AbstractJpaEntity {

    private String name;

    Street() {
    }

    public Street(String name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        this.name = name;
    }
}
