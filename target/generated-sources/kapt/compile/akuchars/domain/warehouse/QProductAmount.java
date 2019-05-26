package akuchars.domain.warehouse;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProductAmount is a Querydsl query type for ProductAmount
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QProductAmount extends BeanPath<ProductAmount> {

    private static final long serialVersionUID = -1105061074L;

    public static final QProductAmount productAmount = new QProductAmount("productAmount");

    public final NumberPath<Long> amount = createNumber("amount", Long.class);

    public QProductAmount(String variable) {
        super(ProductAmount.class, forVariable(variable));
    }

    public QProductAmount(Path<? extends ProductAmount> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductAmount(PathMetadata metadata) {
        super(ProductAmount.class, metadata);
    }

}

