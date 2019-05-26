package akuchars.domain.store.model;

import javax.persistence.Embeddable;

@Embeddable
public class Country {

    private String country;

    public Country(String country) {
        this.country = country;
    }

    Country() {
    }
}
