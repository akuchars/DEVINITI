package akuchars.domain.warehouse;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QShelf is a Querydsl query type for Shelf
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShelf extends EntityPathBase<Shelf> {

    private static final long serialVersionUID = -1662314959L;

    public static final QShelf shelf = new QShelf("shelf");

    public final akuchars.domain.common.QAbstractJpaEntity _super = new akuchars.domain.common.QAbstractJpaEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QShelf(String variable) {
        super(Shelf.class, forVariable(variable));
    }

    public QShelf(Path<? extends Shelf> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShelf(PathMetadata metadata) {
        super(Shelf.class, metadata);
    }

}

