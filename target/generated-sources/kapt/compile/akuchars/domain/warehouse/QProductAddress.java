package akuchars.domain.warehouse;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductAddress is a Querydsl query type for ProductAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProductAddress extends EntityPathBase<ProductAddress> {

    private static final long serialVersionUID = -165073954L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductAddress productAddress = new QProductAddress("productAddress");

    public final akuchars.domain.QAbstractJpaEntity _super = new akuchars.domain.QAbstractJpaEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final akuchars.domain.store.model.QProduct product;

    public final QProductAmount productAmount;

    public final QShelf shelf;

    public final QStillage stillage;

    public final QStreet street;

    public QProductAddress(String variable) {
        this(ProductAddress.class, forVariable(variable), INITS);
    }

    public QProductAddress(Path<? extends ProductAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductAddress(PathMetadata metadata, PathInits inits) {
        this(ProductAddress.class, metadata, inits);
    }

    public QProductAddress(Class<? extends ProductAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new akuchars.domain.store.model.QProduct(forProperty("product"), inits.get("product")) : null;
        this.productAmount = inits.isInitialized("productAmount") ? new QProductAmount(forProperty("productAmount")) : null;
        this.shelf = inits.isInitialized("shelf") ? new QShelf(forProperty("shelf")) : null;
        this.stillage = inits.isInitialized("stillage") ? new QStillage(forProperty("stillage")) : null;
        this.street = inits.isInitialized("street") ? new QStreet(forProperty("street")) : null;
    }

}

