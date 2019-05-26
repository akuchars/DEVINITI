package akuchars.domain.store.model;

import javax.persistence.Embeddable;

@Embeddable
public class ProductName {

    private String value;

    public ProductName(String value) {
        this.value = value;
    }

    ProductName() {
    }

    public String getValue() {
        return value;
    }
}
