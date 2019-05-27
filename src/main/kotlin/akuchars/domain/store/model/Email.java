package akuchars.domain.store.model;

import javax.persistence.Embeddable;

import kotlin.jvm.internal.Intrinsics;

@Embeddable
public class Email {

    private String value;

    public Email(String value) {
        Intrinsics.checkParameterIsNotNull(value, "value");

        this.value = value;
        //todo dodać walidację emaila
    }

    Email() {
    }
}
