package akuchars.domain.store.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostalCode is a Querydsl query type for PostalCode
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPostalCode extends BeanPath<PostalCode> {

    private static final long serialVersionUID = -1580372104L;

    public static final QPostalCode postalCode1 = new QPostalCode("postalCode1");

    public final StringPath postalCode = createString("postalCode");

    public QPostalCode(String variable) {
        super(PostalCode.class, forVariable(variable));
    }

    public QPostalCode(Path<? extends PostalCode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostalCode(PathMetadata metadata) {
        super(PostalCode.class, metadata);
    }

}

