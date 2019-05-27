package akuchars.domain.store.model;


import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationEventPublisher;

import akuchars.domain.common.AbstractJpaEntity;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Access(AccessType.FIELD)
@Table(schema = "store", name = "products")
public class Product extends AbstractJpaEntity {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "name"))
    })
    private ProductName name;

    @Enumerated(EnumType.STRING)
    private Color color;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "price"))
    })
    private Price price;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    public Product(ProductName name, Color color, Price price) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(color, "colorDto");
        Intrinsics.checkParameterIsNotNull(price, "price");
        this.name = name;
        this.color = color;
        this.price = price;
        this.status = ProductStatus.NEW;
    }

    Product() {
    }

    public ProductName getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Price getPrice() {
        return price;
    }

    public ProductStatus getStatus() {
        return status;
    }

    @NotNull
    public Product markToBuy(@NotNull ApplicationEventPublisher applicationEventPublisher, @NotNull BigDecimal price) {
        Intrinsics.checkParameterIsNotNull(applicationEventPublisher, "applicationEventPublisher");
        Intrinsics.checkParameterIsNotNull(price, "price");
        this.price = new Price(price);
        this.status = ProductStatus.TO_BUY;
        return this;
    }

    @NotNull
    public Product markInWarehouse(@NotNull ApplicationEventPublisher applicationEventPublisher) {
        this.status = ProductStatus.IN_WAREHOUSE;
        return this;
    }

    //todo to musi być zmieniane w ewvencie podczas tworzenia zamówienia
    public Product markAsSold() {
        this.status = ProductStatus.SOLD;
        return this;
    }

    public boolean isReadyToBuy() {
        return this.status == ProductStatus.TO_BUY;
    }

}
