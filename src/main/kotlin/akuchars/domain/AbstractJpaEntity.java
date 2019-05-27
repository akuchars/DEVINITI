package akuchars.domain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;
import java.util.Objects;

import kotlin.jvm.internal.Intrinsics;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public AbstractJpaEntity() {
    }

    @NotNull
    public Long getId() {
        Intrinsics.checkParameterIsNotNull(id, "id");
        return id;
    }

    public void setId(@Nullable Long id) {
        Intrinsics.checkParameterIsNotNull(id, "id");
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractJpaEntity that = (AbstractJpaEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
