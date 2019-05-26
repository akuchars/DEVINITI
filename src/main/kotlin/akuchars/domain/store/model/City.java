package akuchars.domain.store.model;

import javax.persistence.Embeddable;

@Embeddable
public class City {
    private String city;

    public City(String city) {
        this.city = city;
    }

    City() {
    }
}
