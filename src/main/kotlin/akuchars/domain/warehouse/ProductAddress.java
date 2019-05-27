package akuchars.domain.warehouse;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mysema.commons.lang.Assert;

import akuchars.domain.common.AbstractJpaEntity;
import akuchars.domain.store.model.Product;
import akuchars.kernel.ApplicationProperties;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Table(schema = ApplicationProperties.WAREHOUSE_SCHEMA_NAME, name = "product_addresses")
@Access(AccessType.FIELD)
public class ProductAddress extends AbstractJpaEntity {

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "street_id")
    private Street street;

    @OneToOne
    @JoinColumn(name = "stillage_id")
    private Stillage stillage;

    @OneToOne
    @JoinColumn(name = "shelf_id")
    private Shelf shelf;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "amount"))
    })
    private ProductAmount productAmount;

    public ProductAddress(Product product, Street street, Stillage stillage, Shelf shelf, ProductAmount productAmount) {
        Intrinsics.checkParameterIsNotNull(product, "product");
        Intrinsics.checkParameterIsNotNull(street, "street");
        Intrinsics.checkParameterIsNotNull(stillage, "stillage");
        Intrinsics.checkParameterIsNotNull(shelf, "shelf");
        Intrinsics.checkParameterIsNotNull(productAmount, "productAmount");
        this.product = product;
        this.street = street;
        this.stillage = stillage;
        this.shelf = shelf;
        this.productAmount = productAmount;
    }

    ProductAddress() {
    }

    public Product getProduct() {
        return product;
    }

    public Street getStreet() {
        return street;
    }

    public Stillage getStillage() {
        return stillage;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public ProductAmount getProductAmount() {
        return productAmount;
    }

    public ProductAddress decreaseProductAmount(long number) {
        Assert.isTrue(number > 0, "Number must be positive");
        this.productAmount = new ProductAmount(productAmount.getAmount() - number);
        return this;
    }
}
