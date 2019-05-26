package akuchars.domain.warehouse;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStillage is a Querydsl query type for Stillage
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStillage extends EntityPathBase<Stillage> {

    private static final long serialVersionUID = 1122880752L;

    public static final QStillage stillage = new QStillage("stillage");

    public final akuchars.domain.QAbstractJpaEntity _super = new akuchars.domain.QAbstractJpaEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QStillage(String variable) {
        super(Stillage.class, forVariable(variable));
    }

    public QStillage(Path<? extends Stillage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStillage(PathMetadata metadata) {
        super(Stillage.class, metadata);
    }

}

