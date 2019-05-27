package akuchars.domain.store.model;

import javax.persistence.Embeddable;

import com.mysema.commons.lang.Assert;

@Embeddable
public class OrderItemsAmount {

    private long amount;

    public OrderItemsAmount(long amount) {
        Assert.isTrue(amount >= 0, "Amount must be positive");
        this.amount = amount;
    }

    OrderItemsAmount() {
    }

    public long getAmount() {
        return amount;
    }
}
