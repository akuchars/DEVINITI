package akuchars.domain.store.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClientAddress is a Querydsl query type for ClientAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClientAddress extends EntityPathBase<ClientAddress> {

    private static final long serialVersionUID = 381588361L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClientAddress clientAddress = new QClientAddress("clientAddress");

    public final akuchars.domain.QAbstractJpaEntity _super = new akuchars.domain.QAbstractJpaEntity(this);

    public final StringPath buildingNumber = createString("buildingNumber");

    public final QCity city;

    public final QCountry country;

    public final StringPath flatNumber = createString("flatNumber");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QPostalCode postalCode;

    public final StringPath street = createString("street");

    public QClientAddress(String variable) {
        this(ClientAddress.class, forVariable(variable), INITS);
    }

    public QClientAddress(Path<? extends ClientAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClientAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClientAddress(PathMetadata metadata, PathInits inits) {
        this(ClientAddress.class, metadata, inits);
    }

    public QClientAddress(Class<? extends ClientAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city")) : null;
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country")) : null;
        this.postalCode = inits.isInitialized("postalCode") ? new QPostalCode(forProperty("postalCode")) : null;
    }

}

