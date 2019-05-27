package akuchars.domain.store.model;

import akuchars.domain.AbstractJpaEntity;
import kotlin.jvm.internal.Intrinsics;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(schema = "store", name = "client_addresses")
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
