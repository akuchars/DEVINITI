package akuchars.domain.store.model;

import com.mysema.commons.lang.Assert;
import kotlin.jvm.internal.Intrinsics;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Price {

    private BigDecimal value;

    public Price(BigDecimal price) {
        Intrinsics.checkParameterIsNotNull(price, "price");
        Assert.isTrue(price.compareTo(BigDecimal.ZERO) > 0, "Price must be positive");
        this.value = price;
    }

    Price() {
    }

    public BigDecimal getValue() {
        return value;
    }
}
