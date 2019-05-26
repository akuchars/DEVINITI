package akuchars.domain.store.model;

import javax.persistence.Embeddable;

@Embeddable
public class OrderItemsAmount {

    private long amount;

    public OrderItemsAmount(long amount) {
        this.amount = amount;
    }

    OrderItemsAmount() {
    }

    public long getAmount() {
        return amount;
    }
}
