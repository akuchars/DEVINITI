package akuchars.domain.store.model;

import javax.persistence.Embeddable;

@Embeddable
public class Email {

    private String value;

    public Email(String value) {
        this.value = value;
        //todo dodać walidację emaila
    }

    Email() {
    }
}
