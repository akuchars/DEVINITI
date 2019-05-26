package akuchars.domain.store.model;

import com.mysema.commons.lang.Assert;
import kotlin.jvm.internal.Intrinsics;

import javax.persistence.Embeddable;

@Embeddable
public class PostalCode {

    private String postalCode;

    public PostalCode(String postalCode) {
        Intrinsics.checkParameterIsNotNull(postalCode, "postalCode");
        Assert.isTrue(postalCode.length() == 6, "Postal code must contain 6 chars");
        this.postalCode = postalCode;
    }

    PostalCode() {
    }
}
