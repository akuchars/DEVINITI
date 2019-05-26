package akuchars.domain.store.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderItemsAmount is a Querydsl query type for OrderItemsAmount
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QOrderItemsAmount extends BeanPath<OrderItemsAmount> {

    private static final long serialVersionUID = 159977002L;

    public static final QOrderItemsAmount orderItemsAmount = new QOrderItemsAmount("orderItemsAmount");

    public final NumberPath<Long> amount = createNumber("amount", Long.class);

    public QOrderItemsAmount(String variable) {
        super(OrderItemsAmount.class, forVariable(variable));
    }

    public QOrderItemsAmount(Path<? extends OrderItemsAmount> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderItemsAmount(PathMetadata metadata) {
        super(OrderItemsAmount.class, metadata);
    }

}

