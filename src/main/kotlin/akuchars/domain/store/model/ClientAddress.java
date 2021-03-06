package akuchars.domain.store.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import akuchars.domain.common.AbstractJpaEntity;
import akuchars.kernel.ApplicationProperties;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Access(AccessType.FIELD)
@Table(schema = ApplicationProperties.STORE_SCHEMA_NAME, name = "client_addresses")
public class ClientAddress extends AbstractJpaEntity {

    private String street;
    private String buildingNumber;
    private String flatNumber;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "postalCode", column = @Column(name = "postalCode"))
    })
    private PostalCode postalCode;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column(name = "city"))
    })
    private City city;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "country"))
    })
    private Country country;

    ClientAddress() {
    }

    public ClientAddress(String street, String buildingNumber, String flatNumber, PostalCode postalCode, City city, Country country) {
        Intrinsics.checkParameterIsNotNull(street, "street");
        Intrinsics.checkParameterIsNotNull(buildingNumber, "buildingNumber");
        Intrinsics.checkParameterIsNotNull(flatNumber, "flatNumber");
        Intrinsics.checkParameterIsNotNull(postalCode, "postalCode");
        Intrinsics.checkParameterIsNotNull(city, "city");
        Intrinsics.checkParameterIsNotNull(country, "country");
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
