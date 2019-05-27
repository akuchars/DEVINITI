package akuchars.domain.store.model;

import javax.persistence.Embeddable;

import kotlin.jvm.internal.Intrinsics;

@Embeddable
public class ProductName {

    private String value;

    public ProductName(String value) {
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.value = value;
    }

    ProductName() {
    }

    public String getValue() {
        return value;
    }
}
