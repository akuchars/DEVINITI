package akuchars.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import akuchars.domain.common.AbstractJpaEntity;


/**
 * QAbstractJpaEntity is a Querydsl query type for AbstractJpaEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractJpaEntity extends EntityPathBase<AbstractJpaEntity> {

    private static final long serialVersionUID = -1310215154L;

    public static final QAbstractJpaEntity abstractJpaEntity = new QAbstractJpaEntity("abstractJpaEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAbstractJpaEntity(String variable) {
        super(AbstractJpaEntity.class, forVariable(variable));
    }

    public QAbstractJpaEntity(Path<? extends AbstractJpaEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractJpaEntity(PathMetadata metadata) {
        super(AbstractJpaEntity.class, metadata);
    }

}

