package akuchars.kernel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lakuchars/kernel/ApplicationProperties;", "", "()V", "EMAIL_VALID_REGEX", "", "STORE_SCHEMA_NAME", "WAREHOUSE_SCHEMA_NAME", "devinity"})
public final class ApplicationProperties {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL_VALID_REGEX = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STORE_SCHEMA_NAME = "store";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WAREHOUSE_SCHEMA_NAME = "warehouse";
    public static final akuchars.kernel.ApplicationProperties INSTANCE = null;
    
    private ApplicationProperties() {
        super();
    }
}