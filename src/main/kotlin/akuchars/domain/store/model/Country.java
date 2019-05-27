package akuchars.domain.store.model;

import javax.persistence.Embeddable;

import kotlin.jvm.internal.Intrinsics;

@Embeddable
public class Country {

    private String country;

    public Country(String country) {
        Intrinsics.checkParameterIsNotNull(country, "country");
        this.country = country;
    }

    Country() {
    }
}
