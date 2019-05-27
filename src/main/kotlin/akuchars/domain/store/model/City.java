package akuchars.domain.store.model;

import javax.persistence.Embeddable;

import kotlin.jvm.internal.Intrinsics;

@Embeddable
public class City {
    private String city;

    public City(String city) {
        Intrinsics.checkParameterIsNotNull(city, "city");
        this.city = city;
    }

    City() {
    }
}
