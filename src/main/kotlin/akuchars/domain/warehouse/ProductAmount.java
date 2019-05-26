package akuchars.domain.warehouse;

import com.mysema.commons.lang.Assert;

import javax.persistence.Embeddable;

@Embeddable
public class ProductAmount {
    private long amount;

    public ProductAmount(long amount) {
        Assert.isTrue(amount > 0, "Amount must be positive");
        this.amount = amount;
    }

    ProductAmount() {
    }

    public long getAmount() {
        return amount;
    }
}
