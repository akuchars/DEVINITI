package akuchars.domain.store.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -578039089L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final akuchars.domain.common.QAbstractJpaEntity _super = new akuchars.domain.common.QAbstractJpaEntity(this);

    public final EnumPath<Color> color = createEnum("color", Color.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProductName name;

    public final QPrice price;

    public final EnumPath<ProductStatus> status = createEnum("status", ProductStatus.class);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.name = inits.isInitialized("name") ? new QProductName(forProperty("name")) : null;
        this.price = inits.isInitialized("price") ? new QPrice(forProperty("price")) : null;
    }

}

