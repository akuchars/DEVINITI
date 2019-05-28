package akuchars.domain.store.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClient is a Querydsl query type for Client
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClient extends EntityPathBase<Client> {

    private static final long serialVersionUID = -1504923157L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClient client = new QClient("client");

    public final akuchars.domain.common.QAbstractJpaEntity _super = new akuchars.domain.common.QAbstractJpaEntity(this);

    public final QClientAddress address;

    public final QEmail email;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath surname = createString("surname");

    public QClient(String variable) {
        this(Client.class, forVariable(variable), INITS);
    }

    public QClient(Path<? extends Client> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClient(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClient(PathMetadata metadata, PathInits inits) {
        this(Client.class, metadata, inits);
    }

    public QClient(Class<? extends Client> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QClientAddress(forProperty("address"), inits.get("address")) : null;
        this.email = inits.isInitialized("email") ? new QEmail(forProperty("email")) : null;
    }

}

