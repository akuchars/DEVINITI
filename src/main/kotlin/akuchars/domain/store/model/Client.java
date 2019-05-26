package akuchars.domain.store.model;

import akuchars.domain.AbstractJpaEntity;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(schema = "store", name = "clients")
public class Client extends AbstractJpaEntity {

    private String name;
    private String surname;

    @OneToOne
    @JoinColumn(name = "address_id")
    private ClientAddress address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "email"))
    })
    private Email email;

    public Client(String name, String surname, ClientAddress address, Email email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
    }

    Client() {
    }
}
