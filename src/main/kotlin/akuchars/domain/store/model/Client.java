package akuchars.domain.store.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import akuchars.domain.common.AbstractJpaEntity;
import akuchars.kernel.ApplicationProperties;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Access(AccessType.FIELD)
@Table(schema = ApplicationProperties.STORE_SCHEMA_NAME, name = "clients")
public class Client extends AbstractJpaEntity {

    private String name;
    private String surname;

    @OneToOne
    @JoinColumn(name = "address_id")
    private ClientAddress address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "email"))
    })
    private Email email;

    public Client(String name, String surname, ClientAddress address, Email email) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(surname, "surname");
        Intrinsics.checkParameterIsNotNull(address, "address");
        Intrinsics.checkParameterIsNotNull(email, "email");
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
    }

    Client() {
    }
}
