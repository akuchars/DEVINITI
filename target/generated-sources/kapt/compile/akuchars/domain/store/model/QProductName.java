package akuchars.domain.store.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProductName is a Querydsl query type for ProductName
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QProductName extends BeanPath<ProductName> {

    private static final long serialVersionUID = -1159937542L;

    public static final QProductName productName = new QProductName("productName");

    public final StringPath value = createString("value");

    public QProductName(String variable) {
        super(ProductName.class, forVariable(variable));
    }

    public QProductName(Path<? extends ProductName> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductName(PathMetadata metadata) {
        super(ProductName.class, metadata);
    }

}

